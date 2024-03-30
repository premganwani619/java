import java.util.Scanner;

public class ReplaceACharactorcUsingSb {
    public static void main(String[] args) {
        StringBuilder str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = new StringBuilder(sc.next());
        StringBuilder result = new StringBuilder("");
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result.append(i);
            } else {
                result.append(str.charAt(i));
            }
        }

        System.out.println(result);
    }
}
