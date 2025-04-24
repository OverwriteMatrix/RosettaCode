package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class JTables extends JFrame {

    public JTables() {
        // Frame setup
        setTitle("JTable Example");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Data for the table
        String[] columnNames = {"ID", "Name", "Age"};
        Object[][] data = {
            {1, "John", 25},
            {2, "Alice", 30},
            {3, "Bob", 22},
            {4, "Diana", 28}
        };

        // Create table model and JTable
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Add table to scroll pane for better visibility
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Set visible
        setVisible(true);
    }
}