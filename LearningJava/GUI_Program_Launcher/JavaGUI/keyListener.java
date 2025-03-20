/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaguipractice.JavaGUI;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Paxton.Clark
 */
public class keyListener extends JFrame implements KeyListener{
    
    JLabel label;
    
    public keyListener(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(1000, 1000);
        this.setLayout(null);
        this.addKeyListener(this);
        
        label = new JLabel();
        label.setBounds(0,0,200,200);
        label.setBackground(Color.red);
        label.setOpaque(true);
        
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-10, label.getY());
                break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
                break;
        }
        
        
        
        //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10, label.getY());
                break;
            case 39: label.setLocation(label.getX()+10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-10);
                break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
                break;
        }
        
        
        //keyPressed = Invoed when a physical key is pressed down. Uses KeyCode, int outputted
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
        
        //keyReleased = called whenever a button is released
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
