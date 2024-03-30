import java.util.HashSet;

public class InterSectionOfTwoArrays {
    public static void getIntersectionOfTwoArrays(int arr1[], int arr2[]) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hashSet.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (hashSet.contains(arr2[i])) {
                hashSet.remove(arr2[i]);
                System.out.print(arr2[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        getIntersectionOfTwoArrays(arr1, arr2);
    }
}
