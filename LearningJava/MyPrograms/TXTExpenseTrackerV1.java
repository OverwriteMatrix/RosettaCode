/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.txtexpensetracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Paxton.Clark
 */
public class TXTExpenseTracker {

    // Income File Paths
    static String salaryhourlypaycheck = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\TXTExpenseTracker\\Income\\salaryhourlypaycheck.txt";
    static String investmentsdividends = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\TXTExpenseTracker\\Income\\investmentsdividends.txt";
    static String otherincome = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\TXTExpenseTracker\\Income\\other.txt";
    static String momanddad = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\TXTExpenseTracker\\Income\\momanddad.txt";
    // Savings File Paths
    static String mainSavings = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\TXTExpenseTracker\\Savings\\mainsavings.txt";
    static String emergencyFund = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\TXTExpenseTracker\\Savings\\emergencyfund.txt";
    static String otherSavings = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\TXTExpenseTracker\\Savings\\othersavings.txt";
    // Expenses File Paths
    // Debts File Paths
    // Giving/Donations File Paths
    
    static Scanner scanner = new Scanner(System.in);
    private static final String budgetLog = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\TXTExpenseTracker\\budgetLog.txt";
    
    public static void main(String[] args) throws IOException {
        
        boolean isRunning0 = true;
        
        boolean isRunning1 = true;
        boolean isRunning1_1 = true;
        boolean isRunning1_2 = true;
        boolean isRunning1_3 = true;
        boolean isRunning1_4 = true;
        
        boolean isRunning2 = true;
        boolean isRunning2_1 = true;
        boolean isRunning2_2 = true;
        boolean isRunning2_3 = true;
        
        boolean isRunning3 = true;
        boolean isRunning4 = true;
        boolean isRunning5 = true;
        
        int choice0;
        int choice1;
        int choice1_1;
        int choice1_2;
        int choice1_3;
        int choice1_4;
        
        int choice2;
        int choice2_1;
        int choice2_2;
        int choice2_3;
        
        int choice3;
        int choice4;
        int choice5;
        
        String shp_newtotal;
        String id_newtotal;
        String oi_newtotal;
        String md_newtotal;
        
        int passKey = 411223;
        int password = 0;
        
        // Password Protection
        /*
        while (passKey != password){
            System.out.print("Please Enter the Password: ");
            password = scanner.nextInt();
            if(passKey != password){
                System.out.println("That is not the password.");
            }else{
                break;
            }
        }
        */
        
        while(isRunning0){
            System.out.println("****************************");
            System.out.println("BUDGETING PROGRAM");
            System.out.println("****************************");
            System.out.println("1. Income");
            System.out.println("2. Savings");
            System.out.println("3. Expenses");
            System.out.println("4. Debts");
            System.out.println("5. Giving/Donations");
            System.out.println("6. Show Budget");
            System.out.println("7. Exit");
            System.out.println("****************************");
            System.out.print("Enter your choice (1-7): ");
            choice0 = scanner.nextInt();
        
            switch(choice0){
                case 1:
                    //Income
                    while(isRunning1){
                        System.out.println("****************************");
                        System.out.println("INCOME");
                        System.out.println("****************************");
                        System.out.println("1. Salary/Hourly Paycheck");
                        System.out.println("2. Investments/Dividends");
                        System.out.println("3. Other Income");
                        System.out.println("4. Mom and Dad");
                        System.out.println("5. Show Income");
                        System.out.println("6. Back");
                        System.out.println("****************************");
                        System.out.print("Enter your choice (1-6): ");
                        choice1 = scanner.nextInt();
        
                        switch(choice1){
                            case 1:
                                while(isRunning1_1){
                                    System.out.println("****************************");
                                    System.out.println("Salary/Hourly Paycheck");
                                    System.out.println("****************************");
                                    System.out.println("1. Show");
                                    System.out.println("2. Edit");
                                    System.out.println("3. Back");
                                    System.out.println("****************************");
                                    System.out.print("Enter your choice (1-3): ");
                                    choice1_1 = scanner.nextInt();
        
                                    switch(choice1_1){
                                        case 1:
                                            printFileContent(salaryhourlypaycheck);
                                            break;
                                        case 2:
                                            System.out.println("****************************");
                                            System.out.println("Salary/Hourly Paycheck - EDIT");
                                            System.out.println("****************************");
                                            System.out.print("Please input the new total: ");
                                            shp_newtotal = scanner.next();
                                            overwriteStringAfterChar(salaryhourlypaycheck, '$', shp_newtotal);
                                            break;
                                        case 3:
                                            isRunning1_1 = false;
                                            break;
                                        default:
                                            System.out.println("\nThat is an invalid choice\n");
                                    }
                                }
                                break;
                            case 2:
                                while(isRunning1_2){
                                    System.out.println("****************************");
                                    System.out.println("Investments/Dividends");
                                    System.out.println("****************************");
                                    System.out.println("1. Show");
                                    System.out.println("2. Edit");
                                    System.out.println("3. Back");
                                    System.out.println("****************************");
                                    System.out.print("Enter your choice (1-3): ");
                                    choice1_2 = scanner.nextInt();
        
                                    switch(choice1_2){
                                        case 1:
                                            printFileContent(investmentsdividends);
                                            break;
                                        case 2:
                                            System.out.println("****************************");
                                            System.out.println("Investments/Dividends - EDIT");
                                            System.out.println("****************************");
                                            System.out.print("Please input the new total: ");
                                            id_newtotal = scanner.next();
                                            overwriteStringAfterChar(investmentsdividends, '$', id_newtotal);
                                            break;
                                        case 3:
                                            isRunning1_2 = false;
                                            break;
                                        default:
                                            System.out.println("\nThat is an invalid choice\n");
                                    }
                                }
                                break;
                            case 3:
                                while(isRunning1_3) {
                                    System.out.println("****************************");
                                    System.out.println("Investments/Dividends");
                                    System.out.println("****************************");
                                    System.out.println("1. Show");
                                    System.out.println("2. Edit");
                                    System.out.println("3. Back");
                                    System.out.println("****************************");
                                    System.out.print("Enter your choice (1-3): ");
                                    choice1_3 = scanner.nextInt();
        
                                    switch(choice1_3){
                                        case 1:
                                            printFileContent(otherincome);
                                            break;
                                        case 2:
                                            System.out.println("****************************");
                                            System.out.println("Investments/Dividends - EDIT");
                                            System.out.println("****************************");
                                            System.out.print("Please input the new total: ");
                                            oi_newtotal = scanner.next();
                                            overwriteStringAfterChar(otherincome, '$', oi_newtotal);
                                            break;
                                        case 3:
                                            isRunning1_3 = false;
                                            break;
                                        default:
                                            System.out.println("\nThat is an invalid choice\n");
                                    }
                                }
                                break;
                            case 4:
                                while(isRunning1_4){
                                    System.out.println("****************************");
                                    System.out.println("Mom and Dad");
                                    System.out.println("****************************");
                                    System.out.println("1. Show");
                                    System.out.println("2. Edit");
                                    System.out.println("3. Back");
                                    System.out.println("****************************");
                                    System.out.print("Enter your choice (1-3): ");
                                    choice1_4 = scanner.nextInt();
        
                                    switch(choice1_4){
                                        case 1:
                                            printFileContent(momanddad);
                                            break;
                                        case 2:
                                            System.out.println("****************************");
                                            System.out.println("Mom and Dad - EDIT");
                                            System.out.println("****************************");
                                            System.out.print("Please input the new total: ");
                                            md_newtotal = scanner.next();
                                            overwriteStringAfterChar(momanddad, '$', md_newtotal);
                                            break;
                                        case 3:
                                            isRunning1_4 = false;
                                            break;
                                        default:
                                            System.out.println("\nThat is an invalid choice\n");
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Income");
                                System.out.println("****************************************");
                                System.out.print("  ");printFileContent(salaryhourlypaycheck);
                                System.out.print("  ");printFileContent(investmentsdividends);
                                System.out.print("  ");printFileContent(otherincome);
                                System.out.print("  ");printFileContent(momanddad);
                                break;
                            case 6:
                                isRunning1 = false;
                                break;
                            default:
                                System.out.println("\nThat is an invalid choice\n");
                        }
                    }
                    break;
                case 2:
                    //Savings   
                    while(isRunning2){
                        System.out.println("****************************");
                        System.out.println("SAVINGS");
                        System.out.println("****************************");
                        System.out.println("1. Main Savings");
                        System.out.println("2. Emergency Fund");
                        System.out.println("3. Other Savings");
                        System.out.println("4. Show Income");
                        System.out.println("0. Back");
                        System.out.println("****************************");
                        System.out.print("Enter your choice: ");
                        choice2 = scanner.nextInt();
        
                        switch(choice2){
                            case 1:
                                while(isRunning2_1){
                                    System.out.println("****************************");
                                    System.out.println("Main Savings");
                                    System.out.println("****************************");
                                    System.out.println("1. Show");
                                    System.out.println("2. Edit");
                                    System.out.println("0. Back");
                                    System.out.println("****************************");
                                    System.out.print("Enter your choice: ");
                                    choice2_1 = scanner.nextInt();
        
                                    switch(choice2_1){
                                        case 1:
                                            printFileContent(mainSavings);
                                            break;
                                        case 2:
                                            System.out.println("****************************");
                                            System.out.println("Main Savings - EDIT");
                                            System.out.println("****************************");
                                            System.out.print("Please input the new total: ");
                                            shp_newtotal = scanner.next();
                                            overwriteStringAfterChar(mainSavings, '$', shp_newtotal);
                                            break;
                                        case 0:
                                            isRunning2_1 = false;
                                            break;
                                        default:
                                            System.out.println("\nThat is an invalid choice\n");
                                    }
                                }
                                break;
                            case 2:
                                while(isRunning2_2){
                                    System.out.println("****************************");
                                    System.out.println("Investments/Dividends");
                                    System.out.println("****************************");
                                    System.out.println("1. Show");
                                    System.out.println("2. Edit");
                                    System.out.println("3. Back");
                                    System.out.println("****************************");
                                    System.out.print("Enter your choice (1-3): ");
                                    choice2_2 = scanner.nextInt();
        
                                    switch(choice2_2){
                                        case 1:
                                            printFileContent(investmentsdividends);
                                            break;
                                        case 2:
                                            System.out.println("****************************");
                                            System.out.println("Investments/Dividends - EDIT");
                                            System.out.println("****************************");
                                            System.out.print("Please input the new total: ");
                                            id_newtotal = scanner.next();
                                            overwriteStringAfterChar(investmentsdividends, '$', id_newtotal);
                                            break;
                                        case 3:
                                            isRunning2_2 = false;
                                            break;
                                        default:
                                            System.out.println("\nThat is an invalid choice\n");
                                    }
                                }
                                break;
                            case 3:
                                while(isRunning2_3) {
                                    System.out.println("****************************");
                                    System.out.println("Investments/Dividends");
                                    System.out.println("****************************");
                                    System.out.println("1. Show");
                                    System.out.println("2. Edit");
                                    System.out.println("3. Back");
                                    System.out.println("****************************");
                                    System.out.print("Enter your choice (1-3): ");
                                    choice2_3 = scanner.nextInt();
        
                                    switch(choice2_3){
                                        case 1:
                                            printFileContent(otherincome);
                                            break;
                                        case 2:
                                            System.out.println("****************************");
                                            System.out.println("Investments/Dividends - EDIT");
                                            System.out.println("****************************");
                                            System.out.print("Please input the new total: ");
                                            oi_newtotal = scanner.next();
                                            overwriteStringAfterChar(otherincome, '$', oi_newtotal);
                                            break;
                                        case 3:
                                            isRunning2_3 = false;
                                            break;
                                        default:
                                            System.out.println("\nThat is an invalid choice\n");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Savings");
                                System.out.println("****************************************");
                                System.out.print("  ");printFileContent(salaryhourlypaycheck);
                                System.out.print("  ");printFileContent(investmentsdividends);
                                System.out.print("  ");printFileContent(otherincome);
                                System.out.print("  ");printFileContent(momanddad);
                                break;
                            case 0:
                                isRunning2 = false;
                                break;
                            default:
                                System.out.println("\nThat is an invalid choice\n");
                        }
                    }
                    break;
                case 3:
                    //Expenses
                    while(isRunning3){
                        System.out.println("****************************");
                        System.out.println("EXPENSES");
                        System.out.println("****************************");
                        System.out.println("1. ");
                        System.out.println("2. ");
                        System.out.println("3. ");
                        System.out.println("4. ");
                        System.out.println("5. ");
                        System.out.println("6. Show Budget");
                        System.out.println("7. Back");
                        System.out.println("****************************");
                        System.out.print("Enter your choice (1-7): ");
                        choice3 = scanner.nextInt();
        
                        switch(choice3){
                            case 1:
                                System.out.println("Label");
                                break;
                            case 2:
                                System.out.println("Label");
                                break;
                            case 3:
                                System.out.println("Label");
                                break;
                            case 4:
                                System.out.println("Label");
                                break;
                            case 5:
                                System.out.println("Label");
                                break;
                            case 6:
                                
                                break;
                            case 7:
                                isRunning3 = false;
                                break;
                            default:
                                System.out.println("\nThat is an invalid choice\n");
                        }
                    }
                    break;
                case 4:
                    //Debts
                    while(isRunning4){
                        System.out.println("****************************");
                        System.out.println("DEBTS");
                        System.out.println("****************************");
                        System.out.println("1. Mortgage(s)");
                        System.out.println("2. Automotive");
                        System.out.println("3. Credit Card(s)");
                        System.out.println("4. Education");
                        System.out.println("5. Medical");
                        System.out.println("6. Other Debt");
                        System.out.println("7. Show Budget");
                        System.out.println("8. Back");
                        System.out.println("****************************");
                        System.out.print("Enter your choice (1-8): ");
                        choice4 = scanner.nextInt();
        
                        switch(choice4){
                            case 1:
                                System.out.println("MORTGAGE(S)");
                                break;
                            case 2:
                                System.out.println("AUTOMOTIVE");
                                break;
                            case 3:
                                System.out.println("CREDIT CARD(S)");
                                break;
                            case 4:
                                System.out.println("EDUCATION");
                                break;
                            case 5:
                                System.out.println("MEDICAL");
                                break;
                            case 6:
                                System.out.println("OTHER DEBT");
                                break;
                            case 7:
                                
                                break;
                            case 8:
                                isRunning4 = false;
                                break;
                            default:
                                System.out.println("\nThat is an invalid choice\n");
                        }
                    }
                    break;
                case 5:
                    //Giving/Donations
                    while(isRunning5){
                        System.out.println("****************************");
                        System.out.println("GIVING/DONATIONS");
                        System.out.println("****************************");
                        System.out.println("1. Donations");
                        System.out.println("2. Birthdays");
                        System.out.println("3. Holidays");
                        System.out.println("4. Other");
                        System.out.println("5. Show Budget");
                        System.out.println("6. Back");
                        System.out.println("****************************");
                        System.out.print("Enter your choice (1-6): ");
                        choice5 = scanner.nextInt();
        
                        switch(choice5){
                            case 1:
                                System.out.println("Donations");
                                break;
                            case 2:
                                System.out.println("Birthdays");
                                break;
                            case 3:
                                System.out.println("Holidays");
                                break;
                            case 4:
                                System.out.println("Other");
                                break;
                            case 5:
                                
                                break;
                            case 6:
                                isRunning5 = false;
                                break;
                            default:
                                System.out.println("\nThat is an invalid choice\n");
                        }
                    }
                    break;
                case 6:
                    //Print Budget
                    System.out.println();
                    System.out.println("Paxton's Budget");
                    System.out.println("********************");
                    System.out.println("Income");
                    System.out.print("  ");printFileContent(salaryhourlypaycheck);
                    System.out.print("  ");printFileContent(investmentsdividends);
                    System.out.print("  ");printFileContent(otherincome);
                    System.out.print("  ");printFileContent(momanddad);
                    System.out.println("Savings");
                    System.out.println("Expenses");
                    System.out.println("Debts");
                    System.out.println("Giving/Donations");
                    System.out.println();
                    break;
                case 7:
                    //Exit
                    isRunning0 = false;
                    break;
                default:
                    System.out.println("\nThat is an invalid choice\n");
            }
        }
    }
    
    // Methods
   
    public static void printFileContent(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String readStringFollowingChar(String filePath, char searchChar) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                int index = line.indexOf(searchChar);
                if (index != -1 && index + 1 < line.length()) {
                    return line.substring(index + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void overwriteStringAfterChar(String filePath, char targetChar, String replacementText) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        int charIndex = content.indexOf(targetChar);
        if (charIndex != -1) {
            String newContent = content.substring(0, charIndex + 1) + replacementText;
            Files.write(Paths.get(filePath), newContent.getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Text overwritten successfully!");
            logChange(filePath, replacementText);
        } else {
            System.out.println("Character not found in the document.");
        }
    }
    
    private static void logChange(String filePath, String content) {
        try {
            // Get the current date and time
            String timestamp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a").format(new Date());

            // Extract the file name from the file path
            File file = new File(filePath);
            String fileName = file.getName();

            // Create the log entry
            String logEntry = timestamp + " - Written to " + fileName + ": $" + content + "\n";

            // Append the log entry to the log file
            FileWriter logWriter = new FileWriter(budgetLog, true);
            logWriter.write(logEntry);
            logWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
