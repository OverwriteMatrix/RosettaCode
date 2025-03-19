// Slot Machine

import java.util.Random;
import java.util.Scanner;


public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;
        
        System.out.println("--------------------------");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: + - * / =");
        System.out.println("--------------------------");
        
        while(balance > 0){
            System.out.println("Current Balance: $" + balance);
            System.out.print("Place your bet amount: $");
            bet = scanner.nextInt();
            scanner.nextLine();
            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }else if(bet <= 0){
                System.out.println("Bet must be greater than zero");
            }else{
                balance -= bet;
            }
            
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);
            if(payout > 0){
                System.out.println("You won: $" + payout);
                balance += payout;
            }else{
                System.out.println("Sorry you lost this round :(");
            }
            
            System.out.print("Play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
            if(!playAgain.equals("Y")){
                break;   
            }
        }
        
        System.out.println("Game Over! Your final balance is: $" + balance);
        
        scanner.close();
        
    }
    
    static String[] spinRow(){
        String[] symbols = {"+", "-", "*", "/", "="};
        String[] row = new String[3];
        Random random = new Random();
        
        for(int i=0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        
        return row;
    }
    
    static void printRow(String[] row){
        System.out.println();
        System.out.println(" " + String.join(" | ", row));
        System.out.println();
    }
    
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            switch(row[0]){
                case "+":
                    return bet *= 3;
                case "-":
                    return bet *= 4;
                case "*":
                    return bet *= 5;
                case "/":
                    return bet *= 10;
                case "=":
                    return bet *= 20;
                default:
                    return 0;
            }
        }else if(row[0].equals(row[1])){
            switch(row[0]){
                case "+":
                    return bet *= 2;
                case "-":
                    return bet *= 3;
                case "*":
                    return bet *= 4;
                case "/":
                    return bet *= 5;
                case "=":
                    return bet *= 10;
                default:
                    return 0;
            }
        }else if(row[1].equals(row[2])){
            switch(row[1]){
                case "+":
                    return bet *= 2;
                case "-":
                    return bet *= 3;
                case "*":
                    return bet *= 4;
                case "/":
                    return bet *= 5;
                case "=":
                    return bet *= 10;
                default:
                    return 0;
            }
        }
        
        
        
        return 0;
    }
}
