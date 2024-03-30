public class ReccursiveSelectionSort {

    public static void reccursiveSelectionSort(int arr[], int high) {
        if (high <= 0) {
            return;
        }
        int largestNumberIndex;
        largestNumberIndex = getLargestNumbersIndex(arr, 0, high);
        if (largestNumberIndex != high) {
            int temp = arr[largestNumberIndex];
            arr[largestNumberIndex] = arr[high];
            arr[high] = temp;
        }

        reccursiveSelectionSort(arr, high - 1);
    }

    public static int getLargestNumbersIndex(int arr[], int low, int high) {
        if (low == high) {
            return low;
        }
        int k = getLargestNumbersIndex(arr, low + 1, high);
        return arr[k] > arr[low] ? k : low;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 3, 2, 1, 5, 6, 8, 7, 9, 0 };
        System.out.println("Before sorting the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reccursiveSelectionSort(arr, arr.length - 1);
        System.out.println("\nAfter sorting the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}