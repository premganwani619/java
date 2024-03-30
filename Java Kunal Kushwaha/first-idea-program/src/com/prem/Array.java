public class Array {
    public static void main(String[] args) {
        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // actually here object is being created in the memory (heap)
    }
}

// null is not a keyword is a special litrel in java
// we cant create variable named null
//we cant assign null to primitives(non premetives can point to null)
//by default refrence variables have null type
//we can cast it to any particular type
//int arr[4] made with 4 objects