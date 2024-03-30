import java.util.*;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, position;
        System.out.println("Enter the number that you want to set bit of");
        number = sc.nextInt();
        System.out.println("Enter the positiion for which you want to set bit");
        position = sc.nextInt();
        int bitMask = 1 << position;
        number = number | bitMask;
        System.out.println("Updated number after setting the bit at position " + position + ": " + number);
        sc.close();
    }
}
