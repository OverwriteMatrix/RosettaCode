/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javagui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Paxton.Clark
 */
public class myButton extends JFrame implements ActionListener{

    JButton button = new JButton();
    
    JLabel label;
    
    myButton(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700, 700);
        this.setVisible(true);
        
        button.setBounds(50, 50, 400, 100);
        this.add(button);
        button.addActionListener(this);    //(e -> System.out.println("HIIIIIIIIIIIII"));
        
        button.setText("I\'m a button, click me!");
        button.setFocusable(false);
        
        //ImageIcon icon = new ImageIcon("Image.png");
        //button.setIcon(icon);
        //button.setIconTextGap(20);
        
        //button.setHorizontalAlignment(0);
        //button.setVerticalAlignment(0);
        
        
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setForeground(Color.ORANGE);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createBevelBorder(1, Color.darkGray, Color.lightGray));
        
        label = new JLabel();
        label.setText("This is a label");
        label.setBackground(Color.blue);
        label.setForeground(Color.black);
        label.setBounds(250, 250, 150, 150);
        label.setVisible(false);
        this.add(label);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("BTN PRESSED");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
