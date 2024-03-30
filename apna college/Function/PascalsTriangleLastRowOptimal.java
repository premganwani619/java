public class PascalsTriangleLastRowOptimal {

    public static void main(String[] args) {
        int n = 5, value = 1;
        System.out.print("1 ");
        for (int i = 1; i < n; i++) {
            value *= n - i;
            value /= i;
            System.out.print(value + " ");
        }
    }
}
