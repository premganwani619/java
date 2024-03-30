import java.util.Scanner;

public class GreaterOrLesser {
    public static void main(String[] args) {
        int a, b;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of number a:");
        a = Sc.nextInt();
        System.out.println("Enter the value of number b:");
        b = Sc.nextInt();

        if (a > b) {
            System.out.println("a is Greater number");
        } else if (a < b) {
            System.out.println("a is Smaller number");
        } else {
            System.out.println("a is euqal to b");
        }
        Sc.close();
    }
}
