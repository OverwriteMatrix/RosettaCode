// Super = Refers to the parent class (subclass <- superclass)
//         Used in constructors and method overriding
//         Calls the parent constructor to initalize attributes
//         Subclass = child        Superclass = parent

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
      Person person = new Person("Paxton", "Clark");
      person.showName();
        
      System.out.println("-----------------------");
      
      Student student = new Student("Harry", "Potter", 3.25);
      student.showName();
      //System.out.println(student.gpa);
      student.showGPA();
      
      System.out.println("-----------------------");
      
      Employee employee = new Employee("Rubius", "Hagrid", 50000);
      employee.showName();
      employee.showSalary();
    }
}
