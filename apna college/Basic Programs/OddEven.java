import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int num;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = Sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        Sc.close();

    }
}
