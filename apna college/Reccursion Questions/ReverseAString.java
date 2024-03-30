public class ReverseAString {
    public static void revString(String str, int index) {
        if (index < str.length()-1) {
            revString(str, index + 1);
        }
        System.out.println(str.charAt(index));
        return;
    }

    public static void main(String[] args) {
        String str = "abcde";
        revString(str, 0);
    }

}
