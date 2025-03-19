/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
   to change this license
*/

package com.mycompany.JavaOneGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Paxton.Clark
 */
public class JavaGUI {
    
    public static void main(String[] args) {
        
        JFrame mainFrame = new JFrame();                                        //Creates the frame
        mainFrame.setSize(1000,1000);                                           //Sets the frame's sizing
        mainFrame.setVisible(true);                                             //Makes the frame un(visible)
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               //Actually closes the frame when the x button is clicked
        mainFrame.setResizable(false);                                          //Makes frame (un)able to be resized
        mainFrame.getContentPane().setBackground(new Color(0x123456));          //Sets frame's base coloring (Set to a cool dark blue color)
        mainFrame.setTitle("Main Frame");                                       //Sets the frame's title
        
        JPanel basePannel = new JPanel();                                       //Creates five new panels named basePannel - panel6
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
                                              
        basePannel.setLayout(new BorderLayout(2, 2));                           //Sets border layout for basePannel and border thickness
        basePannel.setSize(990, 990);                                           //Sets sizing for basePannel
        basePannel.setBackground(new Color(42, 45, 51));                        //Sets background color of basePannel
        
                                          // ( X ,  Y)
        panel1.setPreferredSize(new Dimension(100, 100));                       //Sets preferred size of panels 2-5
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));
        
        panel1.setBackground(new Color(178, 41, 41));                           //Sets background color of panels 2-5
        panel2.setBackground(new Color(24, 138, 24));
        panel3.setBackground(new Color(178, 173, 41));
        panel4.setBackground(new Color(138, 24, 124));
        panel5.setBackground(new Color(24, 80, 138));
        
        basePannel.add(panel1, BorderLayout.NORTH);                             //Adds panels 1-5 to basePanel
        basePannel.add(panel2, BorderLayout.SOUTH);
        basePannel.add(panel3, BorderLayout.EAST);
        basePannel.add(panel4, BorderLayout.WEST);
        basePannel.add(panel5, BorderLayout.CENTER);
        
        mainFrame.add(basePannel);                                              //Adds basePannel to mainFrame
        
    }
}
