public class PascalsTriangleLastRow {
    public static int CalculateNCR(int n, int c) {
        int result = 1;
        for (int i = 0; i < c; i++) {
            result *= n - i;
            result /= i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int result;
        for (int r = 1; r <= n; r++) {
            result = CalculateNCR(n - 1, r - 1);
            System.out.print(result+" ");
        }

    }
}
