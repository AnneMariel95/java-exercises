package shopping_list_V3;

public abstract class Product {

    protected String name;
    protected double price;

    protected String id;

    public Product(String _id, String _name, Double _price) {
        this.id = _id;
        this.name = _name;
        this.price = _price;
    }

    public abstract double getAmount();

    public String getId() {
        return id;
    }
}
