// Composition = Represents a "part-of" relationship between objects.
//               For example, an Engine is "part-of" a Car.
//               Allows complex objects to be constructed from smaller objects.

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
      
        Car car = new Car("Honda", 2025, "V6");
        
        System.out.println(car.model);
        System.out.println(car.year);
        //System.out.println(car.engine); // This gives the hash id
        System.out.println(car.engine.type);
        
        car.start();
        
    }
}
