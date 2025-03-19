/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.targetedstring;

/**
 *
 * @author Paxton.Clark
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TargetedString {

    public static void main(String[] args) {
        String filePath = "index.txt"; // Path to your text file
        String targetString = "P"; // String you want to find and replace
        String newString = "X"; // New string to replace the target string with

        try {
            // Read the entire file into a list of strings
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            List<String> lines = new ArrayList<>();
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains(targetString)) {
                    line = line.replace(targetString, newString); // Replace the target string within the line
                }
                lines.add(line);
            }
            br.close();

            // Write the updated content back to the file
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
            bw.close();

            System.out.println("Target string replaced successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
