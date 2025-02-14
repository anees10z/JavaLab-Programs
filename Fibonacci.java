import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of series: ");
        int series = sc.nextInt();
        sc.close();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= series; ++i) {
            System.out.print(a+"\t");
            int next = a+b;
            a=b;
            b=next;
        }
    }
}
