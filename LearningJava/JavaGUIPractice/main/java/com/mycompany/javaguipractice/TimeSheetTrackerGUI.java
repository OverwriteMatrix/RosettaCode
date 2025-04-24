package com.mycompany.javaguipractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 * @author Paxton.Clark
 */

public class TimeSheetTrackerGUI extends JFrame implements ActionListener{
    
    JFrame frame = new JFrame();
    JLabel clockLabel = new JLabel();
    JLabel arrivalLabel = new JLabel();
    JComboBox comboBox1 = new JComboBox();
    JLabel lunchLabel = new JLabel();
    JComboBox comboBox2 = new JComboBox();
    JLabel departureLabel = new JLabel();
    JComboBox comboBox3 = new JComboBox();
    JButton submitBtn = new JButton();
    JButton quitBtn = new JButton();
    
    String currentTime = new SimpleDateFormat("hh:mm:ss a").format(new Date()); // Get the current time
    
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE, MMMM d");
    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    String suffix = getDaySuffix(day);
    String currentDate = dayFormat.format(calendar.getTime()) + suffix + " " + yearFormat.format(calendar.getTime());
    
    TimeSheetTrackerGUI(){
        // JFrame
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setTitle("TST");
        frame.setLayout(null);
        frame.setSize(230,300);
        frame.setResizable(false);
        
        // Main Panel
        JPanel panel = new JPanel();
        panel.setSize(500, 500);
        panel.setBackground(new Color(38, 138, 182));
        panel.setLayout(null);
        
        // Create the clock label
        clockLabel.setBounds(15, 5, 260, 40);
        clockLabel.setFont(new Font("Arial", Font.BOLD, 14));
        clockLabel.setForeground(Color.black);

        // Start the clock
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();
        
        // Create the Arrival label
        arrivalLabel.setBounds(25, 45, 260, 40);
        arrivalLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        arrivalLabel.setForeground(Color.black);
        arrivalLabel.setText("Time Arrived:");
        
        // Arrival Time Combo Box
        String[] inTime = {
            "06:00 AM", "06:15 AM", "06:30 AM", "06:45 AM",
            "07:00 AM", "07:15 AM", "07:30 AM", "07:45 AM",
            "08:00 AM", "08:15 AM", "08:30 AM", "08:45 AM",
            "09:00 AM", "09:15 AM", "09:30 AM", "09:45 AM",
            "10:00 AM", "10:15 AM", "10:30 AM", "10:45 AM",
            "11:00 AM", "11:15 AM", "11:30 AM", "11:45 AM",
            "12:00 PM", "12:15 PM", "12:30 PM", "12:45 PM",
            "01:00 PM"
        };
        comboBox1 = new JComboBox(inTime);
        comboBox1.setSelectedIndex(8);
        comboBox1.addActionListener(this);
        comboBox1.setBounds(110, 50, 80, 30);
        
        // Create the Lunch label
        lunchLabel.setBounds(15, 95, 260, 40);
        lunchLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        lunchLabel.setForeground(Color.black);
        lunchLabel.setText("Time for Lunch:");
        
        // Lunch Time Combo Box
        String[] lunchTime = {"None", "15 minutes", "30 minutes", "45 minutes", "1 hour","1:15 hours","1:30 hours", "1:45 hours", "2 hours"};
        comboBox2 = new JComboBox(lunchTime);
        comboBox2.setSelectedIndex(0);
        comboBox2.addActionListener(this);
        comboBox2.setBounds(110, 100, 80, 30);
        
        // Create the Departure label
        departureLabel.setBounds(15, 145, 260, 40);
        departureLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        departureLabel.setForeground(Color.black);
        departureLabel.setText("Time Departed:");
        
        // Departure Time Combo Box
        String[] outTime = {
            "12:00 PM", "12:15 PM", "12:30 PM", "12:45 PM",
            "01:00 PM", "01:15 PM", "01:30 PM", "01:45 PM",
            "02:00 PM", "02:15 PM", "02:30 PM", "02:45 PM",
            "03:00 PM", "03:15 PM", "03:30 PM", "03:45 PM",
            "04:00 PM", "04:15 PM", "04:30 PM", "04:45 PM",
            "05:00 PM", "05:15 PM", "05:30 PM", "05:45 PM",
            "06:00 PM", "06:15 PM", "06:30 PM", "06:45 PM",
            "07:00 PM", "07:15 PM", "07:30 PM", "07:45 PM",
            "08:00 PM"
        };
        comboBox3 = new JComboBox(outTime);
        comboBox3.setSelectedIndex(20);
        comboBox3.addActionListener(this);
        comboBox3.setBounds(110, 150, 80, 30);
        
        // Submit Button
        submitBtn.setText("Submit");
        submitBtn.setBounds(15, 200, 80, 40);
        submitBtn.setFocusable(false);
        submitBtn.addActionListener(this);
        
        // Quit Button
        quitBtn.setText("Quit");
        quitBtn.setBounds(110, 200, 80, 40);
        quitBtn.setFocusable(false);
        quitBtn.addActionListener(this);
        
        // Adding all components
        panel.add(clockLabel);
        panel.add(arrivalLabel);
        panel.add(comboBox1);
        panel.add(lunchLabel);
        panel.add(comboBox2);
        panel.add(departureLabel);
        panel.add(comboBox3);
        panel.add(submitBtn);
        panel.add(quitBtn);
        frame.add(panel);
        frame.setVisible(true);
        
    }

