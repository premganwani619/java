// public class BubbleSort {
//     public static void bubbleSort(int arr[]) {
//         for (int i = arr.length - 1; i >= 1; i--) {
//             for (int j = 0; j < i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }

//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {

//         int arr[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
//         bubbleSort(arr);
//     }
// }

/*
 Best case,Average case,Worst case O(N^2)
*/
//Optimized Bubble Sort

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for (int i = arr.length - 1; i >= 1; i--) {
            int didSwap = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
        bubbleSort(arr);
    }
}
//Best case O(N)
//Average case & Worst case O(N^2)