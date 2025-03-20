/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaguipractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paxton.Clark
 */
public class JavaBudget {
    
    private static String selectedMonth = new SimpleDateFormat("MMMM").format(new Date());  // Gets the current month and saves it into selectedMonth
    private static String FILE_PATH = selectedMonth + "_data.txt";              // Makes the 1st loaded file path the current month (selectedMonth)_data.txt
    private static String LOG_FILE_PATH = selectedMonth + "_log.txt";           // Makes the 1st loaded log path the current month (selectedMonth)_log.txt
    
    JavaBudget(){
        JFrame frame = new JFrame("Java Budget GUI");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 800);
        frame.setResizable(false);

        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Header", "Subheader", "Amount", "Note(s)"}, 0);
        JTable table = new JTable(tableModel);
        table.setFillsViewportHeight(true);
        configureTableAppearance(table);
        
        JComboBox<String> monthSelector = new JComboBox<>(new String[]{
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        });
        monthSelector.setSelectedItem(selectedMonth);
        monthSelector.addActionListener(e -> changeMonth((String) monthSelector.getSelectedItem(), tableModel));
        
        loadTableData(tableModel);
        setupTableListener(tableModel, table);

        JScrollPane scrollPane = new JScrollPane(table);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(monthSelector, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(createButtonPanel(frame, tableModel), BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    // Updates the file paths and refreshes the table to display data for the selected month.
    private static void changeMonth(String month, DefaultTableModel tableModel) {
        selectedMonth = month;
        FILE_PATH = selectedMonth + "_data.txt";
        LOG_FILE_PATH = selectedMonth + "_log.txt";
        tableModel.setRowCount(0);
        loadTableData(tableModel);
    }
    
    // Sets up table listener to track edits and log changes
    private static void setupTableListener(DefaultTableModel tableModel, JTable table) {
        table.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int row = e.getFirstRow();
                int column = e.getColumn();

                if (e.getType() == TableModelEvent.UPDATE && column != -1) {
                    Object newValue = tableModel.getValueAt(row, column);
                    logChange("Edited cell at (Row: " + row + ", Column: " + column + ") to '" + newValue + "'.");
                    saveTableData(tableModel);
                }
            }
        });
    }

    // Configures table appearance and row coloring
    private static void configureTableAppearance(JTable table) {
        table.setRowHeight(22);
        
        table.getColumnModel().getColumn(0).setPreferredWidth(75);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        table.getColumnModel().getColumn(3).setPreferredWidth(300);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                cell.setBackground(getCellColor(row, column));
                return cell;
            }
        });
    }

    // Determines color for a specific cell
    private static Color getCellColor(int row, int column) {
        // Example: Customize the color for specific row-column pairs
        if (row == 2 && column == 2) return Color.YELLOW; // Example: Highlight row 2, column 2 in yellow
        if (row == 4 && column == 3) return Color.CYAN;   // Example: Highlight row 4, column 3 in cyan
        
        // Default Row Colors
        if (row == 0 || row == 6 || row == 11 || row == 15 || row == 20 || row == 34) return Color.LIGHT_GRAY;
        if (row >= 1 && row <= 5) return new Color(213, 253, 176);
        if (row >= 7 && row <= 10) return new Color(146, 245, 80);
        if (row >= 12 && row <= 20) return new Color(107, 187, 53);
        if (row >= 21 && row <= 33) return new Color(250, 90, 90);
        if (row >= 34 && row <= 40) return new Color(245, 235, 113);
        return Color.WHITE; // Default cell color
    }   
    
    /*
    // Determines row colors based on row index
    private static Color getRowColor(int row) {
        if (row == 0 || row == 6 || row == 11 || row == 15 || row == 20 || row == 34) return Color.LIGHT_GRAY;
        if (row >= 1 && row <= 5) return new Color(213, 253, 176);
        if (row >= 7 && row <= 10) return new Color(146, 245, 80);
        if (row >= 12 && row <= 20) return new Color(107, 187, 53);
        if (row >= 21 && row <= 33) return new Color(250, 90, 90);
        if (row >= 34 && row <= 40) return new Color(245, 235, 113);
        return Color.WHITE;
    }
    */
    
    // Creates a panel with buttons for adding, deleting, and viewing logs
    private static JPanel createButtonPanel(JFrame frame, DefaultTableModel tableModel) {
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton addRowButton = new JButton("Add Row");
        addRowButton.setFocusable(false);
        addRowButton.addActionListener(e -> {
            tableModel.addRow(new Object[]{"", "", "", ""});
            logChange("Added a new row.");
            saveTableData(tableModel);
        });
        buttonPanel.add(addRowButton);

        JButton deleteRowButton = new JButton("Delete Last Row");
        deleteRowButton.setFocusable(false);
        deleteRowButton.addActionListener(e -> {
            if (tableModel.getRowCount() > 0) {
                tableModel.removeRow(tableModel.getRowCount() - 1);
                logChange("Deleted the last row.");
                saveTableData(tableModel);
            } else {
                JOptionPane.showMessageDialog(frame, "No rows left to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });
        buttonPanel.add(deleteRowButton);

        JButton viewLogButton = new JButton("View Log");
        viewLogButton.setFocusable(false);
        viewLogButton.addActionListener(e -> showLogWindow());
        buttonPanel.add(viewLogButton);

        return buttonPanel;
    }

    // Loads saved table data from a file
    private static void loadTableData(DefaultTableModel tableModel) {
        File file = new File(FILE_PATH);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tableModel.addRow(line.split(",", -1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Saves table data to a file
    private static void saveTableData(DefaultTableModel tableModel) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (int row = 0; row < tableModel.getRowCount(); row++) {
                List<String> rowData = new ArrayList<>();
                for (int col = 0; col < tableModel.getColumnCount(); col++) {
                    rowData.add(String.valueOf(tableModel.getValueAt(row, col)));
                }
                writer.write(String.join(",", rowData));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Logs changes to a separate log file
    private static void logChange(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true))) {
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.write(timeStamp + " - " + message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Displays the log file content in a new window
    private static void showLogWindow() {
        JFrame logFrame = new JFrame("Change Log");
        logFrame.setSize(700, 400);
        
        JTextArea logTextArea = new JTextArea();
        logTextArea.setEditable(false);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logTextArea.append(line + "\n");
            }
        } catch (IOException e) {
            logTextArea.setText("No log available.");
        }
        
        logFrame.add(new JScrollPane(logTextArea));
        logFrame.setVisible(true);
    }
    
}