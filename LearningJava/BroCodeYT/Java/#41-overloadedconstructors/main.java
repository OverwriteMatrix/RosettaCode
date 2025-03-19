// Overloaded Constructors = Allows a class to have multiple constructors with different parameter lists.
//                           Enable objects to be initalized in various ways.
//                           Good for "optional" attributes
//                           VERY SIMILAR TO OVERLOADED METHODS

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
    // Username Only
    User user1 = new User("paxton.clark");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
    
    System.out.println("----------------------");
        
    // Username and Email
    User user2 = new User("sierra.clark", "sierra.clark25@gmail.com");
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
        
    System.out.println("----------------------");
    
    //Username, Email, and Age
    User user3 = new User("dakota.clark", "dakota.clark25@gmail.com", 17);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    
    System.out.println("----------------------");    
        
    // Guest User No Attributes
    User user4 = new User();
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
        
    }
}
