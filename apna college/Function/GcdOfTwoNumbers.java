public class GcdOfTwoNumbers {
    public static int gCD(int num1, int num2) {
        int gcd = 1;
        int min = num1 <= num2 ? num1 : num2;
        for (int i = 2; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int result = gCD(25, 50);
        System.out.println(result);
    }
}
