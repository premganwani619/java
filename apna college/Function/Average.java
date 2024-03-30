import java.util.Scanner;

public class Average {
    public static void calcAverage(int num1, int num2, int num3) {
        float avg = (float) (num1 + num2 + num3) / 3;
       System.out.println("Average of " + num1 + " " + num2 + " " + num3 + " is "+ String.format("%.2f", avg));
    }

    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        sc.close();
        calcAverage(num1, num2,num3);
    }
}
