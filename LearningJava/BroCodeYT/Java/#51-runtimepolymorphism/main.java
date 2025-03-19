// Runtime/Dynamic Polymorphism = When the method that gets executed is decided at runtime based on the actual type of the object

import java.util.Scanner;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
        Animal animal;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();
        scanner.nextLine();     // Clearing the input buffer
        
        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }else if (choice == 2){
            animal = new Cat();
            animal.speak();
        }else{
            System.out.println("That wasn't a choice!");
        }
    }
}
