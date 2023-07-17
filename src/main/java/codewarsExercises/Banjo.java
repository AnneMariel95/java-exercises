package codewarsExercises;

public class Banjo {
    public static void main(String[] args) {
        String name1 = "rey";
        String name2 = "Bey";
        System.out.println(areYouPlayingBanjo(name1));
        System.out.println(areYouPlayingBanjo(name2));
    }

    public static String areYouPlayingBanjo(String name) {
        if (name.charAt(0) == 'R' || name.charAt(0) == 'r') {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}