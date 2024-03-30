public class QueueClass {
    public static class Queue {
        private  int arr[];
        private  int size;
        private  int rear;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
            rear = -1;
        }

        public  boolean isEmpty() {
            return rear == -1;
        }

        public  boolean isFull() {
            return rear == size - 1;
        }

        public  void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public  int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public  int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
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