package shopping_list_V3;

public class CountableProduct extends Product{

    private double quantity;

    CountableProduct(String _name, int _quantity, double _price){
        super(_name, _price);
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
        return quantity * getPrice();
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + ", Quantity: " + getQuantity() + ", Price " + getPrice() + ", Total Price: " + this.getPrice();
    }
}
