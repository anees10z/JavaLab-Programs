import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        sc.close();

        int rem = num % divisor;
        int quo = num / divisor;

        System.out.println("Qoutient = " + quo);
        System.out.println("Remainder = " + rem);
    }
}
