// Static = Makes a variable or method belong to the class rather than to any specific object.
//          Commonly used for utility methods or shared reasources
//
// EX: Math.round(3.99);

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
    
      Friend friend1 = new Friend("SpongeBob");
        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);
        
      Friend friend2 = new Friend("Patrick");
        System.out.println(friend2.name);
        System.out.println(friend2.numOfFriends);   // w/o static on numOfFriends both would be 1 since it is a copy and each object starts from zero even though there are two
        
      System.out.println("-------------------------");
      
      Friend friend3 = new Friend("Dave");
      Friend.showFriends();
      Friend friend4 = new Friend("John");
      Friend.showFriends();
      Friend friend5 = new Friend("Sam");
      Friend.showFriends();
      Friend friend6 = new Friend("Eli");
      Friend.showFriends();
      Friend friend7 = new Friend("Mike");
      Friend.showFriends();
        
      Math.round(3.99); // Right click math and click go to source to see the math class and methods
      
    }
}
