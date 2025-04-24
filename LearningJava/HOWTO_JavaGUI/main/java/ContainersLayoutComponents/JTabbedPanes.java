package ContainersLayoutComponents;

// @author Paxton.Clark

import javax.swing.*;

public class JTabbedPanes {
    
    public JTabbedPanes(){
        // Create the main JFrame
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400, 300);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each tab
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Welcome to Tab 1"));

        JPanel panel2 = new JPanel();
        JButton button = new JButton("Click Me in Tab 2");
        button.setFocusable(false);
        panel2.add(button);

        JPanel panel3 = new JPanel();
        panel3.add(new JTextField("Editable text field in Tab 3", 20));

        // Add tabs to the tabbed pane
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);

        // Add the tabbed pane to the frame
        frame.getContentPane().add(tabbedPane);

        // Show the frame
        frame.setVisible(true);
    }
}