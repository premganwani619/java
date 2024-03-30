import java.util.*;

public class DecimalToBinary {

    public static void convertDecimalToBinary(int number) {
        StringBuilder sb = new StringBuilder("");

        while (number > 0) {
            sb.insert(0, number % 2);
            number /= 2;
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its binary representation");
        num = sc.nextInt();
        convertDecimalToBinary(num);
        sc.close();
    }

}