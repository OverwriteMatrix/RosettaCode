public class Student {
    
    String name;
    int age;
    double gpa;
    boolean isEnrolled;
    
    Student(String name, int age, double gpa){  // When a new student object is created this constuctor method is automatically ran because we say new Student();
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    
    void study(){
        System.out.println(this.name + " is studying.");
    }
}
