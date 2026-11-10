import java.util.Scanner;

public class ArithmeticExceptionTest {

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("divide 3 by 2: " + div(3, 2));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give int a: ");
        int intA = Integer.parseInt(scanner.nextLine());

        System.out.println("Give int b: ");
        int intB = Integer.parseInt(scanner.nextLine());

        try {
            System.out.println("divide " + intA + " by " + intB + ": " + div(intA, intB));
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic exception, for example divide by zero.");
            //System.exit(-1);
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
