public class Mavenproject2_Methods_PC {
    
    //Methods
    static void multiply(int a, int b){
    System.out.println(a * b);
    }
    
    static void name(String x) {
    System.out.println(x + " Clark");
    }
    
    static void info(String x, String y, int z){
        System.out.println(x + " " + y + " is " + z + " years old.");
    }
    
    //Method Return Values
    static int reVals(int x){
        return x + 5;
    }
    
    //Methods with the same name/Overloading Methods
    static int plusMethod(int x, int y) {                  //Methods can have the same name if they intake different types
    return x + y;
    }   
    
    static double plusMethod(double x, double y) {
    return x + y;
    }   
    
    static int sum(int k){
        if (k > 0) {
            return k + sum(k-1);
        } else{
            return 0;
        }
    }
    
    
    //Main
    public static void main(String[] args) { 
    
    //Calling Methods
    multiply(5, 100);
    multiply(200, 1000);
    
    name("Liam");
    name("David");
    
    info("Paxton", "Clark", 19);
    info("Sierra", "Clark", 17);
    
    System.out.println(reVals(10));
    System.out.println(reVals(15));
    
    System.out.println(plusMethod(3, 4));
    System.out.println(plusMethod(2.5, 3.25));
    
    System.out.println(sum(6));     //6+5+4+3+2+1+0 = 21
    System.out.println(sum(7));
    }
}
