public class NthFibonacci {
    public static int nthFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return nthFibonacci(n - 1) + nthFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int ans = nthFibonacci(5);
        System.out.println(ans);
    }
}


/*
fib(5)=5
fib(4)=3
fib(3)=2
fib(2)=1
fib(1)=1
fib(0)=0
*/ 