    private static String getDaySuffix(int day) {
        if (day >= 11 && day <= 13) {
            return "th";
        }
        switch (day % 10) {
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }
    
    public void updateClock() {
        clockLabel.setText("Current Time: " + currentTime); // Update the clock label
    }
    
    public void run() {
        while (true) {
            String currentTime = new SimpleDateFormat("hh:mm:ss a").format(new Date()); // Get the current time
            clockLabel.setText(currentTime); // Update the clock label
            
            SwingUtilities.invokeLater(() -> clockLabel.setText(currentTime));
            try {
                Thread.sleep(1000); // Wait/Update every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submitBtn){
            int cb1selection = comboBox1.getSelectedIndex();
            double arrives;
            switch (cb1selection) {
                case 0: arrives = 6.0; break; case 1: arrives = 6.25; break; case 2: arrives = 6.5; break; case 3: arrives = 6.75; break;
                case 4: arrives = 7.0; break; case 5: arrives = 7.25; break; case 6: arrives = 7.5; break; case 7: arrives = 7.75; break;
                case 8: arrives = 8.0; break; case 9: arrives = 8.25; break; case 10: arrives = 8.5; break; case 11: arrives = 8.75; break;
                case 12: arrives = 9.0; break; case 13: arrives = 9.25; break; case 14: arrives = 9.5; break; case 15: arrives = 9.75; break;
                case 16: arrives = 10.0; break; case 17: arrives = 10.25; break; case 18: arrives = 10.5; break; case 19: arrives = 10.75; break;
                case 20: arrives = 11.0; break; case 21: arrives = 11.25; break; case 22: arrives = 11.5; break; case 23: arrives = 11.75; break;
                case 24: arrives = 12.0; break; case 25: arrives = 12.25; break; case 26: arrives = 12.5; break; case 27: arrives = 12.75; break;
                case 28: arrives = 13.0; break; default: arrives = -1;
            }

            //System.out.println(arrives);
            
            int cb2selection = comboBox2.getSelectedIndex();
            double lunchTime;
            switch(cb2selection) {
                case 0: lunchTime = 0; break; case 1: lunchTime = 0.25; break; case 2: lunchTime = 0.5; break; case 3: lunchTime = 0.75; break;
                case 4: lunchTime = 1.0; break; case 5: lunchTime = 1.25; break; case 6: lunchTime = 1.5; break; case 7: lunchTime = 1.75; break;
                case 8: lunchTime = 2.0; break;
                default: lunchTime = -1;
            }
            
            //System.out.println(lunchTime);
            
            int cb3selection = comboBox3.getSelectedIndex();
            double leaves;
            switch (cb3selection) { 
                case 0: leaves = 0.0; break; case 1: leaves = 0.25; break; case 2: leaves = 0.5; break; case 3: leaves = 0.75; break;
                case 4: leaves = 1.0; break; case 5: leaves = 1.25; break; case 6: leaves = 1.5; break; case 7: leaves = 1.75; break;
                case 8: leaves = 2.0; break; case 9: leaves = 2.25; break; case 10: leaves = 2.5; break; case 11: leaves = 2.75; break;
                case 12: leaves = 3.0; break; case 13: leaves = 3.25; break; case 14: leaves = 3.5; break; case 15: leaves = 3.75; break;
                case 16: leaves = 4.0; break; case 17: leaves = 4.25; break; case 18: leaves = 4.5; break; case 19: leaves = 4.75; break;
                case 20: leaves = 5.0; break; case 21: leaves = 5.25; break; case 22: leaves = 5.5; break; case 23: leaves = 5.75; break;
                case 24: leaves = 6.0; break; case 25: leaves = 6.25; break; case 26: leaves = 6.5; break; case 27: leaves = 6.75; break;
                case 28: leaves = 7.0; break; case 29: leaves = 7.25; break; case 30: leaves = 7.5; break; case 31: leaves = 7.75; break;
                case 32: leaves = 8.0; break; default: leaves = -1;
            }
            
            //System.out.println(leaves);
            
            String Timelogfp = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Desktop\\Timelog.txt";
            double finalhours = ((leaves) + (12 - arrives)) - lunchTime;
            
            ArrayList<String> days = new ArrayList<>();
            days.add(" | Arrives: " + arrives + " am " + " | Time for Lunch: " + lunchTime + " hrs." + " | Departed: " + leaves + " pm |" + " Total Hours: " + finalhours);
            System.out.println(days);
            
            try{
                FileWriter fstream = new FileWriter(Timelogfp,true);
                BufferedWriter out = new BufferedWriter(fstream);
                out.write("Line Added: " + currentDate + " at " + currentTime + " | Arrives: " + arrives + " am " + " | Time for Lunch: " + lunchTime + " hrs." + " | Departed: " + leaves + " pm |" + " Total Hours: " + finalhours+ "\n");
                out.close();
            }catch (Exception ex){
                System.out.println("Error while writing to file: " + ex);
            }
        }
        if(e.getSource()==quitBtn){
            frame.dispose();
        }
    }
}
