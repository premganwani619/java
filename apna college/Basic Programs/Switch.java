import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int button;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press any button");

        try {
            button = sc.nextInt();
            switch (button) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Namaste");
                    break;
                case 3:
                    System.out.println("Bonjour");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input. Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}
