public class CountPathMaze {
    public static int countPathMaze(int i, int j, int n, int m) {

        if (i == n - 1 || j == m - 1) {
            return 1;
        }
        return countPathMaze(i+1, j, n, m)+countPathMaze(i, j+1, n, m);
    }

    public static void main(String[] args) {
        int i = 0, j = 0, n = 4, m = 3;
        int countOfPaths=countPathMaze(i, j, n, m);
        System.out.println(countOfPaths);
    }
}
