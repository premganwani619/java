import java.util.Stack;
public class PushInLast {
    public static void pushInLast(Stack<Integer> s,int element){
        if (s.empty()) {
            s.push(element);
            return;
        }
        int temp = s.pop();
        pushInLast(s, element);
        s.push(temp);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushInLast(s, 0);
        
        while (s.size()!=0) {
            System.out.println(s.pop());
        }
    }
}
