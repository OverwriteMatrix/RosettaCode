//Search an Array

import java.util.Scanner;


public class searchanarray
{
    
    public static void main(String[] args) {
        
        //Searching through a int array
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 8;
        boolean isFound = false;
        
        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
                System.out.println("Element NOT found in array");
        }
        
        System.out.println("\n******************************\n");
        
        //Searching through a String array
        String[] fruits = {"apple", "banana", "pineapple", "coconut", "orange"};
        String target2 = "apple";
        boolean isFound2 = false;
        
        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target2)){                                       //target2 == fruits[i] compares the memory address since strings are reference data types need to use .equals method
                System.out.println("Element found at index: " + i);
                isFound2 = true;
                break;
            }
        }
        if(!isFound2){
                System.out.println("Element NOT found in array");
        }
      
        System.out.println("\n******************************\n");
        
        //Searching through an array w/ user input for target
        
        Scanner scanner = new Scanner(System.in);
        
        String[] cars = {"BMW", "Ford", "Jeep", "Chevy", "Honda"};
        boolean isFound3 = false;
        String target3;
        
        System.out.print("Please enter a car to search for: ");
        target3 = scanner.nextLine();
        
        for(int i = 0; i < cars.length; i++){
            if(cars[i].equals(target3)){                                       
                System.out.println("Element found at index: " + i);
                isFound3 = true;
                break;
            }
        }
        if(!isFound3){
                System.out.println("Element NOT found in array");
        }
        
        scanner.close();
         
    }
}
