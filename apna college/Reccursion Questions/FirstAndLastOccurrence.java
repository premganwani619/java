public class FirstAndLastOccurrence {
    public static int firstOccurrence, lastOccurrence;

    public static void firstAndLastOccurrence(StringBuilder str, char ele, int index) {
        if (index == str.length()) {
            if (firstOccurrence == -1) {
                System.out.println("Element not found in the string.");
            } else {
                System.out.println("First occurrence is " + firstOccurrence);
                System.out.println("Last occurrence is " + lastOccurrence);
            }
            return;
        }

        if (str.charAt(index) == ele) {
            if (firstOccurrence == -1) {
                firstOccurrence = index;
            }
            lastOccurrence = index;
        }

        firstAndLastOccurrence(str, ele, index + 1);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcadaaedsaaaw");
        firstAndLastOccurrence(str, 'a', 0);
    }
}
