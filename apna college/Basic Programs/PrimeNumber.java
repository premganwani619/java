import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num, flag = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number to check weather it is prime or not");
        num = Sc.nextInt();
        Sc.close();
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0&&num>1) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}
