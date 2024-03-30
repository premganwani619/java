import java.util.ArrayList;

public class NumberOfSubsetsInASetOfNNumbers {
    public static void printArrayList(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
        System.out.println();
    }

    public static void numberOfSubsetsInASetOfNNumbers(int n, ArrayList<Integer> arrayList) {
        if (n == 0) {
            printArrayList(arrayList);
            return;
        }
        arrayList.add(n);
        numberOfSubsetsInASetOfNNumbers(n-1, arrayList);
        arrayList.remove(arrayList.size()-1);
        numberOfSubsetsInASetOfNNumbers(n-1, arrayList);
    }

    public static void main(String[] args) {
        int n = 3;
        numberOfSubsetsInASetOfNNumbers(n, new ArrayList<Integer>());

    }
}
