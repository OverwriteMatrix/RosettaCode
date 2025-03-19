/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA_GUI;

import javax.swing.JFrame;

/**
 *
 * @author Paxton.Clark
 */
public class dragAndDrop extends JFrame{
    
    dragPanel dragPanel = new dragPanel();
    
    
    dragAndDrop(){
        this.add(dragPanel);
        this.setTitle("Drag and Drop");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
}
