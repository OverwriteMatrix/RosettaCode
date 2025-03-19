// Threading = Allows a programmer to run multiple tasks simultaneously
//             Helps improve performance with time-consuming operations
//             (File I/O, network communications, or any background tasks)

// How to create a Thread
// Option 1. Extend the Thread class (simpler)
// Option 2. Implement the Runnable interface (better)

import java.util.Scanner;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 5 seconds to enter your name");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // The .setDaemon() method makes the thread end when the main thread finishes
                                // NORMALLY the program will only exit once all threads have finished
        thread.start();         // Starts the thread
        
        /* 
        // Put this in another thread so that you can enter the name and have the timer go at the same time (Now in MyRunnable)
        // Normally with this here you have to wait for time to be up before it prompts the user to enter their name which is not what we want
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
            if(i == 5){
            System.out.println("TIMES UP");
        }
        }
        */
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        scanner.close();
        
    }
}
