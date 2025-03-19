/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA_GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Paxton.Clark
 */
public class colorChooser extends JFrame implements ActionListener{
    
    JButton button;
    JLabel label;
    
    
    colorChooser(){
        
        button = new JButton("Pick a Color");
        button.addActionListener(this);
        
        label = new JLabel();
        label.setBackground(Color.white);
        label.setOpaque(rootPaneCheckingEnabled);
        label.setText("This is some text");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        
        
        
        this.add(button);
        this.add(label);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            
            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.black);
            //label.setForeground(color);
            label.setBackground(color);
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
