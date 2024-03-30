import java.util.Scanner;

public class ToggleBitAtAGivenPosition {

    public static int toggleBit(int n, int pos) {
        // Create a mask with only the bit at the specified position set to 1
        int mask = 1 << pos;

        // Toggle the bit using XOR
        return n ^ mask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Input the position of the bit to toggle
        System.out.print("Enter the position of the bit to toggle: ");
        int position = sc.nextInt();

        // Toggle the bit at the specified position
        int result = toggleBit(number, position);

        // Display the result
        System.out.println("Number after toggling the bit at position " + position + ": " + result);

        sc.close();
    }
}


//11
//01