// Selection Sort: The Snail's Guide to Sorting
// Coding with John: https://www.youtube.com/watch?v=dsqsnngsoD8&list=PLkeaG1zpPTHhXOfy-mFbdqd1Zz4GnjcpC&index=6

import java.util.Arrays;
import java.util.Random;

public class CodingWJohnWorkspace {
    
    public static void main(String[] args){
        
        int[] numbers = new int[100000];            // One Hundred Thousand (100,000)
        Random random = new Random();
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1000000);   // One Million (1,000,000)
        }
        
        System.out.println(Arrays.toString(numbers));
        long startTime = System.currentTimeMillis();
        selectionSort(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        
        System.out.println();
        System.out.println("It Took: " + (endTime - startTime) + " ms");
    }
    
    private static void selectionSort(int[] numbers){
        int length = numbers.length;
        for(int i = 0; i < length - 1; i++){
            int min = numbers[i];
            int indexOfMin = i;
            for(int j = i + 1; j < length; j++){
                if(numbers[j] < min){
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }
    }
    
    private static void swap(int[] numbers, int a, int b){
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;     
    }
}
