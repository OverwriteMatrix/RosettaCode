//User input into an array

import java.util.Scanner;


public class userinputintoanarray
{
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String[] foods;
        int size;
        
        System.out.print("What number of foods do you want to input?: ");
        size = scanner.nextInt();
        scanner.nextLine();
        
        foods = new String[size];   //An empty array that has space for a size of elements
        
        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }
        
        for(String food : foods){
            System.out.println(food);
        }
        
        
        
        scanner.close();
        
    }
}
