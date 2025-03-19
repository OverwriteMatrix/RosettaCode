public class Mavenproject3_Classes_PC {

static class five{
    int x = 5;
}
    
static public class Main {
  int x = 10;      //Cannot use final int will throw an error
}   
    
static public class main1 {
    String fname = "John";
    String lname = "Doe";
    int age = 24;
}    

//Static vs Public Methods______________________________________________________
static void myStaticMethod(){
    System.out.println("Static methods can be called without creating objects");
}   

static public class main2{
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    
    //Speed Example
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}    
  
    //Main
    public static void main(String[] args) {
    
    //Displaying an object from a class
    five myObj1 = new five();
    System.out.println(myObj1.x);   //Outputs 5
     
    //Acessing/Modifying Attributes    
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);   
    
    //Multiple Objects
    five myObj2 = new five(); //Outputs 5
    five myObj3 = new five(); //Outputs 5
    myObj3.x = 25;
    System.out.println(myObj2.x); //Outputs 5
    System.out.println(myObj3.x); //Now outputs 25
    
    //Multiple Attributes
    main1 myObj5 = new main1();
    System.out.println("Name: " + myObj5.fname + " " + myObj5.lname);
    System.out.println("Age: " + myObj5.age);
    
    //Calling Static vs. Public Methods_________________________________________
    myStaticMethod();
    
    main2 myObj6 = new main2();
    myObj6.myPublicMethod();
    
    //Speed Example
    main2 myCar = new main2();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method (JUST A TXT METHOD)
    myCar.speed(200);          // Call the speed() method (PUTS SELECTED SPEED IN "MAX SPEED")    
    }
}
