package components;

import java.util.List;

public class Order {
    private List<pairProductQuantity> productsOrdered;
    private long price;
    private Date dateOfOrder;
    private Employee deliveryGuy;

    public Order() {}

    public Order(List<pairProductQuantity> productsOrdered, long price, Date dateOfOrder, Employee deliveryGuy) {
        this.productsOrdered = productsOrdered;
        this.price = price;
        this.dateOfOrder = dateOfOrder;
        this.deliveryGuy = deliveryGuy;
    }

    public List<pairProductQuantity> getProductsOrdered() {
        return productsOrdered;
    }

    public void setProductsOrdered(List<pairProductQuantity> productsOrdered) {
        this.productsOrdered = productsOrdered;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public Employee getDeliveryGuy() {
        return deliveryGuy;
    }

    public void setDeliveryGuy(Employee deliveryGuy) {
        this.deliveryGuy = deliveryGuy;
    }

    public long sumOfOrder()
    {
        long sum = 0;
        for (int i = 0; i < productsOrdered.size(); i++)
        {
            sum = sum + productsOrdered.get(i).getQuantity() * productsOrdered.get(i).getProduct().getPrice();
        }
        return sum;
    }
}
