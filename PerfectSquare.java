import java.util.Scanner;

// Find Perfect Square without using external modules

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        boolean flag = false;

        for (int i = 1; i * i <= num; ++i) {
            if (i * i == num) {
                flag = true;
            }
        }
        if (flag == true)
            System.out.println(num+" is perfect square");
        else
            System.out.println(num+" is not perfect square");
    }
}
