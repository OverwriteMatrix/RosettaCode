package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextFields extends JFrame implements ActionListener {

    JTextField nameField;
    JButton submitButton;
    JLabel resultLabel;

    public JTextFields() {
        // Frame setup
        setTitle("JTextField Example");
        setSize(300, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create components
        nameField = new JTextField(15);
        submitButton = new JButton("Submit");
        resultLabel = new JLabel("Your name: ");

        // Add action listener to button
        submitButton.addActionListener(this);
        submitButton.setFocusable(false);

        // Add components to frame
        add(new JLabel("Enter your name:"));
        add(nameField);
        add(submitButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        resultLabel.setText("Your name: " + name);
    }
}