/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA_GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author Paxton.Clark
 */
public class radioButtonFrame extends JFrame implements ActionListener{
    
    JRadioButton choice1;
    JRadioButton choice2;
    JRadioButton choice3;
    
    
    radioButtonFrame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        choice1 = new JRadioButton();
        choice2 = new JRadioButton();
        choice3 = new JRadioButton();
        
        choice1.setText("Pizza");
        choice2.setText("Hamburger");
        choice3.setText("Hot Dog");
        
        ButtonGroup group = new ButtonGroup();
        group.add(choice1);
        group.add(choice2);
        group.add(choice3);
        
        choice1.addActionListener(this);
        choice2.addActionListener(this);
        choice3.addActionListener(this);
        
        this.add(choice1);
        this.add(choice2);
        this.add(choice3);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==choice1){
            System.out.println("You ordered Pizza!");
        }else if (e.getSource()==choice2){
            System.out.println("You ordered a Hamburger!");
        }else if (e.getSource()==choice3){
            System.out.println("You ordered a Hotdog!");
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
