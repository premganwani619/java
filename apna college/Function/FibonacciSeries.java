public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 5;
        int c;
        System.out.print(a+" "+b+" ");
        while (n > 2) {
            c = a + b;
            System.out.print(c+" ");
            a=b;
            b=c;
            n--;
        }
    }
}
