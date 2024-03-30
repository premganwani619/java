public class TilingProblem {

    public static int tilingProblem(int n, int m) {
        if (n<m) {
            return 1;
        }
        if (n==m) {
            return 2;
        }
        return tilingProblem(n-1, m) + tilingProblem(n - m, m);
    }

    public static void main(String[] args) {
        int n = 4, m = 3;
        int numberOfWays = tilingProblem(n, m);
        System.out.println(numberOfWays);
    }
}