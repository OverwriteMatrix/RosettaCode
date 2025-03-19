// Child

public class Fish extends Animal{
    
    @Override       // Tells people that this method is being overridden (overrides the Animal class move method) 
    void move(){    // also checks that the previous method exists (spelled correctly)
        System.out.println("This animal is swimming");
    }
}
