public class StackByLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        public static Node head = null;
        public static int size = 0;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            size++;
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            size--;
            int topValue = head.data;
            head = head.next;
            return topValue;
        }

        public static int peak() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        // Stack s = new Stack();
        // s.push(1);
        // System.out.println(s.peak());
        // s.push(2);
        // System.out.println(s.peak());
        // s.push(3);
        // System.out.println(s.peak());
        // s.push(4);
        // System.out.println(s.peak());
        // s.pop();
        // System.out.println(s.peak());
        // System.out.println(s.pop());
        // System.out.println(s.peak());

    }
}
