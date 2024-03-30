import java.util.ArrayList;

public class StackByArrayList {

    public static class Stack {
        public static ArrayList<Integer> list = new ArrayList<>();

        public static void push(int data) {
            list.add(data);
        }

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return temp;
        }

        public static int peak() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
}
