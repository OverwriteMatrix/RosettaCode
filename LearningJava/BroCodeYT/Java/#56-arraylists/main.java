// Array Lists = A resizeable array that stores objects (autoboxing)
//               Arrays are fixed in size, but ArrayLists can change.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
      
        ArrayList<Integer> list = new ArrayList<>();    // You can specify the type in the second <> like in the first, but you dont have to. Java can infer that it is the same
        list.add(3);    // .add() is a built in method of array lists that adds an element to the arraylist
        list.add(1);
        list.add(2);
        System.out.println(list);
        
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(1.23);
        list2.add(2.67);
        System.out.println(list2);
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("coconut");
        
        //fruits.remove(3);   // .remove() is a built in method of array lists that removes an element from the arraylist at a specific index
        fruits.set(3, "pineapple"); // .set() is a built in method of array lists that set/overwrites an element from the arraylist at a specific index
        System.out.println(fruits.get(0)); // .get() is a built in method of array lists that gets an element from the arraylist at a specific index (allows for printing/etc.)
        System.out.println(fruits.size()); // .size() is a built in method of array lists that gets the size of the arraylist (how many elements)
        Collections.sort(fruits);   // Sorts the arraylist fruits in alphabetical order
        System.out.println(fruits); // Simple printing of an array list
        
        // Printing each element with a for loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        
        // Exercise      
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> foods = new ArrayList<>();
        
        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine(); // Clearing input buffer
        
        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Please enter a food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        
        System.out.println(foods);

        scanner.close();
    }
}
