public class CircularQueueClass {
    public static class Queue {
        private int arr[];
        private int size;
        private int front;
        private int rear;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return rear + 1 % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front==-1) {
                front=0;
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front==rear) {
                front=rear=-1;
            }
            else{
            front = (front+1)%size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue que = new Queue(5);
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        while (!que.isEmpty()) {
            System.out.println(que.remove());
        }
    }
}