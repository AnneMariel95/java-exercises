package shopping_list_V3;

public class WeightedProduct extends Product {

    private double weight;

    public WeightedProduct(String _id, String _name, double _weight, double _price) {
        super(_id, _name, _price);
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
        return this.weight * this.price;
    };

    @Override
    public String toString() {
        return "Name: " + this.name + ", Price/kg: " + this.price + ", Total Weight: " + this.weight + ", Total Price: " + this.getAmount();
    }

}
