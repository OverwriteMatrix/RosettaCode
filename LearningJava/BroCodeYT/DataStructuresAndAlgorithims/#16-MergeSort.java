// Merge Sort = Recursively divide array into two, sort, re-combine
//              Runtime complexity: O(n Log n)
//              Space complexity: O(n)

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        int array[] = {8, 2, 5, 3, 4, 7, 9, 6, 1};
        
        System.out.print("Original: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        
        mergeSort(array);
        
        System.out.println();
        System.out.print("  Sorted: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length <= 1){ return; } // Base Case
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0; // Left Array
        int j = 0; // Right Array
        for(; i < length; i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    
    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // Indices
        // Check conditionas for merging
        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
        
    }
}
