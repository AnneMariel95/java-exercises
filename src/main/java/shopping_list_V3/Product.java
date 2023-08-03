package shopping_list_V3;

public abstract class Product {

    private String name;
    private double price;

    public Product(String _name, Double _price) {
        this.name = _name;
        this.price = _price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return this.price;
    }

}
