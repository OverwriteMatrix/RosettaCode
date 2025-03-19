// LinkedLists VS. ArrayLists

import java.util.ArrayList;
import java.util.LinkedList;

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        long startTime;
        long endTime;
        long elapsedTime;
        
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        
        // LinkedLists VS ArrayList .get()
        System.out.println("LinkedLists VS ArrayList .get()");
        System.out.println("-------------------------------");
        // .get(0)
        startTime = System.nanoTime();
        linkedList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedLists VS ArrayList .get(0)");
        System.out.println("    LinkedList: " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("     ArrayList: " + elapsedTime + " ns");
        // .get(500000)
        startTime = System.nanoTime();
        linkedList.get(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedLists VS ArrayList .get(5000000)");
        System.out.println("    LinkedList: " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.get(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("     ArrayList: " + elapsedTime + " ns");
        // .get(999999)
        startTime = System.nanoTime();
        linkedList.get(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedLists VS ArrayList .get(999999)");
        System.out.println("    LinkedList: " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.get(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("     ArrayList: " + elapsedTime + " ns");
        
        System.out.println();
        
        // LinkedLists VS ArrayList .remove()/.add()
        System.out.println("LinkedLists VS ArrayList .remove()/.add()");
        System.out.println("-----------------------------------------");
        // .remove(0)
        startTime = System.nanoTime();
        linkedList.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedLists VS ArrayList .remove(0)");
        System.out.println("    LinkedList: " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("     ArrayList: " + elapsedTime + " ns");
        // .remove(500000)
        startTime = System.nanoTime();
        linkedList.remove(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedLists VS ArrayList .remove(500000)");
        System.out.println("    LinkedList: " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.remove(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("     ArrayList: " + elapsedTime + " ns");
        // .remove(999997)
        startTime = System.nanoTime();
        linkedList.remove(999997);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedLists VS ArrayList .remove(999997)");
        System.out.println("    LinkedList: " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.remove(999997);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("     ArrayList: " + elapsedTime + " ns");
        
        // Linked List
        startTime = System.nanoTime();
        
        //linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);
        //linkedList.remove(0);
        //linkedList.remove(500000);
        //linkedList.remove(999999);
        
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        //System.out.println("LinkedList: " + elapsedTime + " ns");
        
        // Array List
        startTime = System.nanoTime();
        
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        //arrayList.remove(999999);
        
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        //System.out.println(" ArrayList: " + elapsedTime + " ns");
    } 
}
