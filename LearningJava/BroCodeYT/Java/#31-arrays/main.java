import java.util.Arrays;

// Arrays = a collection of values of the SAME data type (think of it as a variable that can store more than 1 value (but needs to be the same type))

public class BroCode_variablescope
{
    
    public static void main(String[] args) {
        
        String[] fruits = {"apple", "orange", "banana", "coconuts"};
        //System.out.println(fruits); //This prints out the array address since arrays are reference data types (aka this doesn't work to print out the array)
        
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        //System.out.println(fruits[100]);    //Will throw an exception since that element doesn't exsist within the array
        
        System.out.println("\n*********************\n");
        
        fruits[0] = "blueberry";        //Changes the first element (apple) to blueberry
        System.out.println(fruits[0]);
        
        int numOfFruits = fruits.length;    //gives the number of elements in fruits
        System.out.println(numOfFruits);
        
        System.out.println("\n*********************\n");
        
        for(int i = 0; i < numOfFruits; i++){   //How to print the entire array
            //System.out.println(fruits[i]);    //Print w/ new line (Vertically)
            System.out.print(fruits[i] + " "); //Print w/ space separated list (Horizontally)
        }
        
        System.out.println("\n\n*********************\n");
        
        //Arrays.sort(fruits);    //Sorts the array alphabetically (if numbers sorts ascending number)
        Arrays.fill(fruits, "pineapple");   //Fills the array with pineapples
        
        //Printing the entire array with an enhanced for loop (for-each loop)
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
