// User input

import java.util.Scanner;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);   // Creating a scanner object
    
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();           // Inputting a name
    System.out.println("Hello, " + name);       // Printing out hello and the input
    
    // scanner.nextLine() = give the entire next line
    // scanner.next() = gives everything up until a space (doesnt read spaces)
    // scanner.nextInt() = takes in an int
    // scanner.nextDouble() = takes in a double
    // scanner.nextBoolean() = takes in a boolean
    
    // After accepting an integer or double:
    // scanner.nextLine(); to get rid of \n in the input buffer
    // "clear the input buffer"
    
    scanner.close();    // Ensure you close the scanner
    }
}
