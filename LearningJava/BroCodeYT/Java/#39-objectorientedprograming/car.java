public class Car {
    
    String make = "Jeep";
    String model = "Wrangler";
    int year = 2004;
    double price = 10000;
    boolean isRunning = false;
    
    void start(){
        System.out.println("You started the engine");
        isRunning = true;
        System.out.println("isRunning: " + isRunning + "\n");
    }
    void stop(){
        System.out.println("You stopped the engine");
        isRunning = false;
        System.out.println("isRunning: " + isRunning + "\n");
    }
    void drive(){
        System.out.println("You drive the " + model);
    }
    void brake(){
        System.out.println("You break the " + model);
    }
}
