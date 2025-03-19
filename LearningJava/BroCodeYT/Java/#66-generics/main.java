// Generics = A concept where you can write a class, interface, or method that is compatible with different data types
//            <T> type parameter (placeholder that gets replaced with a real type)
//            <String> type argument (specifies the type)

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
       
       Box<String> box1 = new Box<>();
       box1.setItem("Banana");
       System.out.println(box1.getItem());
       
       Box<Integer> box2 = new Box<>();
       box2.setItem(2);
       System.out.println(box2.getItem());
       
       Product<String, Double> product1 = new Product<>("apple", 0.50);
       System.out.println(product1.getItem());
       System.out.println(product1.getPrice());
       
       Product<String, Integer> product2 = new Product<>("ticket", 15);
       System.out.println(product2.getItem());
       System.out.println(product2.getPrice());
    }
}
