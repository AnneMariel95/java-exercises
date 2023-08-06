package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ShoppingList {
    private Set<String> myShoppingList;

    public ShoppingList() {
        this.myShoppingList = new HashSet<>();
    }

    public ShoppingList(Set<String> defaultList) {
        this.myShoppingList = defaultList;
    }

    public String getPrintableList() {
        String returnValue = "";
        Iterator<String> myShoppingListIterator = myShoppingList.iterator();
        while (myShoppingListIterator.hasNext()) {
            returnValue = returnValue + myShoppingListIterator.next();

            if (myShoppingListIterator.hasNext()) {
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

