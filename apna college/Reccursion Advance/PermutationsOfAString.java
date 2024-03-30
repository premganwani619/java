public class PermutationsOfAString {

    public static void permutationsOfAString(String str, int index, String permutatioString) {

        if (str.length() == 0) {
            System.out.println(permutatioString);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            permutationsOfAString(newString, index + 1, permutatioString + ch);
        }

    }

    public static void main(String args[]) {
        String str = "abc";
        int index = 0;
        String permutatioString = "";
        permutationsOfAString(str, index, permutatioString);
    }
}