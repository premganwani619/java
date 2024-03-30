public class ReccursiveInsertionSort {
    public static void reccursiveInsertionSort(int arr[], int high) {
        if (high <= 0) {
            return;
        }
        reccursiveInsertionSort(arr, high - 1);
        swapAdjacent(arr, high);
    }

    public static void swapAdjacent(int arr[], int high) {
        if (high <= 0) {
            return;
        }
        boolean didSwap = false;
        if (arr[high] < arr[high - 1]) {
            int temp = arr[high];
            arr[high] = arr[high - 1];
            arr[high - 1] = temp;
            didSwap = true;
        }
        if (didSwap) {
            swapAdjacent(arr, high - 1);

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1, 5, 6, 8, 7, 9, 0 };
        System.out.println("Before sorting the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reccursiveInsertionSort(arr, arr.length - 1);
        System.out.println("\nAfter sorting the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}