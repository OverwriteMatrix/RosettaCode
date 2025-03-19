import java.util.Scanner;

public class ExpenseTracker {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double balance = 0;
        boolean isRunning = true;
        int choice;
        int passKey = 411223;
        int password = 0;
        
        // Password Protection
        while (passKey != password){
            System.out.print("Please Enter the Password: ");
            password = scanner.nextInt();
            if(passKey != password){
                System.out.println("That is not the password.");
            }else{
                break;
            }
        }
        
        while(isRunning){
            System.out.println("****************************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************************");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
        
            switch(choice){
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit();
                    System.out.println("New balance is: $" + balance + "\n");
                    break;
                case 3:
                    balance -= withdraw(balance);
                    System.out.println("New balance is: $" + balance + "\n");
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("\nThat is an invalid choice\n");
            }
        }
    }
    
    // Methods
    
    static void showBalance(double balance){
        System.out.println("****************************");
        System.out.printf("\nCurrent Balance: $%.2f\n\n", balance);
    }
    
    static double deposit(){
        System.out.println("****************************\n");
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        } else{
            return amount;
        }
    }
    
    static double withdraw(double balance){
        System.out.println("****************************\n");
        double amount;
        System.out.print("Enter an amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("That would overdraw your account you only have $" + balance);
            return 0;
        }else if(amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }else{
            return amount;
        }
    }
    
    
    
    
    
    
    
    
    
    
}

