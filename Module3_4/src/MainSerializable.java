import java.io.*;

import java.io.Serializable;

class Person implements Serializable {
    private String firstname;
    private String lastname;
    private int birthYear;

    public Person() {
        firstname = "";
        lastname = "";
        birthYear = 0;
    }

    public Person(String firstname, String lastname, int birthYear) {
        this.firstname = firstname;
        this.lastname  = lastname;
        this.birthYear = birthYear;
    }

    public String getName() {
        return firstname + " " + lastname;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + birthYear + " years";
    }
}

public class MainSerializable {
    private final static String FILENAME = "person.dat";
    public static void main(String[] args) {
        File f = new File(FILENAME);
        Person person = new Person();

        if (f.exists() && f.isFile()) {
            System.out.println("file exists. try to read Person from it.");
            // we have objects state stored to the file, read it
            try (
                    FileInputStream inputstream = new FileInputStream(FILENAME);
                    ObjectInputStream objects = new ObjectInputStream(inputstream);
            ) {
                person = (Person) objects.readObject();
            } catch (Exception e) {
                System.err.println("Reading person: " + e);
            }
        } else {
            // there are no stored object state, let's create an object
            person = new Person("Enzio", "Benzio", 2002);
            try (
                    FileOutputStream outputstream = new FileOutputStream(FILENAME);
                    ObjectOutputStream objects = new ObjectOutputStream(outputstream);
            ) {
                objects.writeObject(person);
            } catch (Exception e) {
                System.err.println("Writing person: " + e);
            }
        }

        System.out.println("Person: " + person);
    }
}