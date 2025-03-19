/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gpt_budget;

/**
 *
 * @author ChatGPT
 */
import java.io.*;
import java.util.*;

public class BudgetTracker {

    public static final String INCOME = "Income";
    public static final String EXPENSES = "Expenses";
    public static final String SAVINGS = "Savings";

    // Use a map to store entries by category
    private static final String FILE_PATH = "budget_entries.txt";  // Make sure this path is correct

    public static class Entry {
        private double amount;
        private String note;

        public Entry(double amount, String note) {
            this.amount = amount;
            this.note = note;
        }

        public double getAmount() {
            return amount;
        }

        public String getNote() {
            return note;
        }
    }

    // Load the entries from the file
    public static Map<String, List<Entry>> loadEntries() {
        Map<String, List<Entry>> entriesMap = new HashMap<>();
        entriesMap.put(INCOME, new ArrayList<>());
        entriesMap.put(EXPENSES, new ArrayList<>());
        entriesMap.put(SAVINGS, new ArrayList<>());

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 3);
                if (parts.length == 3) {
                    String category = parts[0];
                    double amount = Double.parseDouble(parts[1]);
                    String note = parts[2];

                    Entry entry = new Entry(amount, note);
                    entriesMap.get(category).add(entry);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return entriesMap;
    }

    // Save a new entry to the file
    public static void saveEntry(String category, double amount, String note) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(category + "," + amount + "," + note);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
