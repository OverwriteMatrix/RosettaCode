/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Paxton.Clark
 */
public class launchPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");
    
    launchPage(){
        
        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==myButton){
            frame.dispose();            //Closes "Old" JFrame
            newWindow myWindow = new newWindow();
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
