import java.util.Scanner;

public class Factorial {
    public static void calculateFactorial(int num) {
        if (num < 0) {
            System.err.println("Factorial of negative number is not possible");
            return;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("The Factorial is : " + factorial);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to calculate factorial of:");
        num = sc.nextInt();
        sc.close();
        calculateFactorial(num);
    }
}
