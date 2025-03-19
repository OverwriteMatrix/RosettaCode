// This is based on Shenandoah National Park's "How to Determine Hiking Difficulty" Page and may differ between national parks, hikes, and areas of the world.

import java.util.Scanner;
import java.lang.Math;

public class TrailCalculator {
    
    static Scanner scanner = new Scanner(System.in);
    static double miles;
    static double elevation;
    static double result;
    
    
    public static void main(String[] args) {
        System.out.println("Welcome to the hike determination calculator");
        System.out.print("Please enter the length of your hike in miles: ");
        miles = scanner.nextDouble();
        System.out.print("Please enter the elevation gain in feet: ");
        elevation = scanner.nextDouble();
        result = Math.sqrt((elevation * 2) * miles);
        System.out.println("*****************************************************");
        System.out.printf("The hikes numerical rating is: %.1f\n", result);
        if (result < 50){
            System.out.println("This hike is considered: EASY");
        }else if (result == 50 && result < 100){
            System.out.println("This hike is considered: MODERATE");
        }else if (result == 100 && result < 150){
            System.out.println("This hike is considered: MODERATELY STRENUOUS");
        }else if (result == 150 && result <= 200){
            System.out.println("This hike is considered: STRENUOUS");
        }else{
            System.out.println("This hike is considered: VERY STRENUOUS");
        }
        System.out.println("1.5 mph for EASY Trails");
        System.out.println("1.4 mph for MODERATE Trails");
        System.out.println("1.3 mph for MODERATELY STRENUOUS Trails");
        System.out.println("1.2 mph for STRENUOUS and VERY STRENUOUS Trails");
        System.out.println("*****************************************************");
    }
}
