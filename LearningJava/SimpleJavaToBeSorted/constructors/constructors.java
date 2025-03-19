public class Mavenproject4_Constructors_PC {

    public static void main(String[] args) {
        
      Human human1 = new Human("Rick", 25, 200);
      Human human2 = new Human("David", 40, 220);
      
      System.out.println(human1.name);
      System.out.println(human2.name);
      
      human2.eat();
      human1.drink();
    }
}
