import java.util.Scanner;

public class EvenNumbersTillN {
    public static void main(String[] args) {

        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want even numbers");
        input = sc.nextInt();
        sc.close();
        for (int i = 0; i < input; i += 2) {
            System.out.println(i);
        }
        
    }
}
