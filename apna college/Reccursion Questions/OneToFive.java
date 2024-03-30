public class OneToFive {
    public static void printFiveToOne(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            return;
        }
        printFiveToOne(n - 1);

    }

    public static void printOneTwoFive(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printOneTwoFive(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        printFiveToOne(5);
        System.out.println();
        printOneTwoFive(5);
    }
}
