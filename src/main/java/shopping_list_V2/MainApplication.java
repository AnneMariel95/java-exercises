package shopping_list_V2;

public class MainApplication {
    public static void main(String[] args) {
        ShoppingList foodList = new ShoppingList();
        ShoppingItem apple = new ShoppingItem("apple", 1);
        foodList.addItem(apple);
        ShoppingItem banana = new ShoppingItem("banana", 2);
        foodList.addItem(banana);
        ShoppingItem carrot = new ShoppingItem("carrot", 3);
        foodList.addItem(carrot);
        System.out.println(foodList.toString());

    }
}
