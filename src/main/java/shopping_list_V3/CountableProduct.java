package shopping_list_V3;

public class CountableProduct extends Product{

    private double quantity;

    CountableProduct(String _id, String _name, int _quantity, double _price){
        super(_id, _name, _price);
        this.quantity = _quantity;
    };

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount(){
        return quantity * this.price;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", Quantity: " + getQuantity() + ", Price " + this.price + ", Total Price: " + this.price;
    }
}
