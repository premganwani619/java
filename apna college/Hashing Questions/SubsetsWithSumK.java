import java.util.*;

class SubsetsWithSumKK {

    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hashMap.containsKey(sum-k)) {
                ans+=hashMap.get(sum-k);
            }
            if (hashMap.containsKey(sum)) {
                hashMap.put(sum, hashMap.get(sum)+1);
            }
            else{
                hashMap.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}