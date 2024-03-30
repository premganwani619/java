public class ReccursiveBubbleSort {
    public static boolean didSwap = false;

    public static void reccursiveBubbleSort(int arr[], int high) {
        if (high <= 0) {
            return;
        }

        swapAdjacent(arr, 0, high);
        if (didSwap) {
            reccursiveBubbleSort(arr, high - 1);
        }

    }

    public static void swapAdjacent(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        if (arr[low] > arr[low + 1]) {
            int temp = arr[low]; 
            arr[low] = arr[low + 1];
            arr[low + 1] = temp;
            didSwap = true;

        }

        swapAdjacent(arr, low + 1, high);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1, 5, 6, 8, 7, 9, 0 };
        System.out.println("Before sorting the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reccursiveBubbleSort(arr, arr.length - 1);
        System.out.println("\nAfter sorting the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}