/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaguipractice.JavaGUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author Paxton.Clark
 */
public class checkBox extends JFrame implements ActionListener{
    
    JCheckBox checkBox =  new JCheckBox();
    
    public checkBox(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        checkBox.setText("I\'m not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.addActionListener(this);
        
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==checkBox){
            if(checkBox.isSelected()){
                System.out.println("TRUE");
            }
            else{
                System.out.println("FALSE");
            }
        }
    }  
}