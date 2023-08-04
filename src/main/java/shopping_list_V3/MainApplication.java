package shopping_list_V3;

public class MainApplication {
    public static void main(String[] args) {
        ShoppingList myShoppingList = new ShoppingList();
        Product apple = new Apple("1234", "Apple", 5, 22);
        myShoppingList.addItem(apple);
        Product banana = new Banana("1235", "Banana", 10, 20);
        myShoppingList.addItem(banana);
        Product cake = new Cake("1234","Strawberry Cake", 5, 25);
        myShoppingList.addItem(cake);
        Product doritos = new Doritos("3456", "Doritos", 46, 33);
        myShoppingList.addItem(doritos);
        System.out.println(myShoppingList.printReceipt());
    }
}
