// Selection Sort = Search through an array and keep track of the minimum value during each iteration.
//                  At the end of each iteration, we swap variables and insert the min into the begining index of this iteration.
//                  Runtime complexity: O(n^2) (Quadratic time)
//                  Small data sets: okay
//                  Large data sets: BAD

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        
        System.out.print("Original: ");
        for(int i : array){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        selectionSortAscending(array);
        selectionSortDescending(array);
        
        System.out.print("  Sorted: ");
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void selectionSortAscending(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){  // Switch > to < for decending order
                    min = j; 
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    
    private static void selectionSortDescending(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] < array[j]){  // Switch < to > for ascending order
                    min = j; 
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    } 
}
