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

    String greet(String name, String _language) {
        return createGreeting(_language) + ", " + name;
    }

    String greet(String name, String _language, boolean isEnergetic) {
        if (isEnergetic == true) {
            return greet(name, _language) + "!!!";
        } else {
            // Referenced String greet(String name, String _language)
            return greet(name, _language);
        }
    }

    String greet(String name, boolean isEnergetic) {
        // Referenced String greet(String name, String _language, boolean isEnergetic).
        // Reused global variable language to match parameter requirement.
        return greet(name, this.language, isEnergetic);
    }
}




