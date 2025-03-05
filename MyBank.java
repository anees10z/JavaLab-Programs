import java.util.Scanner;

class Bank {
    private String accNo;
    private String name;
    private double balance;

    Scanner sc = new Scanner(System.in);

    // account creates
    public void createAccount() {
        System.out.print("Enter account number : ");
        accNo = sc.next();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Amount : ");
        balance = sc.nextDouble();
    }

    // showing account info
    public void accInfo() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    // Deposit
    public void deposit() {
        System.out.print("Enter amount to deposit : ");
        double amt = sc.nextDouble();
        balance += amt;
        System.out.println("Money deposited successfully");
    }

    // withdraw
    public void withdraw() {
        System.out.print("Enter amount to withdraw : ");
        double amt = sc.nextDouble();
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Money withdrawl successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class MyBank {
    public static void main(String[] args) {
        Bank p1 = new Bank();
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("1. Create Account");
            System.out.println("2. Account Info");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdrawl Money");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    p1.createAccount();
                    break;
                case 2:
                    p1.accInfo();
                    break;
                case 3:
                    p1.deposit();
                    break;
                case 4:
                    p1.withdraw();
                    break;
                default:
                    System.out.println("----Thank you----\n-----visit again----");
                    break;
            }
        } while (opt != 5);
        sc.close();
    }
}