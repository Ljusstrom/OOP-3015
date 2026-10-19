public class Example1 {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = 0.123;

        int x;
        x = 5;
        System.out.println(x);


        char merkki = 'a';
        System.out.println(merkki);

        String merkkijono = "Matti Valovirta";
        System.out.println(merkkijono);

        //x = "Cat"; // Will not compile, cannot change type

        int averageSalary = 2375;
        //System.out.println(averageSallary); // invalid, will not compile

        /*
        Several line comment
        that can span several lines.
         */

        int _1x; // technically fine, but doesn't tell about the contents. bad!
        int x1;



        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2f);
        System.out.println(10 % 2);

        x1 = 3;
        x1 *= 3;
        System.out.println(x1);

        System.out.println(2 * CONVERSION_FACTOR);

    }
}
