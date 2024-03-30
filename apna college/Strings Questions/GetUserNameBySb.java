
import java.util.Scanner;

public class GetUserNameBySb {

    public static void main(String[] args) {
        StringBuilder email;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email");
        email = new StringBuilder(sc.next());
        StringBuilder username = new StringBuilder("");
        sc.close();
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                username.append(email.charAt(i));
            }
        }

        System.out.println(username);
    }

}
