public class Keypad {
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tu", "vwx", "yz" };

    public static void keypad(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        for (int i = 0; i < keypad[str.charAt(index)-'0'].length(); i++) {
            char ch = keypad[str.charAt(index)-'0'].charAt(i);
            keypad(str, index + 1, newString+ch);
        }
    }

    public static void main(String args[]) {
        String str = "13";
        String newString = "";
        int index = 0;
        keypad(str, index, newString);
    }
}
