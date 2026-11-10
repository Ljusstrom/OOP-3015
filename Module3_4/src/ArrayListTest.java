import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        /*ArrayList<String> list = new ArrayList<>();
        list.add("Matti");
        list.remove("Jarkko"); // Does nothing, no exception
        */

        int[] array = new int[3];

        try {
            array[3] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
