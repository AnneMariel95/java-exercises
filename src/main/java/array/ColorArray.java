package array;

import java.util.Scanner;

public class ColorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] colors = new String[10];
        colors[0] = "red";
        colors[1] = "yellow";
        colors[2] = "magenta";
        colors[3] = "pink";
        colors[4] = "mauve";
        colors[5] = "cinnamon";
        colors[6] = "black";
        colors[7] = "mahogany";
        colors[8] = "gold";
        colors[9] = "aquamarine";

        System.out.println("Which color are you searching for?");
        String colorOfChoice = scanner.next();
        scanner.close();

        for (String element : colors) {
            if (element.contains(colorOfChoice)) {
                System.out.println(element);
            }
        }
    }
}
