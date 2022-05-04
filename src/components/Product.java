package components;

import java.util.List;

public class Product {
    private String name, unityOfMeasurement;
    private List<String> ingredients;
    private long price, quantity;

    public Product(String name, String unityOfMeasurement, List<String> ingredients, long price, long quantity) {
        this.name = name;
        this.unityOfMeasurement = unityOfMeasurement;
        this.ingredients = ingredients;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {}

    public Product(String name, List<Product> products, Boolean isPerishable) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnityOfMeasurement() {
        return unityOfMeasurement;
    }

    public void setUnityOfMeasurement(String unityOfMeasurement) {
        this.unityOfMeasurement = unityOfMeasurement;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public void addIngredient(String newIngredient) {
        ingredients.add(newIngredient);
    }

    public void removeIngredient(long index) {
        ingredients.remove(index);
    }
}
