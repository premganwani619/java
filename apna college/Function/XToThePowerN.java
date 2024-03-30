import java.util.Scanner;

public class XToThePowerN {
    public static void calcXToThePowerN(int x, int n) {
        int val = x;
        while (n != 1) {
            val *= x;
            n--;
        }
        System.out.println(val);
    }

    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        calcXToThePowerN(x, n);

    }
}
