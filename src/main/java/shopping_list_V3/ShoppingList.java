package shopping_list_V3;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<Product> myList;

    public ShoppingList() {
        this.myList = new ArrayList<>();
    }

    public void addItem(Product productToAdd) {
        int indexOfProductToUpdate = -1;
        for (int i = 0; i < myList.size(); i++) {
            if (productToAdd.getId() == myList.get(i).getId()) {
                indexOfProductToUpdate = i;
                break;
            }
        }
        if (indexOfProductToUpdate == -1) {
            myList.add(productToAdd);
        } else {
            myList.set(indexOfProductToUpdate, productToAdd);
            System.out.println("The product is already existing. Updating");
        }
    }

    public String printReceipt() {
        String receiptMessage = "";
        for (int i = 0; i < myList.size(); i++) {
            receiptMessage = receiptMessage + myList.get(i).toString() + "\n";
        }
        return receiptMessage;
    }
}
