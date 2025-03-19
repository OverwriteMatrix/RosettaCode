// Method overriding = When a subclass provides its own implementation of a method that is already defined
//                     Allows for code reusablility and give specific implementations

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
        Dog dog = new Dog();
        dog.move();
        
        System.out.println("----------------");
        
        Cat cat = new Cat();
        cat.move();
        
        System.out.println("----------------");
        
        Fish fish = new Fish();
        fish.move();

    }
}
