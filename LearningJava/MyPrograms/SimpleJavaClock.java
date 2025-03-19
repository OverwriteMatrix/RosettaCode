/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaguipractice;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleClock extends JFrame implements Runnable{
    public JLabel clockLabel;
    
    public SimpleClock() {
        // Set up the JFrame
        setTitle("A Simple Java Clock");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // DISPOSE_ON_CLOSE gets ride of the frame and its reasources but does not terminate the application when the frame is closed
        
        setLocationRelativeTo(null);
        setResizable(false);

        // Create the clock label
        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Arial", Font.BOLD, 26));
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clockLabel.setForeground(Color.black);

        add(clockLabel); // Add the clock label to the JFrame

        // Start the clock
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        setVisible(true); // Make the JFrame visible
    }

    public void updateClock() {
        String currentTime = new SimpleDateFormat("hh:mm:ss a").format(new Date()); // Get the current time
        clockLabel.setText(currentTime); // Update the clock label
    }

    public static void main(String[] args) {
        // Run the clock
        SwingUtilities.invokeLater(SimpleClock::new);
    }

    @Override
    public void run() {
        while (true) {
            String currentTime = new SimpleDateFormat("hh:mm:ss a").format(new Date()); // Get the current time
            clockLabel.setText(currentTime); // Update the clock label
            
            SwingUtilities.invokeLater(() -> clockLabel.setText(currentTime));
            try {
                Thread.sleep(1000); // Update every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
