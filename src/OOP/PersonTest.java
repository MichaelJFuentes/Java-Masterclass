package OOP;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("");
        person1.setLastName("");
        person1.setAge(10);
        System.out.println("fullName= " + person1.getFullName());
        System.out.println("teen= " + person1.isTeen());


        // person two
        person1.setFirstName("John");
        person1.setAge(18);
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println("FullName= " + person1.getFullName());
        System.out.println("teen= " + person1.isTeen());
        person1.setLastName("Smith");
        System.out.println("FullName= " + person1.getFullName());

        // testing the null of a name
        System.out.println();
        Person p2 = new Person();
        if (p2.getFirstName() == null) {
            System.out.println("First name is null");
        } else if (p2.getFirstName().isEmpty()) {
            System.out.println("First name is empty");
        } else if (p2.getFirstName().isBlank()) {
            System.out.println("first name is blank");
        }
    }
}
