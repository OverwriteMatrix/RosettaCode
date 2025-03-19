// Constructors

// Constructor = A special method to initialize objects
//               You can pass arguments to a constructor and set up inital values

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
     
    // Creating new students and passing in arguments (required now to create a new student object)
    Student student1 = new Student("SpongeBob", 30, 3.2);
    Student student2 = new Student("Patrick", 34, 1.5);
    Student student3 = new Student("Paxton", 19, 3.5);
    
    // Printing out object attributes
    System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);    // Auto enrolled when becoming a student
        student1.study();
        System.out.println("-------------------------");
    System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);    // Auto enrolled when becoming a student
        student2.study();
        System.out.println("-------------------------");
    System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);    // Auto enrolled when becoming a student
        student3.study();
        System.out.println("-------------------------");
        
    }
}
