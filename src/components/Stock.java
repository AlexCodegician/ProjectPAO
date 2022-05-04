package components;

import java.util.Set;

public class Stock {
    private Set<pairProductQuantity> productsInStock;
    private Date liquidationDate;

    public Stock(Set<pairProductQuantity> productsInStock, Date liquidationDate) {
        this.productsInStock = productsInStock;
        this.liquidationDate = liquidationDate;
    }

    public Set<pairProductQuantity> getProductsInStock() {
        return productsInStock;
    }

    public void setProductsInStock(Set<pairProductQuantity> productsInStock) {
        this.productsInStock = productsInStock;
    }

    public Date getLiquidationDate() {
        return liquidationDate;
    }

    public void setLiquidationDate(Date liquidationDate) {
        this.liquidationDate = liquidationDate;
    }

    public void showAllProductsFromStock()
    {
        for (pairProductQuantity x : productsInStock)
        {
            System.out.println(x);
        }
    }
}
