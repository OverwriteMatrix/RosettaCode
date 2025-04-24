package com.mycompany.javaguipractice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class userCreds extends JFrame implements ActionListener {

    JButton button = new JButton("Submit");
    JTextField username = new JTextField();
    JTextField password = new JTextField();

    userCreds() {
        // Configure JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        // Set frame size and center it on screen
        this.setSize(400, 300); 
        this.setLocationRelativeTo(null); 

        // Username Field
        username.setPreferredSize(new Dimension(250, 40));
        username.setFont(new Font("Consolas", Font.PLAIN, 15));
        username.setForeground(Color.gray);
        username.setBackground(Color.black);
        username.setCaretColor(Color.white);
        username.addActionListener(this); // Detect Enter key

        // Password Field
        password.setPreferredSize(new Dimension(250, 40));
        password.setFont(new Font("Consolas", Font.PLAIN, 15));
        password.setForeground(Color.gray);
        password.setBackground(Color.black);
        password.setCaretColor(Color.white);
        password.addActionListener(this); // Detect Enter key
        
        // Submit Button
        button.setFocusable(false);
        button.addActionListener(this);

        // Add components
        this.add(Box.createVerticalStrut(20));
        this.add(username);
        this.add(Box.createVerticalStrut(10));
        this.add(password);
        this.add(Box.createVerticalStrut(10));
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    private void validateCredentials() {
        String usrKey = "Paxton Clark";
        String passKey = "123456789";

        if (password.getText().equals(passKey) && username.getText().equals(usrKey)) {
            System.out.println("Welcome " + username.getText());
            button.setEnabled(false);
            username.setEnabled(false);
            password.setEnabled(false);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println("userCreds InterruptedException: " + ex);
            }
            this.dispose();
            new launchPage();
        } else {
            button.setEnabled(false);
            username.setEnabled(false);
            password.setEnabled(false);
            System.out.println("Sorry, that is incorrect. Try again later.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted Exception: " + ex);
            }
            this.dispose();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button || e.getSource() == username || e.getSource() == password) {
            button.setEnabled(false); // Gray out the button
            validateCredentials();
        }
    }
}
