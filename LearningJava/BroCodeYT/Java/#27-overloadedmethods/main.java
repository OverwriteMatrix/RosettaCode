// overloaded methods = methods that share the same name but different parameters
//                      a method signature = name + parameters
//                      no two methods can have the same signature!

public class Java_BroCode_1_overloadedmethods {

    public static void main(String[] args) {
        
        System.out.println(add(1,2)); 
        
        space();
        
        System.out.println(add(1,2,3));
        
        space();
        
        String pizza = bakePizza("Flat Bread");
        System.out.println(pizza);
        
        space();
        
        String pizza2 = bakePizza("Deep Dish", "Mozzarella");
        System.out.println(pizza2);
        
        space();
        
        String pizza3 = bakePizza("Deep Dish", "Mozzarella", "Peperoni");
        System.out.println(pizza3);
        
        space();
    }
    
    // Add Methods
    static double add(double a, double b){
        return a + b;
    }
    static double add (double a, double b, double c){
        return a + b + c;
    }
    
    // Baking Pizza Methods
    static String bakePizza(String bread){
        return bread + " Pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + " Pizza /w " + cheese;
    }
    static String bakePizza(String bread, String cheese, String topping1){
        return bread + " Pizza /w " + cheese + ", " + topping1;
    }
    
    // Space Method
    static void space(){
        System.out.println("\n");
    }
}
