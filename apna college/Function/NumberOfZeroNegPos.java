import java.util.Scanner;

public class NumberOfZeroNegPos {

    public static void main(String args[]) {

        int num, condition = 1, zero = 0, neg = 0, pos = 0;
        Scanner sc = new Scanner(System.in);
        while (condition != 0) {

            System.out.println("Enter the number");
            num = sc.nextInt();
            if (num == 0) {
                zero++;
            } else if (num > 0) {
                pos++;
            } else {
                neg++;
            }
            System.out.println("Enter any number to continue and 0 to exit");
            condition = sc.nextInt();
        }
        sc.close();
        System.out.println("zero: " + zero + " pos: " + pos + " neg: " + neg);

    }
}
