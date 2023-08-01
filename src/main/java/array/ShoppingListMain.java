package array;

import java.util.ArrayList;

public class ShoppingListMain {

    public static void main(String[] args) {

        ShoppingList food = new ShoppingList();
        food.addItem("Egg");
        food.addItem("Beef");
        food.addItem("Salt");
        food.addItem("Pepper");
        food.addItem("Soap");
        food.addItem("Cheese");
        food.removeItem("Soap");
        System.out.println(food.getPrintableList());

        ArrayList<String> initialDailyItems = new ArrayList<>();
        initialDailyItems.add("Soap");
        initialDailyItems.add("Tissue");
        initialDailyItems.add("Comb");

        ShoppingList dailyItems = new ShoppingList(initialDailyItems);
        dailyItems.addItem("Shampoo");
        dailyItems.addItem("Conditioner");
        dailyItems.addItem("Spinach");
        dailyItems.addItem("Towel");
        dailyItems.addItem("Egg");
        dailyItems.addItem("Pork");
        dailyItems.removeItem("Spinach");
        dailyItems.removeItem("Egg");
        dailyItems.removeItem("Pork");

        System.out.println(dailyItems.getPrintableList());
    }
}


