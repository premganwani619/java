class LL {
    Node head;
    private int size;

    LL() {
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

    public void addFirst(String data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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

    public void addInMiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
    
        Node newNode = new Node(data);
        size++;
    
        if (index == 0 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
    
        Node currNode = head;
        for (int i = 1; i < index; i++) {
            currNode = currNode.next;
        }
    
        Node nextNode = currNode.next;
        currNode.next = newNode;
        newNode.next = nextNode;
    }
    //0 1 2 4
    public void deleteInMiddle(int index) {
        if (index >= size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
    
        size--;
    
        if (index == 0) {
            head = head.next;
            return;
        }
    
        Node currNode = head;
        for (int i = 1; i < index; i++) {
            currNode = currNode.next;
        }
    
        currNode.next = currNode.next.next;
    }
        public void deleteFirst() {
        if (head == null) {
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        size--;
        if (head.next==null) {
            head=null;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode.next != null) {
            currNode = currNode.next;
            prevNode = prevNode.next;
        }
        prevNode.next = null;
    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addLast("This");
        list.addLast("is");
        list.addLast("my");
        list.addLast("new");
        list.addLast("channel");
        list.addFirst("Hello everyone");
        System.out.println("The size is: "+list.getSize());
        list.printList();
        System.out.println();
        list.deleteLast();
        System.out.println("The size is: "+list.getSize());
        list.printList();
    }
}