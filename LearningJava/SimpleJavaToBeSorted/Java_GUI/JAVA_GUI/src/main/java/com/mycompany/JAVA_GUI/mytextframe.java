/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA_GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Paxton.Clark
 */
public class mytextframe extends JFrame implements ActionListener{

    JButton button = new JButton("Submit");
    JTextField textField = new JTextField();
    
    mytextframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        
        button.addActionListener(this);
     
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 15));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("Username");
        //textField.setEditable(false); //makes the text field uneditable
        
        
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Welcome " + textField.getText());
            button.setEnabled(false);
            textField.setEnabled(false);
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
