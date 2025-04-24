package MenuComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JMenuItems {

    public JMenuItems() {
        JFrame frame = new JFrame("JMenuItem Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action listeners
        newItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "New file created!");
        });

        saveItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "File saved!");
        });

        exitItem.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        // Add items to the menu
        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // adds a line separator
        fileMenu.add(exitItem);

        // Add menu to the menu bar
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}