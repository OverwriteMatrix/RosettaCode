// method = a block of reusable code that is executed when called ()
// D.R.Y. = Don't Repeat Yourself

public class Java_BroCode_1_methods {
  
    public static void main(String[] args) {
        
        String paxName = "Paxton";
        int paxAge = 20;
        
        happyBirthday(paxName, paxAge); // (Argument, Argument)
        
        System.out.println("1-5 Squared");
        System.out.println(square(1));
        System.out.println(square(2));
        System.out.println(square(3));
        System.out.println(square(4));
        System.out.println(square(5)+"\n");
        
        System.out.println("1-5 Cubed");
        System.out.println(cubed(1));
        System.out.println(cubed(2));
        System.out.println(cubed(3));
        System.out.println(cubed(4));
        System.out.println(cubed(5)+"\n");
        
        System.out.println(getFullName("SpongeBob", "Squarepants"));
        
        int age = 21;
        int age2 = 17;
        
        System.out.println(ageCheck(age));
        System.out.println(ageCheck(age2));
    }
    
    static void happyBirthday(String name, int age){    // (Parameter, Parameter)
        System.out.println("Happy Birthday to you,");
        System.out.println("Happy Birthday to you,");
        System.out.println("Happy Birthday dear " + name + ",");
        System.out.println("Happy Birthday to you!\n");
        System.out.println("Happy Birthday " + name + ", you are " + age + " years old!\n");
    }
    
    static double square(double number){
        return number * number;
    }
    
    static double cubed(double number){
        return number * number * number;
    }
    
    static String getFullName(String first, String last){
        return first + " " + last + "\n";
    }
    
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}

