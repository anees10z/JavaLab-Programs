import java.util.Scanner;

public class SwapWith2Vars {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Swaping 2 numbers withouts using 3rd variable\n");
    System.out.print("Enter 1st number: ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    int b = sc.nextInt();

    // Display After swap
    System.out.println("\nBefore Swap");
    System.out.println("1st number =  " + a);
    System.out.println("2nd number =  " + b);

    // process 
    a = a+b;
    b = a-b;
    a = a-b;

    // Display Before swap
    System.out.println("\nAfter Swap");
    System.out.println("1st number =  " + a);
    System.out.println("2nd number =  " + b);
    sc.close();
  }
}
