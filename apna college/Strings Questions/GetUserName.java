
import java.util.Scanner;

public class GetUserName {

    public static void main(String[] args) {
        String email;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email");
        email = sc.next();
        String username = "";
        sc.close();
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }

        System.out.println(username);
    }

}
