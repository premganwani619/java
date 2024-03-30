import java.util.LinkedList;

public class LLQuestion {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        int arr[] = { 1, 5, 7, 3, 8, 2, 3 };
        
        for (int i = 0; i < arr.length; i++) {
            LL.add(arr[i]);
        }
        
        Integer ele = 7; 
        for (Integer num : LL) {
            if (ele.equals(num)) {
                System.out.println("Index of element " + ele + ": " + LL.indexOf(num));
            }
        }
    }
}
