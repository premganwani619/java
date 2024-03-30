import java.util.Scanner;

public class OddNumbers {
    public static void printOddNumbers(int input) {
        for (int i = 1; i < input; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want odd numbers");
        input = sc.nextInt();
        sc.close();
        printOddNumbers(input);
    }
}
