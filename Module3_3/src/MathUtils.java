public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = MathUtils.add(5, 3); // Calling static method directly using class name
        System.out.println("Result: " + result);

        System.out.println("Random number: " + Math.random());
    }
}