// Anonymous Class = A class that doesn't have a name. Cannot be reused.
//                   Add custom behavior without having to create a new class.
//                   Often used for one time uses (TimerTask, Runnable, callbacks)

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.speak();
        
        // Creating/using an anonymous class
        // (Do this instead of creating a whole new class only for one object (in this case only for scooby-doo))
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says Ruh Roh!");
            }
        };
        dog2.speak();
    }
}
