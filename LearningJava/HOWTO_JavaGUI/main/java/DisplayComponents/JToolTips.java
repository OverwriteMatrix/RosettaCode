package DisplayComponents;

// @author Paxton.Clark

import javax.swing.*;

public class JToolTips {
    
    public JToolTips(){
        // Create a frame
        JFrame frame = new JFrame("JToolTip Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel to hold components
        JPanel panel = new JPanel();

        // Create some components
        JButton button = new JButton("Hover over me!");
        button.setFocusable(false);
        JTextField textField = new JTextField("Type here", 15);

        // Set tool tips
        button.setToolTipText("This is a button that you can click.");
        textField.setToolTipText("Enter your text here.");

        // Add components to panel
        panel.add(button);
        panel.add(textField);

        // Add panel to frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
    
}
