public class RemoveDuplicatesInAString {
    public static boolean arr[] = new boolean[26];

    public static void removeDuplicatesInAString(StringBuilder str, int index) {

        if (index == str.length()-1) {
            return;
        }
        char ch = str.charAt(index);
        if (arr[(ch - 'a')]) {
            str.deleteCharAt(index);
            index--;
        } else {
            arr[(ch - 'a')] = true;
        }
        removeDuplicatesInAString(str, index + 1);
    }

    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("abbacdedf");
        removeDuplicatesInAString(str, 0);
        System.out.println(str);
    }
}