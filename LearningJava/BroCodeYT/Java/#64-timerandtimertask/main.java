// Timer = Class that schedules tasks at specific times or periodically
//         Useful for: sending notifications, scheduled updates, repetative actions

// Timer Task = Represents the task that will be executed by the Timer
//              You will extend the TimerTask class to define your task
//              Create a subclass of TimerTask and @Override run()

import java.util.Timer;
import java.util.TimerTask;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
        
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask(){
            
            int count = 3;
            
            @Override
            public void run(){
                System.out.println("Hello!");
                count--;
                if(count < 0){
                    System.out.println("Task Complete!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 3000, 1000);     // (task, start delay time in miliseconds, delay time between periods)
    }
}
