// Polymorphism = "POLY" = "MANY"
//                "MORPH" = "SHAPE"
//                Objects can identify as other objects.
//                Objects can be treated as objects of a common superclass.

// Polymorphism can also be achived by using interfaces instead of classes!

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
        Car car = new Car();
        car.go();
        
        Bike bike = new Bike();
        bike.go();
        
        Boat boat = new Boat();
        boat.go();
        
        System.out.println("------------------------");
        
        // Car[] cars = {car, bike, boat}; // Incompatible types, bikes and boats dont identify as cars
        
        Vehicle[] vehicles = {car, bike, boat};     // All identify as vehicles
        
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
