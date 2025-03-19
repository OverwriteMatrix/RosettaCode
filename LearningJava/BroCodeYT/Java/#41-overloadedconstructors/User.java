public class User {
    
    String username;
    String email;
    int age;
    
    User(){                                 // This is a good way to set up default values if no arguments are passed in
        this.username = "GUEST";
        this.email = "Not Provided";
        this.age = 0;
    }
    
    User(String username){
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }
    
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    
    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
    
}
