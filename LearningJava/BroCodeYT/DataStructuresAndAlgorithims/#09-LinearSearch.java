// Linear Search = Iterage through a collection one element at a time
//
//                 Runtime complexity: O(n)
//
//                 Disadvantages: 
//                 1. Slow for large data sets
//
//                 Advantages:
//                 1. Fast for searches of small to medium data sets
//                 2. Does not need sorted
//                 3. Useful for data structures that do not have random access (Linked Lists)

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        
        int index = linearSearch(array, 2);
        
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }else{
            System.out.println("Element not found");
        }
    } 
    private static int linearSearch(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
