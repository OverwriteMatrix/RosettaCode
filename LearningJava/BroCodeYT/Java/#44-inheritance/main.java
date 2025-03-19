// Inheritance = One class inherits the attributes and methods from another class
//               Child <- Parent <- Grandparent

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
      // The cat and dog classes are the children of the animal class 
      // (the parent), so even though they are "blank", when you put extends 
      // Animal they inherit all the attributes and methods from its parent 
      // of Animal.
      
      // Most helpful when you have hundreds of "children" not just two
      // Follow D.R.Y. = DONT REPEAT YOURSELF
        
      Dog dog = new Dog();
        System.out.println(dog.isAlive);
        dog.eat();
        System.out.println(dog.lives);
        dog.speak();
        
      System.out.println("----------------");
      
      Cat cat = new Cat();
        System.out.println(cat.isAlive);
        cat.eat();
        System.out.println(cat.lives);
        cat.speak();
      
      System.out.println("----------------");  
      
      Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthesize();
        
        //dog.photosynthesize(); // Doesn't work because dogs do not inherit the method
    }
}
