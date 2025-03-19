// Exception = An event that interrupts the normal flow of a program
//             (Dividing by zero, file not found, mismatch input type)
//             Surround any dangerous code with a try{} block (AKA User Input/External Reasource)
//             try{}, catch{}, finally{}

import java.util.InputMismatchException;
import java.util.Scanner;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Divide by Zero Exception
        try{
        System.out.println(1 / 0); // java.lang.ArithmeticException: / by zero
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero");
        }
        
        // Mismatch Input Exception
        try{
            System.out.print("Enter a number: ");   // Enter a string to see the exception
            int number = scanner.nextInt(); // java.util.InputMismatchException
            System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number!");
        }
        
        // Saftey Net to Catch All
        catch(Exception e){
            System.out.println("Something went wrong: " + e);
        }
        
        finally{
            scanner.close();
            System.out.println("This always executes");
        } 
    }
}
