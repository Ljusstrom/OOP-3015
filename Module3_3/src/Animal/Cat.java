package Animal;

public class Cat extends Animal {
    private String name;
    private static int legs = 4;

    public Cat(String name) {
        this.name = name;
    }

    public void printCatDetails() {
        System.out.println("Animal.Cat's name is " + name + " and it has " + legs + " legs");
    }

    public static void setLegs(int newLegs) {
        legs = newLegs;
    }

    public static int getLegs() {return legs;}

    @Override
    public void makeSound() {
        System.out.println("Cat meows...");
    }

}



