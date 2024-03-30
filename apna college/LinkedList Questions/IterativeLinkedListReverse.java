public class IterativeLinkedListReverse {
    Node head;
    private int size;

    IterativeLinkedListReverse() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(String data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public int getSize() {
        return size;
    };

    public void iterativeLinkedListReverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            Node newNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = newNode;
        }
        head.next = null;
        head = prevNode;
    }

  public Node reccursiveLinkedListReverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reccursiveLinkedListReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    

    public static void main(String args[]) {
        IterativeLinkedListReverse list = new IterativeLinkedListReverse();
        list.addLast("This");
        list.addLast("is");
        list.addLast("my");
        list.addLast("new");
        list.addLast("channel");
        list.printList();
        System.out.println();
        list.iterativeLinkedListReverse();
        list.printList();

        System.out.println();
        list.head=list.reccursiveLinkedListReverse(list.head);
        list.printList();
    }

}
