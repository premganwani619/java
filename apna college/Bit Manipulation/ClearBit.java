import java.util.*;

public class ClearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, position;
        System.out.println("Enter the number that you want to clear bit of");
        number = sc.nextInt();
        System.out.println("Enter the positiion for which you want to clear bit");
        position = sc.nextInt();
        int bitMask = 1 << position;
        int newBitMask = ~bitMask;
        number = number & newBitMask;
        System.out.println("Updated number after setting the bit at position " + position + ": " + number);
        sc.close();
    }
}
