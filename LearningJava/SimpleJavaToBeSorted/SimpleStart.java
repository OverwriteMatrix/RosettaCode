
public class Java {                                                              // THIS IS A SINGLE LINE COMMENT
                                                                                 /* This is a multi-line comment */
    public static void main(String[] args) {
        
        //____Printing__________________________________________________________
        System.out.println("Hello World!");         //Basic printing
        System.out.print("No Space");               //Printing without space
        System.out.print("......See?");
        System.out.println(" ");
        System.out.println(3);                      //Printing numbers
        System.out.println(80+80);                  //Printing an equation
        
        //____Variable Types____________________________________________________
        
        String myString = "Paxton";
        int myInt = 5;
        float myFloat = 19.99f;
        char myChar = 64;                           //Use ASCII Table for chars
        boolean myBool = false;
        
        char space = 32;                            //32 is the space character
        System.out.println(myString + space + myInt + space + myFloat + 
                           space + myChar + space + myBool);
        
        //____Type Casting______________________________________________________
        
        int typeInt = 4;
        double typeDouble = typeInt;            //Outputs 4.0 instead of just 4
        System.out.println(typeInt + " VS " + typeDouble);
        
        double exDouble = 1.23d;
        int exInt = (int) exDouble;             //Outputs 1 instead of 1.23
        System.out.println(exDouble + " VS " + exInt);
        
        //____If/Else/Else-If Statements________________________________________
        
        if (20 > 18) {
        System.out.println("20 is greater than 18");
        }
        
        if (10 > 18) {
        System.out.println("That\'s Not Right!");
        }
        else {
        System.out.println("That\'s Correct 10 !> 18");
        }
 
        int time = 22;
        if (time < 10) {
        System.out.println("Good morning.");
        } else if (time < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }
        
        //Ternay Operator
        int Time = 20;
        String result = (Time < 18) ? "Good morning." : "Good day.";
        System.out.println(result);
        
        //____Switch____________________________________________________________
        
        int month = 7;
        switch (month) {
            case 1:
                System.out.println("Jan.");
                break;
            case 2:
                System.out.println("Feb.");
                break;
            case 3:
                System.out.println("Mar.");
                break;
            case 4:
                System.out.println("Apr.");
                break;
            case 5:
                System.out.println("May.");
                break;
            case 6:
                System.out.println("Jun.");
                break;
            case 7:
                System.out.println("Jul.");
                break;
            case 8:
                System.out.println("Aug.");
                break;
            case 9:
                System.out.println("Sep.");
                break;
            case 10:
                System.out.println("Oct.");
                break;
            case 11:
                System.out.println("Nov.");
                break;
            case 12:
                System.out.println("Dec.");
                break;
        }
        
        //____Loops________________________________________________________
        
        
        //While Loop
        int i1 = 0;
        while (i1 < 10){
            System.out.print(i1 + " ");
            i1++;
        }
        
        //Do-While Loop
        int i2 = 0;
        do{
            System.out.print(i2 + " ");
            i2++;
        }
        while(i2 < 21);
        
        
        //For Loop                                              // Statement 1 is executed (one time) before the execution of the code block.
        for (int i = 0; i < 5; i++) {                           // Statement 2 defines the condition for executing the code block.
        System.out.println(i);                                  // Statement 3 is executed (every time) after the code block has been executed.
        }                                                       
        
        //Nested Loops
        for (int g = 1; g <= 2; g++) {
        System.out.println("Outer: " + g); //Outer Loop
            for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); //Inner Loop
            }
        }
        
        //For-Each Loop
        String[] cars = {"Honda", "Ford", "BMW", "Nissan"};       //For each string iteration in cars print the iteration and then add a space
        for (String i : cars){
            System.out.print(i + " ");
        }
        
        
        System.out.println(" ");
        
        //____Break and Continue________________________________________________
        
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i + " ");
        }
        
        //VS
        System.out.println(" ");
        
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i + " ");
        }
        
        System.out.println(" ");
        
        //____Arrays____________________________________________________________
        String [] sports = {"Soccer", "Football", "Baseball"};
        System.out.println(sports[0]);
        sports[2] = "Volleyball";
        System.out.println(sports[2]);
        
        //Array For Loop
        String[] carTypes = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < carTypes.length; i++) {
            System.out.print(cars[i] + ", ");
        }
        System.out.println(" ");
        //Array For-Each Loop
        String[] Cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : Cars) {
        System.out.print(i + " ");
        }
        System.out.println(" ");
        
        //Multi-Dimensional Arrays
        int[][] myNumbers = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(myNumbers[1][2]);
    }
}
