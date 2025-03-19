/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA_GUI;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Paxton.Clark
 */
public class newWindow {
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");
    
    
    
    newWindow(){
        
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
