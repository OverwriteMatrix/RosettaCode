package com.mycompany.mavenproject11_unitconversion2_pc;

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
