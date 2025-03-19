/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gpt_budget;

/**
 *
 * @author ChatGPT
 */

import java.util.List;
import java.util.Map;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class GPT_Budget extends JFrame {

    private JTextField amountField;
    private JTextField noteField;
    private JButton saveButton;
    private JButton refreshButton;
    private JTextArea displayArea;

    private JComboBox<String> categoryComboBox;  // Dropdown for category selection

    private static final String FILE_PATH = "budget_entries.txt";

    public GPT_Budget() {
        setTitle("Budget Tracker");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input fields
        amountField = new JTextField(10);
        noteField = new JTextField(10);
        saveButton = new JButton("Save Entry");
        refreshButton = new JButton("Refresh");

        // Category Dropdown
        categoryComboBox = new JComboBox<>(new String[] {"Income", "Expenses", "Savings"});

        // Display Area (for showing categories and amounts)
        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);

        // Adding components
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Category:"));
        inputPanel.add(categoryComboBox);  // Add dropdown to the panel
        inputPanel.add(new JLabel("Amount:"));
        inputPanel.add(amountField);
        inputPanel.add(new JLabel("Note:"));
        inputPanel.add(noteField);
        inputPanel.add(saveButton);
        inputPanel.add(refreshButton);

        JScrollPane scrollPane = new JScrollPane(displayArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Event listeners
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveEntry();
                updateDisplay();
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay();
            }
        });

        // Load and display entries on startup
        updateDisplay();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GPT_Budget().setVisible(true);
            }
        });
    }

    // Load the entries from the file
    private Map<String, List<Entry>> loadEntries() {
        Map<String, List<Entry>> entriesMap = new HashMap<>();
        entriesMap.put("Income", new ArrayList<>());
        entriesMap.put("Expenses", new ArrayList<>());
        entriesMap.put("Savings", new ArrayList<>());

        File file = new File(FILE_PATH);

        // Check if the file exists, create it if not
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

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
    private void saveEntry() {
        String category = (String) categoryComboBox.getSelectedItem();  // Get selected category from the dropdown
        double amount = Double.parseDouble(amountField.getText());
        String note = noteField.getText();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(category + "," + amount + "," + note);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Clear input fields after saving
        amountField.setText("");
        noteField.setText("");
    }

    // Update the display (re-render the categories and entries)
    private void updateDisplay() {
        Map<String, List<Entry>> entriesMap = loadEntries();

        StringBuilder displayText = new StringBuilder();
        for (String category : entriesMap.keySet()) {
            displayText.append(category).append(":\n");
            List<Entry> entries = entriesMap.get(category);
            double categoryTotal = 0;

            for (Entry entry : entries) {
                displayText.append("").append(entry.getAmount()).append(" - ").append(entry.getNote()).append("\n");
                categoryTotal += entry.getAmount();
            }

            displayText.append("Total for ").append(category).append(": ").append(categoryTotal).append("\n\n");
        }

        displayArea.setText(displayText.toString());
        displayArea.revalidate();
        displayArea.repaint();
    }

    // Entry class to store individual entry details
    private static class Entry {
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
}
