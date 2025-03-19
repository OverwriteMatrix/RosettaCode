/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timesheettracker;

import com.mycompany.javaguipractice.SimpleClock;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author Paxton.Clark
 */
public class TimeSheetTracker {

    public static void main(String[] args) {
        // Clocks
        SwingUtilities.invokeLater(() -> {
            SimpleClock clock = new SimpleClock();
            Thread clockThread = new Thread(clock);
            clockThread.start(); // Run clock on a separate thread
        });
        
        String Timelogfp = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\TimeSheetTracker\\Timelog.txt";
        
        //Preface
        System.out.println("Hello, Today is: ");
        LocalDate myObjDate = LocalDate.now();
        System.out.println(myObjDate);
        System.out.println(" ");
        System.out.println("The time is: ");
        LocalTime myObjTime = LocalTime.now();
        System.out.println(myObjTime); 
        System.out.println(" ");
            
        Scanner myObjNewWeek = new Scanner(System.in);
        System.out.print("Is this a new week? (Yes/No): ");
        String newWeek = myObjNewWeek.nextLine();
        
        if (newWeek.equals("Yes") || newWeek.equals("yes") || newWeek.equals("Y") || newWeek.equals("y") || newWeek.equals("YES")){
            try{
                FileWriter fstream = new FileWriter("Timelog.txt",true);
                BufferedWriter out = new BufferedWriter(fstream);
                out.write("-------------------------------------------------------------------------------------------------------------------------------\n");
                out.close();
                System.out.println("New week, got it!");
            }catch (Exception e){
                System.err.println("Error while writing to file: " +
                e.getMessage());
            }
        }
        else{
            System.out.println("Not a new week, got it!");
            System.out.println(" ");
        }
        
        //Explanation
        //System.out.println("To use this time sheet tracker only input the first digit of the time and then the minutes in decimal form");
        //System.out.println("EX: 8:30 am -> 8.5 (DO NOT INCLUDE AM/PM)");
        //System.out.println("For Lunch break duration do the same thing in units of hours with typing hours");
        //Scanner myObjCon = new Scanner(System.in);
        //System.out.println("Press enter to continue......");
        //String buffContinue = myObjCon.nextLine();
        
        //Arrival_______________________________________________________________
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter time arrived: ");
        String timeArrived = myObj.nextLine();
        
        double arrives = 0;
        
        switch (timeArrived) {
            case "7:00":
                arrives = 7;
                break;
            case "7:15":
                arrives = 7.25;
                break;
            case "7:30":
                arrives = 7.5;
                break;
            case "7:45":
                arrives = 7.75;
                break;
            case "7:50":
                arrives = 7.833;
                break;
            case "7:55":
                arrives = 7.91667;
                break;  
            case "8:00":
                arrives = 8;
                break;
            case "8:10":
                arrives = 8.167;
                break;
            case "8:15":
                arrives = 8.25;
                break;
            case "8:20":
                arrives = 8.333;
                break;
            case "8:25":
                arrives = 8.4167;
                break;
            case "8:30":
                arrives = 8.5;
                break;
            case "8:45":
                arrives = 8.75;
                break;  
            case "9:00":
                arrives = 9;
                break;
            case "9:15":
                arrives = 9.25;
                break;
            case "9:30":
                arrives = 9.5;
                break;
            case "9:45":
                arrives = 9.75;
                break;
            case "10:00":
                arrives = 10;
                break;
            case "10:15":
                arrives = 10.25;
                break;
            case "10:30":
                arrives = 10.5;
                break;
            case "10:45":
                arrives = 10.75;
                break;    
            case "11:00":
                arrives = 11;
                break;
            case "11:15":
                arrives = 11.25;
                break;
            case "11:30":
                arrives = 11.5;
                break;
            case "11:45":
                arrives = 11.75;
                break;
            default:
                System.out.println("Sorry I Don\'t Know That Time");
                break;
        }
        
        //Lunch_________________________________________________________________
        System.out.println(" ");
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter Lunch Break Duration (in hours): ");
        String timeLunch = myObj1.nextLine();  
        
        double timeforLunch = 0;
        
        switch (timeLunch) {
            case "0":
                timeforLunch = 0;
                break;
            case "1":
                timeforLunch = 1;
                break;
            case "0.5":
                timeforLunch = 0.5;
                break;
            case "1.5":
                timeforLunch = 1.5;
                break;
            case "2":
                timeforLunch = 2;
                break;
            default:
                System.out.println("THAT IS AN INVALID DURATION OF LUNCH");
                break;
        }
        
        //Departure_____________________________________________________________
        System.out.println(" ");
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter time Departed: ");
        String timeDep = myObj2.nextLine();  
        
        double timeDepar = 0;
        
        switch (timeDep) {
            case "4:00":
                timeDepar = 4;
                break;
            case "4:15":
                timeDepar = 4.25;
                break;
            case "4:30":
                timeDepar = 4.5;
                break;
            case "4:45":
                timeDepar = 4.75;
                break;
            case "5:00":
                timeDepar = 5;
                break;
            case "5:10":
                timeDepar = 5.167;
                break;
            case "5:15":
                timeDepar = 5.25;
                break;
            case "5:20":
                timeDepar = 5.333;
                break;
            case "5:25":
                timeDepar = 5.4167;
                break;
            case "5:30":
                timeDepar = 5.5;
                break;
            case "5:45":
                timeDepar = 5.75;
                break;
            case "5:50":
                timeDepar = 5.833;
                break;
            case "5:55":
                timeDepar = 5.91667;
                break;  
            case "6:00":
                timeDepar = 6;
                break;
            case "6:15":
                timeDepar = 6.25;
                break;
            case "6:30":
                timeDepar = 6.5;
                break;
            case "6:45":
                timeDepar = 6.75;
                break;
            case "7:00":
                timeDepar = 7;
                break;
            default:
                System.out.println("Sorry I Don\'t Know That Time");
                break;
        }
        
        //Math__________________________________________________________________
        //System.out.println(" ");
        //System.out.println("You said you arrived at: " + arrives + " am");
        //System.out.println("You said your lunch duration was: " + timeforLunch + " hrs.");
        //System.out.println("You said you departed at: " + timeDepar + " pm");        

        double finalhours = (timeDepar - timeforLunch) + (12 - arrives);
        
        System.out.println(" ");
        System.out.println("Hours for the day are: " + finalhours);
        
        //Print Variables
        //System.out.println("arrives: " + arrives);
        //System.out.println("timeforLunch: " + timeforLunch);
        //System.out.println("timeDepar: " + timeDepar);
        
        //Submission and Writting to the Log____________________________________
        System.out.println(" "); 
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Is this correct? (Y/N): ");
        String subAns = myObj3.nextLine();
        
        if (subAns.equals("Yes") || subAns.equals("yes") || subAns.equals("Y") || subAns.equals("y") || subAns.equals("YES")){
            //System.out.println("Yes - Upercase");
            
            System.out.println(" ");
            ArrayList<String> days = new ArrayList<>();
            days.add(" | Arrives: " + arrives + " am " + " | Time for Lunch: " + timeforLunch + " hrs." + " | Departed: " + timeDepar + " pm |" + " Total Hours: " + finalhours);
            System.out.println(days);
            
            try{
                FileWriter fstream = new FileWriter(Timelogfp,true);
                BufferedWriter out = new BufferedWriter(fstream);
                out.write("Line Added on: " + new java.util.Date()+ " | Arrives: " + arrives + " am " + " | Time for Lunch: " + timeforLunch + " hrs." + " | Departed: " + timeDepar + " pm |" + " Total Hours: " + finalhours+ "\n");
                out.close();
            }catch (Exception e){
                System.out.println("Error while writing to file: " + e);
            }
        }
    }
}
