package components;

import java.util.List;

public class Distributor extends Product{
    protected List<Product> products;
    protected String name;
    protected Address address;

    public Distributor(String name, String unityOfMeasurement, List<String> ingredients, long price, long quantity) {
        super(name, unityOfMeasurement, ingredients, price, quantity);
    }

    public Distributor() {
        super();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    public void removeProduct(long index) {
        products.remove(index);
    }
}
