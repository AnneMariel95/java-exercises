package encapsulation;

public class PersonWithEncapsulation {

    private String firstName;
    private String lastName;
    private String gender;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String _firstName) {
        this.firstName = _firstName.trim();
        if (!_firstName.equals(_firstName.trim()))
            System.out.println("Auto correcting first name");
    }

    public String getLastName() {
        if (gender == "Male") {
            return "Mr. " + this.lastName;
        } else {
            return "Ms " + this.lastName;
        }
    }

    public void setLastName(String _lastName) {
        this.lastName = _lastName.trim();
        if (!_lastName.equals(_lastName.trim()))
            System.out.println("Auto correcting last name");
    }

    public String getGender() {
        return this.gender;
    }

    public PersonWithEncapsulation(String first_name, String last_name, String gender_) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.gender = gender_;
    }

    public static void main(String[] args) {
        PersonWithEncapsulation person = new PersonWithEncapsulation("A", "M", "Female");

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getGender());

        person.setFirstName("  John");
        person.setLastName("Doe ");

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }
}
