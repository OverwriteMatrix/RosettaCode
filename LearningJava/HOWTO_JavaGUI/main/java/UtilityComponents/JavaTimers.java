package UtilityComponents;

// @author Paxton.Clark

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class JavaTimers extends JFrame implements ActionListener {

    JButton button1 = new JButton();
    JButton button2 = new JButton();

    public JavaTimers() {
        // JFrame setup
        setTitle("Swing Timer Example");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 100);
        setLayout(null);

        // Button setup
        button1.setText("Label Timer");
        button2.setText("Countdown Timer");

        button1.setBounds(5, 5, 100, 40);
        button2.setBounds(5, 40, 100, 40);

        // Add buttons to frame
        add(button1);
        add(button2);

        // Register action listeners for buttons
        button1.addActionListener(this);
        button2.addActionListener(this);

        // Display the frame
        setVisible(true);
    }

    public static void LabelTimer() {
        JFrame frame = new JFrame("Label Timer");
        JLabel label = new JLabel("Seconds passed: 0");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(label);
        frame.setVisible(true);

        final int[] counter = {0};

        // Timer fires every 1000ms (1 second)
        Timer timer = new Timer(1000, (ActionEvent e) -> {
            counter[0]++;
            label.setText("Seconds passed: " + counter[0]);
        });

        timer.start();
    }

    public static void CountdownTimer() {
        JFrame frame = new JFrame("Countdown Timer");
        JLabel label = new JLabel("10", SwingConstants.CENTER);
        JButton startButton = new JButton("Start Countdown");

        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(startButton, BorderLayout.SOUTH);

        frame.setSize(200, 120);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        final int[] timeLeft = {10}; // seconds

        Timer timer = new Timer(1000, null);
        timer.addActionListener((ActionEvent e) -> {
            timeLeft[0]--;
            label.setText(String.valueOf(timeLeft[0]));
            if (timeLeft[0] <= 0) {
                timer.stop();
                label.setText("Done!");
            }
        });

        startButton.addActionListener(e -> {
            timeLeft[0] = 10; // Reset countdown
            label.setText(String.valueOf(timeLeft[0]));
            timer.start();
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            LabelTimer();
        } else if (e.getSource() == button2) {
            CountdownTimer();
        }
    }
}
