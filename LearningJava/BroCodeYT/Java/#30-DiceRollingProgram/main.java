import java.util.Random;
import java.util.Scanner;

// Dice Roller Program

public class BroCode_variablescope
{
    
    public static void main(String[] args) {
        
        //Declare Variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;
        
        //Get the number of dice
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();
        
        //Check if the number of dice is > 0
        if(numOfDice > 0){
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(6) + 1;            //First number exclusive, second number inclusive rolls (1-6)
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }else{
            System.out.println("Number of dice must be greater than 0.");
        }
        
    }
    
    
    static void printDie(int roll){
        //Text blocks are not supported in source 12 use sorce 15 or higher
        /*
        String dice1 = """
                       -------
                      |       |
                      |   ●   |
                      |       |
                       -------
                       """;
        String dice2 = """
                       -------
                      | ●     |
                      |       |
                      |     ● |
                       -------
                       """;
        String dice3 = """
                       -------
                      |●      |
                      |   ●   |
                      |      ●|
                       -------
                       """;
        String dice4 = """
                       --------
                      |●     ●|
                      |        |
                      |●     ●|
                       -------
                       """;
        String dice5 = """
                       --------
                      |●     ●|
                      |   ●   |
                      |●     ●|
                       -------
                       """;
        String dice6 = """
                       -------
                      | ●   ● |
                      | ●   ● |
                      | ●   ● |
                       -------
                       """;
        */
        
        String dice1 = "*";
        String dice2 = "**";
        String dice3 = "***";
        String dice4 = "****";
        String dice5 = "*****";
        String dice6 = "******";
        
        switch(roll){
            case 1: 
                System.out.println(dice1);
                break;
            case 2: 
                System.out.println(dice2);
                break;
            case 3: 
                System.out.println(dice3);
                break;
            case 4: 
                System.out.println(dice4);
                break;
            case 5: 
                System.out.println(dice5);
                break;
            case 6: 
                System.out.println(dice6);
                break;
            default:
                System.out.println("INVALID ROLL");
        }
    }
   
}
