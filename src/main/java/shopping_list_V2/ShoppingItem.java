package shopping_list_V2;

import array.ShoppingList;

public class ShoppingItem {

    private String itemName;

    private int quantity;

    public ShoppingItem(String _itemName, int _quantity) {
        this.itemName = _itemName;
        this.quantity = _quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return itemName + ": " + quantity + "x";
    }
}
