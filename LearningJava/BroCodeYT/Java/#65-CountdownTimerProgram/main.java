// Countdown Timer Program

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds to count down from: ");
        int response = scanner.nextInt();
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            
            int count = response;
            
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("Timer Done");
                    timer.cancel();
                }
            }
        };
        
        //timer.schedule(task, 0);   // Only prints once
        timer.scheduleAtFixedRate(task, 0, 1000); // (task, delay, period)
    }
}
