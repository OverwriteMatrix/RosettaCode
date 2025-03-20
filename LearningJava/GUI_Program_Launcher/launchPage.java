package com.mycompany.javaguipractice;

/**
 * @author Paxton.Clark
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Paxton.Clark
 */
public class launchPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JButton btn1 = new JButton("Simple Java Clock");
    JButton btn2 = new JButton("Java Budget");
    JButton btn3 = new JButton("Java To Do List");
    JButton btn4 = new JButton("Java Time Sheet Tracker");
    JButton btn5 = new JButton("Java GUI");
    JButton btn6 = new JButton("Program");
    JButton btn7 = new JButton("Program");
    JButton btn8 = new JButton("Program");
    JButton btn9 = new JButton("Program");
    JButton btn0 = new JButton("Quit");
    
    launchPage(){
        
        label.setBounds(10, 0, 250, 40);
        label.setText("Paxton's Programs");
        label.setFont(new Font("Poppins", Font.PLAIN, 22));
        frame.add(label);
        
        btn1.setBounds(10, 50, 200, 40);
        btn1.setFocusable(false);
        btn1.addActionListener(this);
        frame.add(btn1);
        
        btn2.setBounds(10, 100, 200, 40);
        btn2.setFocusable(false);
        btn2.addActionListener(this);
        frame.add(btn2);
        
        btn3.setBounds(10, 150, 200, 40);
        btn3.setFocusable(false);
        btn3.addActionListener(this);
        frame.add(btn3);
        
        btn4.setBounds(10, 200, 200, 40);
        btn4.setFocusable(false);
        btn4.addActionListener(this);
        frame.add(btn4);
        
        btn5.setBounds(225, 50, 200, 40);
        btn5.setFocusable(false);
        btn5.addActionListener(this);
        frame.add(btn5);
        
        btn6.setBounds(225, 100, 200, 40);
        btn6.setFocusable(false);
        btn6.addActionListener(this);
        frame.add(btn6);
        
        btn7.setBounds(225, 150, 200, 40);
        btn7.setFocusable(false);
        btn7.addActionListener(this);
        frame.add(btn7);
        
        btn8.setBounds(225, 200, 200, 40);
        btn8.setFocusable(false);
        btn8.addActionListener(this);
        frame.add(btn8);

        frame.setTitle("Launch Page"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1){
            new SimpleClock();        
            //frame.dispose();
        } else if (e.getSource()==btn2){
            new JavaBudget();              
            //frame.dispose();
        } else if (e.getSource()==btn3){
            new ToDoList();                  
            //frame.dispose();
        } else if (e.getSource()==btn4){
            new TimeSheetTrackerGUI();          
            //frame.dispose();
        } else if (e.getSource()==btn5){
            new JavaGUI_Launch();
        } else if (e.getSource()==btn6){
            System.out.println("Button 6 Pressed"); 
        } else if (e.getSource()==btn7){
            System.out.println("Button 7 Pressed");                 
        } else if (e.getSource()==btn8){
            System.out.println("Button 8 Pressed");               
        } else if (e.getSource()==btn9){
            System.out.println("Button 9 Pressed");                 
        }
    }
    
    
}
