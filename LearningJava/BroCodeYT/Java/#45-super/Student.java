public class Student extends Person{
    
    double gpa;
    
    Student(String first, String last, double gpa){
        // Instead of:
        // this.first = first;
        // this.last = last;
        // Do this:
        super(first, last);
        
        this.gpa = gpa;
    }
    
    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}
