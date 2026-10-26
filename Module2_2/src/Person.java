import java.util.ArrayList;
import java.util.List;


public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    }

    public static void goThrough(ArrayList<Person> persons) {
        // Access object properties and methods
        /*for (int i=0; i<persons.size(); i++) {
            persons.get(i).introduce();
        }*/
        for (Person p : persons) {
            p.introduce();
        }
    }

    public static void main(String[] args) {
        // Create multiple Person objects
        ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        personList.add(new Person("Charlie", 22));
        personList.add(new Person("Lily", 32));

        // Remove "bob" from the list
        personList.remove(1);

        // Print out all the elements in the list
        Person.goThrough(personList);
    }
}