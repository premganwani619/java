import java.util.*;

public class Bits {
    public static boolean checkNumber(int number) {
        int numberofones = 0;
        StringBuilder sb = new StringBuilder("");

        while (number > 0) {
            sb.insert(0, (number % 2));
            number /= 2;
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                numberofones++;
            }
        }
        if (numberofones==1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is in power of 2 or not");
        num = sc.nextInt();
        if (checkNumber(num)) {
            System.out.println("The number is a power of Two");
        } else {
            System.out.println("The number is not a power of Two");

        }
        sc.close();
    }

}

//More Optimized

//import java.util.Scanner;

// public class Bits {
//     public static boolean isPowerOfTwo(int number) {
//         return (number > 0) && ((number & (number - 1)) == 0);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number to check whether it is a power of 2 or not:");
//         int num = sc.nextInt();

//         if (isPowerOfTwo(num)) {
//             System.out.println("The number is a power of 2.");
//         } else {
//             System.out.println("The number is not a power of 2.");
//         }

//         sc.close();
//     }
// }


