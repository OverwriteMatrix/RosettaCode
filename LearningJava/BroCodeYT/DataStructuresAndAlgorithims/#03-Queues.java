// Queue = FIFO data structure. First-In First-Out (ex. A line of people)
//         A collection designed for holding elements prior to processing
//         Linear data structure
//
//         add = enqueue, offer()
//         remove = dequeue, poll()

import java.util.LinkedList;
import java.util.Queue;

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        Queue<String> queue = new LinkedList<String>();                         // Have to use a linked list since queues are interfaces and cannot be instanciated
        
        queue.offer("Karen");                                                   // Adding (Enqueue-ing) elements to the queue
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        
        System.out.println(queue.peek());                                       // Examining what element is at the front of our queue ("peeking")
        
        System.out.println();
        
        System.out.println(queue);                                              // Simple printing the queue
        queue.poll();                                                           // Removing (Dequeue-ing) an element from the queue (Karen)
        System.out.println(queue);
        queue.poll();                                                           // Removing (Dequeue-ing) an element from the queue (Chad)
        System.out.println(queue);
        queue.poll();                                                           // Removing (Dequeue-ing) an element from the queue (Steve)
        System.out.println(queue);
        queue.poll();                                                           // Removing (Dequeue-ing) an element from the queue (Harold)
        // Currently the queue is empty []
        
        queue.poll();                   // If you .poll() again, this will NOT throw an exception
        System.out.println(queue);      // Even if you print
        
        // What about .add(), .remove(), and .element()?
        //queue.element();              // This will throw a NoSuchElementException
        //queue.add("David");           // This works but it is better to use .offer() to not throw any exceptions
        //queue.remove("David");        // This works but it is better to use .poll() to not throw any exceptions
        
        // Adding the elements back to the queue
        queue.offer("Karen");                                                   
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        
        // Other helpful queue methods
        System.out.println(queue.isEmpty());                                    // Checks if the queue is empty and returns a boolean
        System.out.println(queue.size());                                       // Returns the size of the queue
        System.out.println(queue.contains("Harold"));                           // Checks if the queue contains a specific element and retuns a boolean
        
        // Where are queues useful?
        // 1. Keyboard buffer (letters should appear on the screen in the order that they are pressed)
        // 2. Printer queue (Print jobs should be completed in the order that they are recived)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search
    } 
}
