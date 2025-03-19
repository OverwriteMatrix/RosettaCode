// This is a java class, requires: new SimpleClockReg(); in main method

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleClockReg extends JFrame {
    public JLabel clockLabel;
    
    public SimpleClockReg() {
        // Set up the JFrame
        setTitle("A Simple Java Clock");
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Create the clock label
        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Arial", Font.BOLD, 26));
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clockLabel.setForeground(Color.black);

        add(clockLabel); // Add the clock label to the JFrame

        // Start the clock
        Timer timer = new Timer(1, e -> updateClock());
        timer.start();

        setVisible(true); // Make the JFrame visible
    }

    public void updateClock() {                                                                                                                 //   SSS = miliseconds  a = AM/PM   z = time zone
        String currentTime = new SimpleDateFormat("hh:mm:ss a").format(new Date()); // Get the current time ("yyyy-MM-dd HH:mm:ss.SSS a z")    HH = military time hh = 12hr time
        clockLabel.setText(currentTime); // Update the clock label
    }

    public static void main(String[] args) {
        // Run the clock
        SwingUtilities.invokeLater(SimpleClock::new);
    }
}
