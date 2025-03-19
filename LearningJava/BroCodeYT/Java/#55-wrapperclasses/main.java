// Wrapper Classes = Allow primitive values (int, char, double, boolean) to be used as objects
//                   "Wrap them in an object"
//                   Generally, you don't wrap primitives unless you need an object.
//                   Allows use of Collections Framework and static Utility Methods.

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
      
        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        String e = "Pizza"; // Have always created strings this way
        
        // Unboxing
        int x = a;
        double y = b;
        // ect.
        
        // To String Methods (Using a wrapper class to transform to a string)
        String one = Integer.toString(123);
        String two = Double.toString(3.14);
        String three = Character.toString('$');
        String four = Boolean.toString(true);
        
        String xyz = one + two + three + four; // Now you can use string concatination
        System.out.println(xyz);
        
        // Parsing 
        int f = Integer.parseInt("123");
        double g = Double.parseDouble("3.14");
        char h = "Pizza".charAt(0); // Characters do not have a parse method just the .chatAt string method
        boolean i = Boolean.parseBoolean("true");
        
        //String abc = f + g + h + i; // No longer works because they all are no longer strings (mixing and matching differnt types)
        
        // Other helpful utility methods in wrapper classes
        char letter = 'b';
        System.out.println(Character.isLetter(letter));     // Returns T/F if the character inputted is a letter or not
        System.out.println(Character.isUpperCase(letter));  // Returns T/F if the character inputted is uppercase or not 
    }
}
