// varargs = allow a method to accept a varying number of arguments. 
//           makes methods more flexible, no need for overloaded methods. 
//           Java will pack the arguments into an array ... (ellipsis)
// varagrs = Variable Arguments


public class varargs
{
    
    public static void main(String[] args) {
        
        add(2, 3, 5);
        add(2, 3, 4, 5, 6, 7, 8, 9, 10);    //Can add any number of arguments
        
        System.out.println(average(1, 2, 3, 4, 5, 6, 7));
        System.out.println(average());
         
    }
    static void add(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }
    
    static double average(double... numbers){
        double sum = 0;
        
        //if(numbers.length == 0){        //Prevents dividing by zero (NaN w/o it if arguments have nothing)
        //    return 0;
        //}
        
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
