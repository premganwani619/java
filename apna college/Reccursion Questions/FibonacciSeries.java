public class FibonacciSeries {
    public static void fibonacciSeries(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonacciSeries(b, c, n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("0 1 ");
        fibonacciSeries(0, 1, n - 2);
    }
}