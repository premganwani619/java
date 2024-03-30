import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, position, bit;
        System.out.println("Enter the number that you want to update bit of");
        number = sc.nextInt();
        System.out.println("Enter the positiion for which you want to Update bit");
        position = sc.nextInt();
        System.out.println("Enter the bit that you want to set");
        bit = sc.nextInt();
        int bitMask = 1 << position;
        int newBitMask = ~bitMask;
        if (bit == 0) {
            number = number & newBitMask;
        } else {
            number = number | bitMask;
        }
        System.out.println("Updated number after setting the bit at position " + position + ": " + number);
        sc.close();
    }
}
