import java.util.*;

public class ImplementationOfHashSets {
    public class HashMaps<KEY> {

        private class Node {
            KEY key;

            Node(KEY key) {
                this.key = key;
            }
        }

        private int n;
        private int N;

        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        HashMaps() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < N; i++) {

                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(KEY key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLinkedList(KEY key, int bi) {
            LinkedList<Node> LL = buckets[bi];
            for (int i = 0; i < LL.size(); i++) {
                if (LL.get(i).key == key) {
                    return i;
                }

            }
            return -1;
        }

        @SuppressWarnings("uncheked")
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[2 * N];
            for (int i = 0; i < 2 * N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> LL = oldBuckets[i];

                for (int j = 0; j < LL.size(); j++) {
                    Node node = LL.get(j);
                    add(node.key);
                }
            }

        }

        public void add(KEY key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);

            if (di == -1) {
                buckets[bi].add(new Node(key));
                n++;
            } else {
                return;
            }
            double lembda = (double) n / N;
            if (lembda > 2) {
                rehash();
            }
        }

        public boolean containsKey(KEY key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);

            if (di == -1) {
                return false;
            } else {
                return true;
            }
        }
        public void remove(KEY key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);

            if (di == -1) {
                return;
            } else {
                buckets[bi].remove(di);
                n--;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public ArrayList<KEY> getKeys() {
            ArrayList<KEY> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> LL = buckets[i];
                for (int j = 0; j < LL.size(); j++) {
                    keys.add(LL.get(j).key);
                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {

    }
}
