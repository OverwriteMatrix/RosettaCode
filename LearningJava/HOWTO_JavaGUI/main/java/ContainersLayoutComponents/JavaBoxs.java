package ContainersLayoutComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.*;

public class JavaBoxs {
    
    public JavaBoxs(){
        // Create the main frame
        JFrame frame = new JFrame("Box Layout Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a vertical box
        Box verticalBox = Box.createVerticalBox();

        // Add components vertically
        verticalBox.add(new JButton("Button 1"));
        verticalBox.add(Box.createVerticalStrut(10)); // Adds vertical space
        verticalBox.add(new JButton("Button 2"));
        verticalBox.add(Box.createVerticalStrut(10));
        verticalBox.add(new JButton("Button 3"));

        // Add a horizontal box at the bottom
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new JLabel("Left"));
        horizontalBox.add(Box.createHorizontalGlue()); // Pushes next component to the right
        horizontalBox.add(new JLabel("Right"));

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(verticalBox, BorderLayout.CENTER);
        mainPanel.add(horizontalBox, BorderLayout.SOUTH);

        // Add to frame
        frame.setContentPane(mainPanel);
        frame.setVisible(true);
    }
}
