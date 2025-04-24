package com.mycompany.javaguipractice.JavaGUI;

import javax.swing.JFrame;

/**
 *
 * @author Paxton.Clark
 */
public class dragPanel extends JFrame{
    
    dragPanel dragPanel = new dragPanel();
    
    
    public dragPanel(){
        this.add(dragPanel);
        this.setTitle("Drag and Drop");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
}