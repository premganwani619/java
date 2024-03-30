class MyLinkedList {
    Node head;
    private int size;

    MyLinkedList() {
        size = 0;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
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
    }

    public static void main(String args[]) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(40);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(10);
        list.printList();

        Node prevNode = null;
        Node currNode = list.head;
        while (currNode != null) {
            if (currNode.data >= 25) {
                if (prevNode == null) {
                    list.head = currNode.next;
                } else {
                    prevNode.next = currNode.next;
                }
            } else {
                prevNode = currNode;
            }
            currNode = currNode.next;
        }
        //40 10 20 30 40 50 60 70 10
        System.out.println();
        list.printList();
    }
}