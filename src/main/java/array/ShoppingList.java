package array;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<String> myShoppingList = new ArrayList<>();

    public ShoppingList() {
        this.myShoppingList = new ArrayList<>();
    }

    public ShoppingList(ArrayList<String> defaultList) {
        this.myShoppingList = defaultList;
    }

    public String getPrintableList() {
        String returnValue = "";
        for (int i = 0; i < myShoppingList.size(); i++) {
            returnValue = returnValue + myShoppingList.get(i);
            if (i != myShoppingList.size() - 1) {
                returnValue = returnValue + ", ";
            }
        }
        return returnValue;
    }

    public void addItem(String itemToAdd) {
        if (!this.myShoppingList.contains(itemToAdd)) {
            this.myShoppingList.add(itemToAdd);
        } else System.out.println(itemToAdd + " already exists.");
    }

    public void removeItem(String itemToRemove) {
        if (this.myShoppingList.contains(itemToRemove)) {
            this.myShoppingList.remove(itemToRemove);
        } else if (!this.myShoppingList.contains(itemToRemove)) {
            System.out.println(itemToRemove + " does not exist.");
        }
    }
}

