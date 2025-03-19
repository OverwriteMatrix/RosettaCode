// Hashmaps = A data structure that stores key-value pairs
//            Keys are unique, but Values can be duplicated
//            Does not maintain any order, but is memory efficient
//            HashMap<Key, Value>

import java.util.HashMap;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
       
        HashMap<String, Double> map = new HashMap<>();
       
        map.put("apple", 0.50);      // Use the .put() method to put something in a hash map (needs two values)
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);
       
        //map.put("orange", 10.0);     // Keys must be unique if you were to do this it would overwrite the previous orange key (Good for changing an element)
        //map.remove("apple");         // Use .remove() method and pass in the key to remove an element
        System.out.println(map.get("banana"));  // Use .get() method and pass in the key to get the value
        System.out.println(map.containsKey("pineapple"));  // .containsKey() method checks the hash map for a specific key returns a boolean
        
        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        }else{
            System.out.println("Ket not found");
        }
        
        System.out.println(map.containsValue(1.00));    // Checks if the hash map contains a value returns a boolean (Pay attention to data type!)
        System.out.println(map.size());                 // Returns the size of the hash map
        System.out.println(map);                        // Simple printing of a hash map
        
        System.out.println();
        
        // Custom printing hash maps
        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
