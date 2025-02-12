import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal(P) value : ");
        int P = in.nextInt();
        System.out.print("Enter the value of interest rate(R) :");
        float R = in.nextFloat();
        System.out.print("Enter time duration (T) : ");
        int T = in.nextInt();
        in.close();
        float SI = (P * R * T) / 100;
        System.out.println("Simple Interest = " + SI);
    }
}
