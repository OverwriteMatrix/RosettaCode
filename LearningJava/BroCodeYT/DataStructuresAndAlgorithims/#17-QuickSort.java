// Quick Sort =  Moves smaller elements left of pivot.
//               Recursively divide arrat in 2 partitions
//               Runtime complexity:
//                          Best Case O(n log(n))
//                          Average Case O(n log(n))
//                          Worst Case O(n^2)
//               Space complexity: O(log(n)) due to recursion

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
     
        int array[] = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        
        System.out.print("Original: ");
        for(int i : array){
            System.out.print(i + " ");
        }
        
        quickSort(array, 0, array.length - 1);
        
        System.out.println();
        System.out.print("  Sorted: ");
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start){ return; } // Base case
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;
        for(int j = start; j <= end - 1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
