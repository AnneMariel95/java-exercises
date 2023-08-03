package shopping_list_V3;

import shopping_list_V2.ShoppingItem;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<Product> myList;

    public ShoppingList() {
        this.myList = new ArrayList<>();
    }

    public void addItem(Product productToAdd) {
        this.myList.add(productToAdd);
    }

    public String printReceipt() {
        String receiptMessage = "";
        for (int i = 0; i <= myList.size(); i++) {
            return receiptMessage = receiptMessage + myList.get(i).toString() + "\n";
        }
        return receiptMessage;
    }
}