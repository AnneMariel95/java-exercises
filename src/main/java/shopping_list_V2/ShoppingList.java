package shopping_list_V2;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<ShoppingItem> myShoppingList;

    public ShoppingList() {
        this.myShoppingList = new ArrayList<>();
    }

    @Override
    public String toString() {
        String returnValue = "";
        for (int i = 0; i < myShoppingList.size(); i++) {
            returnValue = returnValue + myShoppingList.get(i).toString() + "\n";
        }
        return returnValue;
    }

    public void addItem(ShoppingItem itemToAdd) {
        this.myShoppingList.add(itemToAdd);
    }
}
