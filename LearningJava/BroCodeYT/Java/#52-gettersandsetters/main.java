// Getters and Setters

// They help protect object data and add rules for accessing or modifying them.
// GETTERS = Methods that make a field READABLE.
// SETTERS = Methods that make a field WRITEABLE.

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
        Car car = new Car("Charger", "Purple", 20000);
        
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
        
        car.setColor("Blue");
        car.setPrice(-100); // Price stays the same if not greater than zero
        //car.setModel("Honda");  // No Setter Method for this and is also final
        
        System.out.println(car.getColor());
        System.out.println(car.getPrice());  
    }
}
