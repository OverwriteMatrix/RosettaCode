package DisplayComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.*;

public class JSeparators {
    
    public JSeparators(){
        // Create a new frame
        JFrame frame = new JFrame("JSeparator Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // Create a panel with vertical BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add some labels with separators
        panel.add(new JLabel("First Section"));
        panel.add(new JSeparator(SwingConstants.HORIZONTAL));
        panel.add(new JLabel("Second Section"));
        panel.add(new JSeparator(SwingConstants.HORIZONTAL));
        panel.add(new JLabel("Third Section"));

        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Example of a vertical separator between two buttons
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        bottomPanel.add(new JButton("Left"));
        bottomPanel.add(new JSeparator(SwingConstants.VERTICAL));
        bottomPanel.add(new JButton("Right"));

        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}