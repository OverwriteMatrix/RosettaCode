// Object-Oriented Programming

// Object = An entity that holds data (attributes) and can perform actions (methods) 
//          It is a reference data type

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
     
    // Past object examples
    // Scanner scanner = new Scanner(System.in);
    // Random random = new Random();
    
    Car car = new Car();    // Creating a new car object from the car class (a copy)
    
    System.out.println(car); // Gives a memory address of car since it is a refernce data type
    
    System.out.println("-----------------");
    
    // Accessing Object Attributes
    System.out.println(car.make);   // Use the . (dot operator) to access things within an object
    System.out.println(car.model);
    System.out.println(car.year);
    System.out.println(car.isRunning);
    
    System.out.println("-----------------");
    
    // Chaninging Object Attributes (changes the car copy's (defined above) attrubutes not the car class' attrubutes)
    car.isRunning = true;
    System.out.println(car.isRunning);
    
    System.out.println("-----------------");
    
    // Object Methods
    car.start();
    car.stop();
    car.drive();
    car.brake();
    
    System.out.println("-----------------");
    
    // Creating more car objects
    Car car2 = new Car();   // Creating two more car objects
    Car car3 = new Car();
    
    System.out.println(car2.make + " " + car2.model);   // Each object created has the same attributes
    System.out.println(car3.make + " " + car3.model);
    
    }
}
