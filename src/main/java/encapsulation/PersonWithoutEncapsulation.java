package encapsulation;

import javax.print.DocFlavor;

public class PersonWithoutEncapsulation {
    public String firstName;
    public String lastName;
    public String gender;

    //Constructor has the same name as the class name.
    public PersonWithoutEncapsulation(String _firstName, String _lastName, String _gender) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.gender = _gender;
    }

    public static void main(String[] args) {
        //Create a main method that contains an object of type PersonWithoutEncapsulation
        PersonWithoutEncapsulation person = new PersonWithoutEncapsulation("Mariel", "Catapang", "Female");
        System.out.println(person.firstName);
        System.out.println(person.lastName);
        person.gender = "Male";
        System.out.println(person.gender);
    }
}
