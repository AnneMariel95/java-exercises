package encapsulation;

public class Greeter {

    private String language;

    public Greeter() {
        this.language = "English";
    }

    public Greeter(String defaultLanguage) {
        this.language = defaultLanguage;
    }

    private String createGreeting(String language) {
        if (language == "English") {
            return "Hello";
        } else if (language == "French") {
            return "Bonjour";
        } else if (language == "Spanish") {
            return "Hola";
        } else {
            return "...";
        }
    }

    public String greet() {
        return createGreeting(this.language);
    }

    String greet(String name) {
        return createGreeting(this.language) + ", " + name;
    }

    String greet(String name, String language) {
        return createGreeting(language) + ", " + name;
    }

    String greet(String name, String language, boolean isEnergetic) {
        if (isEnergetic == true) {
            return createGreeting(language) + ", " + name + "!!!";
        } else {
            return createGreeting(language) + ", " + name;
        }
    }

    String greet(String name, boolean isEnergetic) {
        if (isEnergetic == true) {
            return createGreeting(language) + ", " + name + "!!!";
        } else {
            return createGreeting(language) + ", " + name;
        }
    }
}




