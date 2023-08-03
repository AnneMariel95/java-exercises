package shopping_list_V3;

public class WeightedProduct extends Product {

    private double weight;

    public WeightedProduct(String _name, double _weight, double _price) {
        super(_name, _price);
        this.weight = _weight;
    };

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount(){
        return this.weight * this.getPrice();
    };

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Price/kg: " + this.getPrice() + ", Total Weight: " + this.weight + ", Total Price: " + this.getAmount();
    }

}
