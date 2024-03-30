public class XToThePowerNOptimized {
    public static int xToThePowerN(int x, int n) {

        if (x == 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }
        int val = xToThePowerN(x, n / 2) * xToThePowerN(x, n / 2);
        if (n % 2 == 1) {
            val *= x;
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(xToThePowerN(5, 3));
    }
}
