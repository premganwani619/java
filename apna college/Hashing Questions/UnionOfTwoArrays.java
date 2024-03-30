import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void getUniomOfTwoArrays(int arr1[], int arr2[]) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hashSet.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hashSet.add(arr2[i]);
        }

        for (int num : hashSet) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        getUniomOfTwoArrays(arr1, arr2);
    }
}
