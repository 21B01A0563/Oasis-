import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 5000; 
        List<String> transactionHistory = new ArrayList<>(); 
        System.out.println("Welcome to the ATM");
        
        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Transaction History");
            System.out.println("6. Quit");
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Your balance is " + balance);
                    break;               
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    int amountToWithdraw = scanner.nextInt();
                    
                    if (amountToWithdraw > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= amountToWithdraw;
                        System.out.println("Withdrawn " + amountToWithdraw);
                        System.out.println("Your new balance is " + balance);
                        transactionHistory.add("Withdrawn " + amountToWithdraw);
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter amount to deposit:");
                    int amountToDeposit = scanner.nextInt();
                    balance += amountToDeposit;
                    System.out.println("Deposited " + amountToDeposit);
                    System.out.println("Your new balance is " + balance);
                    transactionHistory.add("Deposited " + amountToDeposit);
                    break;
                    
                case 4:
                    System.out.println("Enter recipient account number:");
                    String recipient = scanner.next();
                    System.out.println("Enter transfer amount:");
                    int amountToTransfer = scanner.nextInt();
                    
                    if (amountToTransfer > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= amountToTransfer;
                        System.out.println("Transferred " + amountToTransfer + " to " + recipient);
                        System.out.println("Your new balance is " + balance);
                        transactionHistory.add("Transferred " + amountToTransfer + " to " + recipient);
                    }
                    break;
                    
                case 5:
                    System.out.println("Transaction History:");
                    for (String transaction : transactionHistory) {
                        System.out.println(transaction);
                    }
                    break;
                    
                case 6:
                    System.out.println("Thank you for using the ATM");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

}

