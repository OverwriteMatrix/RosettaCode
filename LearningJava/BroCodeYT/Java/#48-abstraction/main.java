// Abstraction = Used to define abstract classes and methods.
//               Abstraction is the process of hiding implementation details and showing only the essential features;
//               Abstract classes CAN'T be instantiated directly
//               Can contain "abstract" methods (which must be implemented)
//               Can contain "concrete" methods (which are inherited)

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
        //Shape shape = new Shape(); // Gives an error message since shape is an abstract class and therefor cannot create objects from it
        
        Circle circle = new Circle(3);
        circle.display();
        System.out.println(circle.area());
        
        System.out.println("------------------------");
        
        Triangle triangle = new Triangle(4, 5);
        triangle.display();
        System.out.println(triangle.area());
        
        System.out.println("------------------------");
        
        Rectangle rectangle = new Rectangle(6, 7);
        rectangle.display();
        System.out.println(rectangle.area()); 
    }
}
