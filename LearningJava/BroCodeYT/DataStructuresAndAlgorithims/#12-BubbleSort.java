// Bubble sort = pairs of adjecent elements are compared, and the elements are swapped if they are not in order.
//               Time complexity: O(n^2) (Quadratic time)
//               Small data sets = okay-ish
//               Large data sets = bad

import java.util.Random;

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        long startTime;
        long endTime;
        long elapsedTime;
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int[] array2 = new int[100];
        
        System.out.println("Small Data Set Bubble Sort ----------------------");
        for(int i : array){
            System.out.print(i + " ");
        }
        
        startTime = System.nanoTime();
        bubbleSort(array);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println();
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Elapsed Time Bubble Sort: " + elapsedTime + " ns");
        
        System.out.println();
        
        //----------------------------------------------------------------------
        
        // VIA ChatGPT
        
        // Fill array2 with numbers 1-1000
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        
        // Shuffle array2 using the Fisher-Yates shuffle algorithm
        Random rand = new Random();
        for (int i = array2.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // random index from 0 to i
            // Swap array2[i] and array2[j]
            int temp = array2[i];
            array2[i] = array2[j];
            array2[j] = temp;
        }
        
        System.out.println("Large Data Set Bubble Sort ----------------------");
        
        // Print the shuffled array
        for (int num : array2) {
            System.out.print(num + " ");
        }
        
        //----------------------------------------------------------------------
        
        startTime = System.nanoTime();
        bubbleSort(array2);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println();
        for(int i : array2){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Elapsed Time Bubble Sort: " + elapsedTime + " ns");
    }

    private static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        } 
    }
}
