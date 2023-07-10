package classAndObjectExercise;

public class Food {
    private String myType;
    private int myQuantity;
    private double myCalories;

    public Food(String foodType, int quantity, double calories){
        myType = foodType;
        myQuantity = quantity;
        myCalories = calories;

        System.out.println("Food type is " + foodType);
    }
    public double getTotalCalories(){
        return myQuantity * myCalories;
    }
}
