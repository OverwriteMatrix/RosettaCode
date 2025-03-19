// Multi-Threading = Enables a program to run multiple threads concurrently
//                   (Thread = A set of instructions that run independntly)
//                   Useful for background tasks or time-consuming operations

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
        
        Thread thread0 = new Thread(new MyRunnable("ping"));
        Thread thread1 = new Thread(new MyRunnable("pong"));
        
        System.out.println("Game Start!");
        
        thread0.start();
        thread1.start();
        
        try{
            thread0.join();     // The .join() method waits for the threads to finish before continuing with the main thread
            thread1.join();
        }
        catch(InterruptedException e){
            System.out.println("Main Thread was interrupted");
        }
        
        System.out.println("Game Over!");
    }
}
