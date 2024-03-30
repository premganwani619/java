import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

         set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println("Size of set is: " + set.size());

        if (set.contains(1)) {
            System.out.println("Present");
        }

        if (!set.contains(6)) {
            System.out.println("Absent");
        }

        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Absent");
        }

        System.out.println(set);

        set.add(0);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();

        if (!set.isEmpty()) {
            System.out.println("Set is not empty");
        }
    }
}
