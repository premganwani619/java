import java.util.HashSet;

public class UniqueSubSequences {
    public static HashSet<String> uniqueSubsequencesSet = new HashSet<>();

    public static void uniqueSubSequences(String str, int index, String newString) {
        if (index == str.length()) {
            if (uniqueSubsequencesSet.contains(newString)) {
                return;
            } else {
                uniqueSubsequencesSet.add(newString);
                System.out.println(newString);
                return;
            }
        }
        uniqueSubSequences(str, index + 1, newString + str.charAt(index));
        uniqueSubSequences(str, index + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        String newString = "";
        int index = 0;

        uniqueSubSequences(str, index, newString);
    }
}
