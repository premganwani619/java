public class QueueByLinkedList {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class LinkedList {

        Node head;
        Node tail;

        LinkedList() {
            head = null;
            tail = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int data = head.data;
            if (head != tail) {
                head = head.next;
                return data;
            }

            head = tail = null;
            return data;
        }

    }
}
