package components;

import java.util.List;

public class Category extends Product {
    protected String name;
    protected List<Product> products;
    Boolean isPerishable;

    public Category(String name, List<Product> products, Boolean isPerishable) {
        super(name, products, isPerishable);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Boolean getIsPerishable() {
        return isPerishable;
    }

    public void setIsPerishable(Boolean isPerishable) {
        this.isPerishable = isPerishable;
    }

    public void showAllProductsFromACategory()
    {
        System.out.println("Category name: " + name);
        for (int i = 0; i < products.size(); i++)
        {
            System.out.println(products.get(i));
        }
    }
}
