package classAndObjectExercise;

public class MainApplication{
    public static void main(String[] args) {
        Food spaghetti = new Food("pasta", 5, 100);
        Food macaroni = new Food("pasta", 3, 90);

        System.out.println(spaghetti.getTotalCalories());
        System.out.println(macaroni.getTotalCalories());

//        System.out.println("Total Calories: " + (spaghetti.getTotalCalories() + macaroni.getTotalCalories()));
    }
}
