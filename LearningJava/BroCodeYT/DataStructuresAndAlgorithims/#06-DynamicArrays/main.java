// DYNAMIC ARRAYS

// Advantages?
// 1. Random Acess of elements O(1)
// 2. Good locality of reference and data cache untilization
// 3. Easy to insert/delete at the end

// Disadvantages?
// 1. Wastest more memory than a linked list
// 2. Shifting of elements is time consuming O(n)
// 3. Expanding/shrinking array is time consuming O(n)

// Dynamic Arrays in differnet languages
// Java = ArrayList
// C++ = Vector
// JavaScript = Array
// Python = List

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        // Just simplicity use ArrayList for dynamic lists (this is just for learning)
        //ArrayList<String> arrayList = new ArrayList<String>();
        
        // Making our own dynamic array - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        
        // Instanciating a new object from the DynamicArray class and adding three elements
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        // Printing the array w/helpful info
        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
        
        System.out.println();   // Spacing
        
        dynamicArray.insert(0, "X");    // Testing insert method
        System.out.println(dynamicArray);   // Printing array
        System.out.println();   // Spacing
        dynamicArray.delete("A");   // Testing delete method
        System.out.println(dynamicArray); // Printing array
        System.out.println();   // Spacing
        System.out.println("C is at index: " + dynamicArray.search("C"));   // Testing search method
        
        System.out.println();
        System.out.println();
        
        DynamicArray dynamicArray1 = new DynamicArray(5); // Instanciating a new object from the DynamicArray class
        
        dynamicArray1.add("A");
        dynamicArray1.add("B");
        dynamicArray1.add("C");
        dynamicArray1.add("D");
        dynamicArray1.add("E");
        dynamicArray1.add("F");  // Makes the size 5 and auto-calls the grow method to increase capacity to 10
        
        // These three delete statements shrink it back down to auto-call the shrink method to decrease capacity to 5 when size is 1/3 of capacity
        dynamicArray1.delete("A");
        dynamicArray1.delete("B");
        dynamicArray1.delete("C");
        
        // Printing the array w/helpful info
        System.out.println(dynamicArray1);
        System.out.println("Size: " + dynamicArray1.size);
        System.out.println("Capacity: " + dynamicArray1.capacity);
        System.out.println("Empty: " + dynamicArray1.isEmpty());
    } 
}
