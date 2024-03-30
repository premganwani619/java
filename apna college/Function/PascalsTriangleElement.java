public class PascalsTriangleElement {
    public static long CalculateNCR(int n, int c) {
        long result = 1;
        for (int i = 0; i < c; i++) {
            result *= n-i;
            result /= i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 4;
        long result;
        result = CalculateNCR(n-1, r-1);
        System.out.println(result);
    }
}
