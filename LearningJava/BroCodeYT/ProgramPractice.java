// This Program Practice Java Program Includes:
// #4 - Mad Libs Game
// #6 - Shopping Cart Program
// #11 - Compound Intrest Calculator
// #15 - Weight Conversion Program
// #17 - Temperature Converter
// #19 - Calculator Program
// #22 - Number Guessing Game

import java.util.Random;
import java.util.Scanner;

public class Java_BroCode {

    public static void main(String[] args) {
       
        // Mad Libs Game
        /*
        
        Scanner scanner = new Scanner(System.in);
        
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        
        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb ending in -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();
        
        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");
        
        scanner.close();
        
        */
        // Shopping Cart Program
        /*
        
        Scanner scanner = new Scanner(System.in);
        
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
        
        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.println("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.println("How many would you like?: ");
        quantity = scanner.nextInt();
        
        total = price * quantity;
        
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is: " + currency + total);
        
        scanner.close();
        
        */
        // Compound Intrest Calculator
        /*
        
        Scanner scanner = new Scanner(System.in);
        
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        
        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.println("Enter the intrest rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.println("Enter the number of times compounded per year?: ");
        timesCompounded = scanner.nextInt();
        System.out.println("Enter the number of years: ");
        years = scanner.nextInt();
        
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        
        System.out.printf("The amount after %d years is $%.2f", years, amount);
        
        scanner.close();

        */
        // Weight Conversion Program
        /*
        
        //Weight Conversion Program Pseudo-code
        //Variable Decleration
        //Welcome Message
        //Prompt User Input
        //Option 1 - convert lbs to kgs
        //Option 2 - convert kgs to lbs
        //Else print Not a valid choice
        
        Scanner scanner = new Scanner(System.in);
        
        double weight;
        double newWeight;
        int choice;
        
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        
        System.out.print("Choose an Option: ");
        choice = scanner.nextInt();
        
        if (choice == 1){
            System.out.print("Enter the weight (lbs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f kgs", newWeight);
        }else if (choice == 2){
            System.out.print("Enter the weight (kgs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f lbs", newWeight);
        }else{
            System.out.println("That is not a valid choice.");
        }
        
        scanner.close();
        
        */
        // Temperature Converter
        /*
        
        Scanner scanner = new Scanner(System.in);
        
        double temp;
        double newTemp;
        String unit;
        
        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase();
        
        //(condition) ? ifTrue : ifFalse
        
        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;
        
        System.out.printf("%.1f°%s", newTemp, unit);
      
        scanner.close();
        
        */
        //Calculator Program
        /*
        
        Scanner scanner = new Scanner(System.in);
        
        double num1;
        double num2;
        char operator;
        double result = 0;
        
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        
        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2; 
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                if (num2 == 0){
                    System.out.println("Cannot divide by Zero");
                    break;
                }else{
                    result = num1 / num2; 
                    System.out.println(result);
                break;
                }
            case '^':
                result = Math.pow(num1, num2); 
                System.out.println(result);
                break;
            default:
                System.out.println("I don't know that operation");
        }
        
        scanner.close();
        
        */
        // Number Guessing Game
        /*
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max) + min; 
        
        System.out.println("Number Guessing Game");
        do{
            System.out.println("Enter a number between 1-100: ");
            guess = scanner.nextInt();
            attempts++;
            if(guess < randomNumber){
                System.out.println("Too Low! Try again!");
            }
            else if (guess > randomNumber){
                System.out.println("Too High! Try again!");
            }
            else{
                System.out.println("\nCorrect the number was: " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        }while(guess != randomNumber);
        
        System.out.println("You have won!");
     
        scanner.close();
        
        */     
    }
}
