/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.howto_javagui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Paxton.Clark
 */
public class JLabels {
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    
    public JLabels(){
        frame.setTitle("JLabels");          
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);     
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);              
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        panel.setLayout(null);                 // See layout managers for more info
        panel.setBackground(Color.red);
        
        label1.setText("Label 1");             // Sets the text of a label
        label1.setBounds(10, 10, 100, 100);    // (Location X, Location Y, Size X, Size Y)
        label1.setForeground(Color.black);     // Sets the text color of a label
        label1.setBackground(Color.blue);      // Sets the background color of a label
        label1.setOpaque(true);                // Allows the background color of a label to show if contained by an element that already has a background color
        
        label2.setText("Label 2");            
        label2.setBounds(10, 170, 100, 100);   
        label2.setForeground(Color.black);     
        label2.setBackground(Color.green);      
        label2.setOpaque(true); 
        
        label3.setText("Label 2");            
        label3.setBounds(170, 10, 100, 100);   
        label3.setForeground(Color.black);     
        label3.setBackground(Color.yellow);      
        label3.setOpaque(true); 
        
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        frame.add(panel);
        frame.setVisible(true);
    }
}
