package TopLevelContainers;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.*;

public class JWindows {

    public JWindows() {
        JWindow window = new JWindow();  // Creates a new JWindow

        // Create window content (e.g., a label)
        JLabel label = new JLabel("Welcome!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.WHITE);

        // Add the label to the window
        window.getContentPane().add(label);
        window.getContentPane().setBackground(Color.DARK_GRAY);

        // Set size and position
        window.setSize(300, 150);
        window.setLocationRelativeTo(null); // Center on screen

        window.setVisible(true); // Show the window

        new Timer(3000, e -> window.dispose()).start();  // Use a Swing Timer to close after 3 seconds
    }
}

