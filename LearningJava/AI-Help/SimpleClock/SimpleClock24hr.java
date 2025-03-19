// This is a java class, reqires: new SimpleClock(); in main method

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleClock extends JFrame {
    public JLabel clockLabel;
    
    public SimpleClock() {
        // Set up the JFrame
        setTitle("A Simple Java Clock");
        setSize(300, 100);
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
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        setVisible(true); // Make the JFrame visible
    }

    public void updateClock() {
        String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date()); // Get the current time
        clockLabel.setText(currentTime); // Update the clock label
    }

    public static void main(String[] args) {
        // Run the clock
        SwingUtilities.invokeLater(SimpleClock::new);
    }
}
