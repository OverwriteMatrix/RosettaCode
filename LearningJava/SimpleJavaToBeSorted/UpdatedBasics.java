// THIS IS A SINGLE LINE COMMENT
/* This is a multi-line comment */

class Mavenproject7_UpdatedBasics_PC {

    void nonStaticTest(){
        System.out.println("Non-Static Method");
    }
    
    public static void staticTest(){
        System.out.println("Static Method");
    }
    
    
   
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");              //Print Statement (With new line after)
        System.out.print("Hello World! (No New Line)");  //Print Statement (No new line AFTER)
        System.out.println("......See?");
        
        //Non-Static vs. Static Tests
        Mavenproject7_UpdatedBasics_PC helloWorldObject = new Mavenproject7_UpdatedBasics_PC();  //Creating a new object
        helloWorldObject.nonStaticTest(); //NON-Static Requires object creation
        staticTest();                     //Static Methods do not!
        
        
        double d = 1.12345678;
        
        
        
        
    }
}
