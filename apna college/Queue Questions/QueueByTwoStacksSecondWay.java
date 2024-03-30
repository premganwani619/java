import java.util.Stack;

public class QueueByTwoStacksSecondWay {
    public static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.empty();
        }

        public void add(int data) {
            s1.push(data);
        }

        public int remove() {
            if (s1.empty()) {
                return -1;
            }
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
            int data = s2.pop();
            while (!s2.empty()) {
            s1.push(s2.pop());
            }
            return data;
        }

        public int peek() {
            if (s1.empty()) {
                return -1;
            }
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
            return s2.peek();
           
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}