public class FriendsPairingProblem {
    public static int friendsPairingProblem(int n) {
        if (n <= 1) {
            return 1;
        }

        return friendsPairingProblem(n - 1) + ((n - 1) * friendsPairingProblem(n - 2));
    }

    public static void main(String[] args) {
        int n = 5;
        int result = friendsPairingProblem(n);
        System.out.println(result);
    }
}