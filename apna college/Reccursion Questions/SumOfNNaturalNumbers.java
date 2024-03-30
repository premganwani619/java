public class SumOfNNaturalNumbers {
    public static void sumOfNNaturalNumbers(int sum,int n) {
        if (n==1) {
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=n;
        sumOfNNaturalNumbers(sum, n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        sumOfNNaturalNumbers(0,n);
    }
}
