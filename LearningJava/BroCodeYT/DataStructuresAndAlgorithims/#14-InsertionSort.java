// Insertion Sort = After comparing elements to the left shift elements to the right to make room to "insert" a value
//                  Time complexity: O(n^2) (Quadratic time)
//                  Small data set = Decent
//                  Large data set = BAD
//                  Less steps than Bubble Sort
//                  Best case is O(n) (compared to Selection Sort best case O(n^2))

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        
        System.out.print("Original: ");
        for(int i : array){
            System.out.print(i + " ");
        }
        
        insertionSort(array);
        
        System.out.println();
        System.out.print("  Sorted: ");
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
