package UtilityComponents;

import javax.swing.*;
import java.awt.*;
import java.util.regex.*;

// @author Paxton.Clark

public class JavaInputVerifiers {
    
    // Custom InputVerifier to check if input is a valid email address
    public static class EmailInputVerifier extends InputVerifier {
        @Override
        public boolean verify(JComponent input) {
            JTextField textField = (JTextField) input;
            String inputText = textField.getText();

            // Regular expression for validating email
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(inputText);

            // If the email matches the pattern, it's valid, otherwise invalid
            return matcher.matches();
        }
    }

    public JavaInputVerifiers(){
        // Create the frame and panel for the form
        JFrame frame = new JFrame("InputVerifier Example");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        // Create a JLabel and a JTextField
        JLabel emailLabel = new JLabel("Enter your email:");
        JTextField emailField = new JTextField();

        // Set the custom input verifier to the email field
        emailField.setInputVerifier(new EmailInputVerifier());

        // Add components to the panel
        panel.add(emailLabel);
        panel.add(emailField);

        // Create a button to simulate form submission
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            if (emailField.getInputVerifier().verify(emailField)) {
                JOptionPane.showMessageDialog(frame, "Email is valid!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid email address. Please try again.");
            }
        });

        // Add button to the panel
        panel.add(submitButton);

        // Final setup of the frame
        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}