import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        System.out.println(listOfNumbers);

        ArrayList<Integer> anotherList = new ArrayList<>();
        anotherList.add(100);
        anotherList.add(102);
        System.out.println(anotherList);

        anotherList = listOfNumbers; // make one variable reference another
        System.out.println(listOfNumbers); // should print [1, 2]
        System.out.println(anotherList);   // should print [1, 2]
    }
}
