public class StrictlySorted {
    public static boolean isStrictlySorted(int arr[], int index) {

        if (index == arr.length - 2) {
            return arr[index] < arr[index + 1];
        }
        if (arr[index] < arr[index + 1]) {
            return isStrictlySorted(arr, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        if (isStrictlySorted(arr, 0)) {
            System.out.println("Array is Strictly Sorted");
        } else {
            System.out.println("Array is not Strictly Sorted");
        }
    }
}
