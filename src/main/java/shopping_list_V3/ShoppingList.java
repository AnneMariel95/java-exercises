package shopping_list_V3;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {

    private Map<String, Product> myMap;

    public ShoppingList() {
        this.myMap = new HashMap<>();
    }

    public void addItem(Product productToAdd) {
        if (myMap.containsKey(productToAdd.id)) {
            System.out.println("The product is already existing. Updating");
        }
        myMap.put(productToAdd.id, productToAdd);
    }

    public String printReceipt() {
        String receiptMessage = "";
        for (Map.Entry<String, Product> entry : myMap.entrySet()) {
            receiptMessage = receiptMessage + entry.getValue() + "\n";
        }
        return receiptMessage;
    }
}
