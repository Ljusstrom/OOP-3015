import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a character:");
        char character = scanner.nextLine().toLowerCase().charAt(0);

        switch (character) {
            case 'w':
            case 'i':
                System.out.println("Move up");
                break;

            case 'a':
            case 'j':
                System.out.println("Move left");
                break;

            case 's':
            case 'k':
                System.out.println("Move down");
                break;

            case 'd':
            case 'l':
                System.out.println("Move right");
                break;
        }
    }
}
