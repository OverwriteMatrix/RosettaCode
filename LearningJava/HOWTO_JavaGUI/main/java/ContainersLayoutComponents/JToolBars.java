package ContainersLayoutComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.*;

public class JToolBars {
    
    public JToolBars(){
        // Create the main frame
        JFrame frame = new JFrame("JToolBar Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 300);

        // Create a toolbar
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(true); // Allows the toolbar to be detached

        // Add buttons to the toolbar
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");

        // Add tooltips
        newButton.setToolTipText("Create a new file");
        openButton.setToolTipText("Open an existing file");
        saveButton.setToolTipText("Save the file");

        // Add action listeners
        newButton.addActionListener(e -> System.out.println("New clicked"));
        openButton.addActionListener(e -> System.out.println("Open clicked"));
        saveButton.addActionListener(e -> System.out.println("Save clicked"));

        // Add buttons to toolbar
        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.add(saveButton);

        // Add a separator and another button
        toolBar.addSeparator();
        JButton exitButton = new JButton("Exit");
        exitButton.setToolTipText("Exit the app");
        exitButton.addActionListener(e -> frame.dispose());
        toolBar.add(exitButton);

        // Create a content panel
        JPanel contentPanel = new JPanel();
        contentPanel.add(new JLabel("Welcome to the main content area"));

        // Add the toolbar and content to the frame
        frame.getContentPane().add(toolBar, BorderLayout.NORTH);
        frame.getContentPane().add(contentPanel, BorderLayout.CENTER);

        // Show the frame
        frame.setVisible(true);
    }
}
