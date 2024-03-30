import java.util.*;

public class GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, position;
        System.out.println("Enter the number that you want to check bit of");
        number = sc.nextInt();
        System.out.println("Enter the positiion for which you want to check bit");
        position = sc.nextInt();
        int bitMask = 1 << position;
        if ((number & bitMask) == 0) {
            System.out.println("Bit is 0");
        } else {
            System.out.println("Bit is 1");

        }
        sc.close();
    }
}
