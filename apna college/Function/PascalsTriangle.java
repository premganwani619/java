import java.util.*;

public class PascalsTriangle {
    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> PascalTriangle(int n) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= n; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = PascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int element : it) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
