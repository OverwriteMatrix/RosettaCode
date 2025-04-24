package com.mycompany.javaguipractice.JavaGUI;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Paxton.Clark
 */
public class mouseListener extends JFrame implements MouseListener{
    
    JLabel label;
    
    public mouseListener(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(500,500);
        
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(rootPaneCheckingEnabled);
        label.addMouseListener(this);
        
        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("You clicked the mouse!");
        //mouseClicked is invoked when the mouse button has been clicked (pressed and released) on a componenet
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed the mouse!");
        label.setBackground(Color.yellow);
        //mousePressed is invoked when a mouse button has been pressed on a component
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse!");
        label.setBackground(Color.green);
        //mouseReleased is invoked when a mouse button has been released on a component
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the component!");
        label.setBackground(Color.blue);
        //mouseEntered is invoke when the mouse enters the area of a component
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the component!");
        label.setBackground(Color.red);
        //mouseExited is invoke when the mouse exits the area of a component
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}