import java.util.Scanner;

class BankAccount {
    private double balance;
    public BankAccount(double initBalance){
        this.balance = initBalance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount + "deposited Successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(+ amount + "Withdrawn Successfully.");
        } else if (amount > balance ){
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!!");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance:" + balance);
    }
}
class ATM {
    private BankAccount account;
    private Scanner sc = new Scanner(System.in);
    public ATM(BankAccount account){
        this.account = account;
    }
    public void start() {
        int choice;
        do { 
            System.out.println("\nATM menu:");
            System.out.println("1. check balance");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");
            choice =sc.nextInt();
            
    switch (choice) {
            case 1 : 
            account.checkBalance();
            break;
            case 2 : 
                System.out.print("Enter deposit amount: ");
                double dep = sc.nextDouble();
                account.deposit(dep);break;
            
            case 3 : 
                System.out.print("Enter withdrawal amount:");
                double amt = sc.nextDouble();
                account.withdraw(amt);break;
            
            case 4: 
                System.out.println("thank you for using the ATM!");break;
                default : 
               System.out.println("invalid choice try again.");break;
    }
        } while (choice !=4);   
    }
}
public class ATMinterface {
    public static void main(String[] args) {
        BankAccount userAcc = new BankAccount(1000.0);
        ATM atm = new ATM(userAcc);
        atm.start();
    }
}
