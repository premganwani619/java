import java.util.*;

public class BinaryToDecimal {
    public static int calcTwoToThePowerN(int n) {
        if (n==0) {
            return 1;
        }
        int val = 2;
        while (n != 1) {
            val *= 2;
            n--;
        }
        return val;
    }

    public static void convertBinaryToDecimal(StringBuilder num) {
        int number = 0;
        int power;
        for (int i = num.length() - 1,j=0; i >= 0; i--,j++) {
            power = calcTwoToThePowerN(j);
            number += (Integer.parseInt(num.toString())) * power;
        }
        System.out.println(number);

    }

    public static void main(String[] args) {
        StringBuilder num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary number to get its Decimal representation");
        num = new StringBuilder(sc.next());
        convertBinaryToDecimal(num);
        sc.close();
    }

}
