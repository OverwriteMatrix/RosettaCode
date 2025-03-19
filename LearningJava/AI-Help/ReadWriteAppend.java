/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.writetoexceltest;

import java.io.*;

/**
 *
 * @author Paxton.Clark
 */
public class WriteToExcelTest {

    public static void main(String[] args) {
        /*
        //Reading from read.txt
        String filePath = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\WriteToExcelTest\\read.txt"; // Path to your text file

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
        */
        /*
        //Writing to read.txt
        String filePath = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\WriteToExcelTest\\write.txt"; // Path to your text file
        String content = "\n\nThis is the CONTENT to write into file\n";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(content);
            bw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        /*
        String filePath = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\WriteToExcelTest\\append.txt"; // Path to your text file
        String content = "\n\n\n\n\n\n\nThis is the content to append to this file...again\n";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(content);
            bw.close();
            System.out.println("File appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        
        String filePath = "specChar.txt";
        char searchChar = '@'; // Character to search for

        String result = readStringFollowingChar(filePath, searchChar);
        if (result != null) {
            System.out.println("String following character '" + searchChar + "': " + result);
        } else {
            System.out.println("Character '" + searchChar + "' not found or no string follows it.");
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
}
