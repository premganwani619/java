import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        int age;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = Sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

        Sc.close();

    }
}
