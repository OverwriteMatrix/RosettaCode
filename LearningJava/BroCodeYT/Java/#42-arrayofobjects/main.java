// Array of Objects

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Black");
        Car car3 = new Car("Charger", "Purple");
        
        Car[] cars = {car1, car2, car3};
        
        // Regular for loop
        //for(int i = 0; i < cars.length; i++){
        //    cars[i].drive();  
        //}
        
        // Enhanced for loop
        for(Car car : cars){
            car.drive();  
        }
        
        System.out.println("--------------------------------------");
        
        // Anonymous Objects
        Car[] cars2 = {new Car("Mustang", "Yellow"), 
                       new Car("Corvette", "Red"), 
                       new Car("Charger", "White")};
        // Changing all the cars' color in cars2
        for(Car car : cars2){
            car.color = "Gray";
        }
        // Driving all the cars in cars2
        for(Car car : cars2){
            car.drive();
        }
        
    }
}
