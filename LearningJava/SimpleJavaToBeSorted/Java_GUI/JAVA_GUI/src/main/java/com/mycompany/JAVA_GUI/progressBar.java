/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA_GUI;

/**
 *
 * @author Paxton.Clark
 */

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class progressBar {
    
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    
    public progressBar(){
        
        bar.setBounds(0, 0, 300, 50);
        bar.setStringPainted(true);     //Adds percentage to progress bar
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);
        
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        
        fill();
    }
    
    public void fill(){
        int counter = 0;
        while(counter <= 100){
            bar.setValue(counter);
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            counter += 1;
        }
        bar.setString("Done!");
    }
}
