public class Friend {
    
    String name;
    static int numOfFriends;    // It is as if all the objects share the same variable w/ the Friend class owning it and all objects having access to it
    
    
    Friend(String name){
        this.name = name;
        numOfFriends++;
    }
    
    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }
}
