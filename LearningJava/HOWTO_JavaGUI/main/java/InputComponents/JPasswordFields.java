package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.event.*;

public class JPasswordFields extends JFrame implements ActionListener {

    JPasswordField passwordField;
    JButton submitButton;
    JLabel resultLabel;
    JLabel passwordLabel;

    public JPasswordFields() {
        // Frame setup
        setSize(250, 250); // Increased size to accommodate components
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create components
        passwordField = new JPasswordField(15);
        submitButton = new JButton("Login");
        resultLabel = new JLabel("Password: ");
        passwordLabel = new JLabel("Enter Password: ");

        submitButton.setFocusable(false);
        
        // Add action listener
        submitButton.addActionListener(this);

        // Add components to frame
        add(passwordLabel);
        add(passwordField);
        add(submitButton);
        add(resultLabel);

        // Set Bounds (ensure there is enough space)
        passwordLabel.setBounds(20, 20, 120, 30);
        passwordField.setBounds(20, 60, 200, 30);
        submitButton.setBounds(80, 100, 120, 30);
        resultLabel.setBounds(20, 140, 250, 30);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get password from field
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        // Display password (just for demo — don't do this in real apps!)
        resultLabel.setText("Password: " + password);
    }
}
