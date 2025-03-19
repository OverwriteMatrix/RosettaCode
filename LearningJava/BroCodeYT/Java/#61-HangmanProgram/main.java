// JAVA HANGMAN PROGRAM

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
        
        String filePath = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS"    // Possible words' file path
                        + "\\Documents\\NetBeansProjects\\BroCode-WorkSpace"
                        + "\\src\\main\\java\\com\\mycompany\\brocode"
                        + "\\workspace\\words.txt";
        ArrayList<String> words = new ArrayList<>();                            // Creating an array list to hold all the possible words (empty now)
        
        // Trying to read in all the words in the possible words file
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found: " + e);
        }
        catch(IOException e){
            System.out.println("IOException: " + e);
        }

        // Picking a random word out of the avalible words in the file (now array list)
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
            
        Scanner scanner = new Scanner(System.in);                               // Creating a new scanner
        ArrayList<Character> wordState = new ArrayList<>();                     // Creating an array list (to change when guessing and to have a default value of underlines at start)
        int wrongGuesses = 0;                                                   // Variable to hold the number of incorrect guess
        ArrayList<Character> wrongList = new ArrayList<>();                     // Creating an array list to hold all incorrect letter guesses
        
        // Putting _ in wordState for every letter in the randomly chosen word
        for(int i = 0; i < word.length(); i++){                                 
            wordState.add('_');
        }
        
        // Printing Welcome Message
        System.out.println("------------------------");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("------------------------");
        
        while(wrongGuesses < 7){
            
            // Printing the wordstate with only underlines (unless changed)
            System.out.print("Word: ");
            for(char c : wordState){
                System.out.print(c + " ");
            }
            
            System.out.println();                                               // Spacing
            System.out.println("Previous Wrong Guesses: " + wrongList);         // Printing out the previous wrong guesses
            System.out.print("Guess a letter: ");                               // Prompt to ask the user to guess a letter
            char guess = scanner.next().toLowerCase().charAt(0);                // Intaking the guessed letter
            
            // Checking if guessed letter is in the random word
            // Correct guess execution
            if(word.indexOf(guess) >= 0){
                System.out.println("Correct Guess!\n");
                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
            // Winning the game execution
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            
            // Wrong guess execution
            else{
                System.out.println("Wrong Guess!\n");
                wrongGuesses++;
                wrongList.add(guess);
                System.out.println(getHangmanArt(wrongGuesses));
            }
        }
        
        // If statement to see if you had too many wrong guesses/lost
        if(wrongGuesses >= 7){
            System.out.println("Game Over!");
            System.out.println("The word was: " + word);
        }
        scanner.close();                                                        // Closing the scanner
    }
    
    // Method to print out the ASCII art for each wrong guess
    static String getHangmanArt(int wrongGuesses){
        switch(wrongGuesses){
            case 0:
                return "       \n       \n       \n       \n_________";
            case 1:
                return "       \n       \n       \n    |  \n_________";
            case 2:
                return "       \n       \n    |  \n    |  \n_________";
            case 3:
                return "       \n    O  \n    |  \n    |  \n_________";
            case 4:
                return "       \n    O  \n   /|  \n    |  \n_________";
            case 5:
                return "       \n    O  \n   /|\\ \n    |  \n_________";
            case 6:
                return "       \n    O  \n   /|\\ \n    |  \n   /   \n_________";
            case 7:
                return "   \n    O  \n   /|\\ \n    |  \n   / \\ \n_________";
            default:
                return "Unsure of stage";
        }
    }
}
