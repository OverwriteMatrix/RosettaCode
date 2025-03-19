// .toString() = Method inherited from the Object Class.
//               Used to return a string representation of an object.
//               By default, it returns a hash code as a unique identifier.
//               It can be overrriden to provide meaningful details

// Basically you can override the normal .toString() method that is inherirted 
// from the Object class which normally prints the hash code in order to print 
// what you actually want.

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
        Car car = new Car("Ford", "Mustang", 2025, "Red");
        //System.out.println(car);    // Print the hash code
        
        // Normally to print the entire car object:
        // System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);
        
        // Now with the toString() Method in the Car class
        // Now can print any object with this method
        System.out.println(car);
        
        System.out.println("---------------------------------------------");
        
        Car car1 = new Car("Honda", "Accord", 2025, "Blue");
        Car car2 = new Car("Ford", "F-150", 2020, "Light Gray");
        Car car3 = new Car("Chevolette", "Corvette", 2023, "Black");
        
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
