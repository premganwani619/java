import java.util.*;

public class NumberOfOnesInBinaryRepresantation {

    public static int countNumberOfOnes(int number) {
        int numberofones = 0;
        StringBuilder sb = new StringBuilder("");

        while (number > 0) {
            sb.append(number % 2);
            number /= 2;
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                numberofones++;
            }
        }

        return numberofones;
    }

    public static void main(String[] args) {
        int num, count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get number of ones in its binary representation");
        num = sc.nextInt();
        count = countNumberOfOnes(num);
        System.out.println(count);
        sc.close();
    }

}
