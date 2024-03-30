public class XToThePowerN {
    public static int xToThePowerN(int x, int n) {

        if (x == 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }
        return x * xToThePowerN(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(xToThePowerN(5, 3));
    }
}
