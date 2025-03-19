// Linked Lists = A data structure that stores a series of nodes in two parts (data + address).
//                Nodes are in non-consecutive memory locations.
//                Elements are linked using pointers

//                Singly Linked List
//  [data | address} -> [data | address] - > [data | address]
//
//                Doubly Linked List
//  [address | data | address} <-> [address | data | address]

// Advantages? 
// 1. Dynamic data structure (allowcates needed memory while running)
// 2. Insertion and deletion of nodes is easy. O(1)
// 3. No/low memory waste

// Disadvantages?
// 1. Greater memory usage (additional pointer)
// 2. No random access of elements (no idex[i])
// 3. Accessing/searching elements is more time consuming. O(n)

// Uses?
// 1. Implement Stacks/Queues
// 2. GPS navigations
// 3. Music playlist

import java.util.LinkedList;

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        // Linked Lists can be treated like stacks or queues and can use all of their methods
        
        // Linked List behaving like a stack
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        //linkedList.pop();
        
        linkedList.add(4, "E");
        linkedList.remove("E");
        
        System.out.println(".indexOf(F): " + linkedList.indexOf("F"));
        System.out.println(".peekFirst(): " + linkedList.peekFirst());
        System.out.println(".peekLast(): " + linkedList.peekLast());
        
        linkedList.addFirst("G");
        linkedList.addLast("0");
        
        //String first = linkedList.removeFirst();
        //String last = linkedList.removeLast();
        System.out.println(linkedList);
        
        System.out.println();
        
        // Linked List behaving like a queue
        LinkedList<String> linkedList2 = new LinkedList<String>();
        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");
        linkedList2.offer("F");
        //linkedList2.poll();
        System.out.println(linkedList2);
    } 
}
