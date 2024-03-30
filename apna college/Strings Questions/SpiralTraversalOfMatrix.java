public class SpiralTraversalOfMatrix {

    public static void main(String[] args) {
        int row = 4, col = 4;
        int arr[][] = new int[row][col];
        int rowstart = 0;
        int rowend = row - 1;
        int colstart = 0;
        int colend = col - 1;
        arr[0] = new int[]{1, 2, 3, 4};
        arr[1] = new int[]{5, 6, 7, 8};
        arr[2] = new int[]{9, 10, 11, 12};
        arr[3] = new int[]{13, 14, 15, 16};
        while (rowstart <= rowend && colstart <= colend) {
            int i, j;
            for (i = rowstart, j = colstart; j <= colend; j++) {
                System.out.println(arr[i][j]);
            }

            rowstart++;

            for (i = rowstart, j = colend; i <= rowend; i++) {
                System.out.println(arr[i][j]);
            }
            colend--;
            for (i = rowend, j = colend; j >= colstart; j--) {
                System.out.println(arr[i][j]);
            }
            rowend--;
            for (i = rowend, j = colstart; i >= rowstart; i--) {
                System.out.println(arr[i][j]);
            }
            colstart++;
            
        }
    }

}
