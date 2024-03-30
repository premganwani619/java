import java.util.*;

public class StringsBuilder {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings that you want to calculate cumulative length ");
        size = sc.nextInt();
        int length = 0;
        StringBuilder str[] = new StringBuilder[size];
        for (int i = 0; i < size; i++) {
            str[i] = new StringBuilder(sc.next());
            length+= str[i].length();
        }
        System.out.println(length);
        sc.close();
    }
}
