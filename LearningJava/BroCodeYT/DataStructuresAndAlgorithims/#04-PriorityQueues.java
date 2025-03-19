// Priority Queues  = A FIFO data structure that serves elements with the highest priority first before elements with lower priority

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        // Normal Queue Version
        Queue<Double> queue1 = new LinkedList<>();
        queue1.offer(3.0);
        queue1.offer(2.5);
        queue1.offer(4.0);
        queue1.offer(1.5);
        queue1.offer(2.0);
        
        while(!queue1.isEmpty()){                                               // Displaying all elements within the queue while queue is ! empty
            System.out.println(queue1.poll());
        }
        
        System.out.println();
        
        // Priority Queue Version
        Queue<Double> queue2 = new PriorityQueue<>(/*Collections.reverseOrder()*/);  // Doubles in a priority queues by default have priority in ascending order lowest -> highest
        queue2.offer(3.0);                                                           // Passing in Collections.reverseOrder() makes it the opposite highest -> lowest
        queue2.offer(2.5);                                                           // Collections.reverseOrder() is called a comparator
        queue2.offer(4.0);
        queue2.offer(1.5);
        queue2.offer(2.0);
        
        while(!queue2.isEmpty()){                                               // Displaying all elements within the priority queue while queue is ! empty
            System.out.println(queue2.poll());
        }
        
        System.out.println();
        
        // String Priority Queue
        Queue<String> queue3 = new PriorityQueue<>(); // Strings in a priority queues by default have priority in alphabetical order
        queue3.offer("B");                                                           
        queue3.offer("C");
        queue3.offer("A");
        queue3.offer("F");
        queue3.offer("D");
        
        while(!queue3.isEmpty()){                                              
            System.out.println(queue3.poll());
        }
    } 
}
