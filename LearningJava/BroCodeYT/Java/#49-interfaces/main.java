// Interface = A blueprint for a class that specifies a set of abstract methods that implementing classes MUST define.
//             Supports multiple inheritance-like behavior

// By using interfaces a class can have multiple parents unlike classes

// Need to use public keyword in every class/interface when using interfaces

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        
        System.out.println("------------------------------");
        
        Hawk hawk = new Hawk();
        hawk.hunt();
        
        System.out.println("------------------------------");
        
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
