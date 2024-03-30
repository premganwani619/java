import java.util.Scanner;
import java.util.InputMismatchException;

public class SumOfNNaturals {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want the sum of natural numbers");
        try {
            num = sc.nextInt();
            if (num <= 0) {
                throw new InputMismatchException("Please enter a valid positive integer");
            } else {
                for (int i = 1; i <= num; i++) {
                    sum += i;
                }
                System.out.println("The sum is : " + sum);
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}
