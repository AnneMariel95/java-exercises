package array;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("magenta");
        colors.add("pink");
        colors.add("mauve");
        colors.add("cinnamon");
        colors.add("black");
        colors.add("mahogany");
        colors.add("gold");
        colors.add("aquamarine");

        System.out.println("Which color are you searching for?");
        String colorOfChoice = scanner.next();
        scanner.close();

        // Filtering colors using streams
//        List<String> filteredColors = colors.stream()
//                .filter(string -> string.contains(colorOfChoice))
//                .collect(Collectors.toList());
//        System.out.println(filteredColors);

        // Create a new arrayList of Strings called filteredColors.
        ArrayList<String> filteredColors = new ArrayList<>();

        for (int i = 0; i < colors.size(); i++) {
            // Add the element based on colorOfChoice to filteredColors.

            if (colors.get(i).contains(colorOfChoice)) {
                filteredColors.add(colors.get(i));
            }
        }

        // Print all the colors inside the filteredColors arrayList.
        for (int i = 0; i < filteredColors.size(); i++) {
            System.out.println((i + 1) + ". " + filteredColors.get(i));
        }
    }
}


