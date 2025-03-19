/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA_GUI;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author Paxton.Clark
 */
public class comboBoxes extends JFrame implements ActionListener{
    
    JComboBox comboBox;
    
    
    comboBoxes(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        Integer[] numbers = {1,2,3};
        String[] animals = {"Dog", "Cat", "Bird"};
        comboBox = new JComboBox(animals);  //can also user numbers array
        comboBox.addActionListener(this);
        
        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("Horse");
        //comboBox.insertItemAt("Pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("Cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();
        
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
            //System.out.println(comboBox.getSelectedIndex());
        }

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
