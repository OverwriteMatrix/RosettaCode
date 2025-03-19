// Enums = (Enumerations) A special kind of class that represents a fixed set of constants.
//         They improve code readability and are easy to maintain.
//         More efficient with switches when comparing Strings.

import java.util.Scanner;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
        
        Day day1 = Day.SUNDAY;                      // Creating a day object       
        System.out.println(day1);                   // Printing the day's enum name
        System.out.println(day1.getDayNumber());    // Printing the day's enum value with the .getDayNumber getter we made
        
        // Example w/Switch
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week (String): ");
        String response = scanner.nextLine().toUpperCase();
        
        try{
            Day day = Day.valueOf(response);
            switch(day){
                case MONDAY:
                    System.out.println("It is a weekday");
                    break;
                case TUESDAY:
                    System.out.println("It is a weekday");
                    break;
                case WEDNESDAY:
                    System.out.println("It is a weekday");
                    break;
                case THURSDAY:
                    System.out.println("It is a weekday");
                    break;
                case FRIDAY:
                    System.out.println("It is a weekday");
                    break;
                case SATURDAY:
                    System.out.println("It is the weekend!");
                    break;
                case SUNDAY:
                    System.out.println("It is the weekend!");
                    break;
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day.");
        }
        scanner.close();
    }
}
