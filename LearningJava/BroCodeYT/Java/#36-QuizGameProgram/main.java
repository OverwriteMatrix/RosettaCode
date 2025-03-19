// Quiz Game

import java.util.Scanner;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
        
        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook launcged?",
                              "Who is know as the father of computers?",
                              "What was the first programming language?"};
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};
        
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*****************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("*****************************");
        
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            
            for(String option : options[i]){
                System.out.println(option);
            }
            
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();
            
            if(guess == answers[i]){
                System.out.println("CORRECT!\n");
                score++;
                System.out.println("Score: " + score);
            } else{
                System.out.println("Incorrect.\n");
                System.out.println("Score: " + score);
            }
        }
        
        System.out.println(questions.length);
        double percentage = (score * 100)/ questions.length;
        System.out.println("\nYour final score is: " + score + " out of " + questions.length + " (" + percentage + "%)");
        scanner.close();
        
    }
}
