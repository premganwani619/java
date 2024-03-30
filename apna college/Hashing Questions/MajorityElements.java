import java.util.HashMap;

public class MajorityElements {
    public static void majorityElements(int arr[]) {
        int n = arr.length / 3;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int val = hashMap.get(arr[i]);
                hashMap.put(arr[i], val+1);
            }
            else{
                hashMap.put(arr[i], 1);
            }
        }
        for (int key:hashMap.keySet()) {
           if (hashMap.get(key)>n) {
            System.out.print(key);
           }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 5, 1 };
        majorityElements(arr);
    }
}
