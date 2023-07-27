package encapsulation;

public class MainApplication {

    public static void main(String[] args) {
        Greeter multiLingualPerson = new Greeter();
        System.out.println(multiLingualPerson.greet());
        System.out.println(multiLingualPerson.greet("John"));
        System.out.println(multiLingualPerson.greet("John", "French"));
        System.out.println(multiLingualPerson.greet("John", "Spanish", true));
        System.out.println(multiLingualPerson.greet("John", "Spanish", false));
        System.out.println(multiLingualPerson.greet("John", true));

        Greeter spanishSpeaker = new Greeter("Spanish");
        System.out.println(spanishSpeaker.greet());
        System.out.println(spanishSpeaker.greet("John"));
        System.out.println(spanishSpeaker.greet("John", true));

    }
}
