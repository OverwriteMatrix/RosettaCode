// 2D array = An array where each element is an array.
//            Useful for storing a matrix of data


public class twodarrays
{
    
    public static void main(String[] args) {
        
        
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};
        
        String[][] groceries = {fruits, vegetables, meats};
        
        // OR: 
        //String[][] groceries = {{"apple", "orange", "banana"},
        //                        {"potato", "onion", "carrot"},
        //                        {"chicken", "pork", "beef", "fish"}};
        
        // Changing elements
        groceries[0][0] = "pineapple";
        groceries[1][2] = "celery";
        groceries[2][1] = "eggs";
        // [row][column]
        
        for(String[] foods : groceries){
            
            //System.out.println(foods);    //Doesnt work because arrays are reference data types, requires a nested loop
            
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println("\n");
        }
        
        System.out.println("\n******************\n");
        
        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};
        
        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        } 
    }
}
