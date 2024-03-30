import java.util.Stack;

public class ReverseStack {
    public static void pushInLast(Stack<Integer> s, int element) {
        if (s.empty()) {
            s.push(element);
            return;
        }
        int temp = s.pop();
        pushInLast(s, element);
        s.push(temp);

    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int temp = s.pop();
        reverseStack(s);
        pushInLast(s, temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        while (s.size() != 0) {
            System.out.println(s.pop());
        }
    }
}
