public class MoveXToEndOfTheString {
    public static StringBuilder str2 = new StringBuilder("");
    public static int countOfX = 0;

    public static void moveXToEndOfTheString(StringBuilder str, int index) {
        if (index == str.length()) {
            return;
        }

        if (str.charAt(index) != 'x') {
            str2.append(str.charAt(index));
        } else {
            countOfX++;
        }
        moveXToEndOfTheString(str, index + 1);
        if (countOfX!=0) {
            str2.append('x');
            countOfX--;
        }
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abxcxxdxxxefg");
        moveXToEndOfTheString(str, 0);
        System.out.println(str);
        System.out.println(str2);
    }

}
