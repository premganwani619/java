public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {

            for (int j = i; j >= 1 && arr[j] < arr[j - 1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
            //This loop is not opimized
            // for (int j = i; j >= 1; j--) {
            //     if (arr[j] < arr[j - 1]) {
            //         int temp = arr[j];
            //         arr[j] = arr[j - 1];
            //         arr[j - 1] = temp;
            //     }
            // }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
        insertionSort(arr);
    }
}
/*
 * 5,4,3,2,1 4
 * 4,3,2,1,5 3
 * 2,1 3,4,5 2
 * 1,2,3,4,5 1
 * 1,2,3,5,5 0
 */