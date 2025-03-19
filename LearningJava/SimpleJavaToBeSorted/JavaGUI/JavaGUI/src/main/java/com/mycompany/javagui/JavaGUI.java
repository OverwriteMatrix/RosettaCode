/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javagui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author Paxton.Clark
 */
public class JavaGUI extends JFrame implements ActionListener {
    
    public static void main(String[] args) {
        /*

        //JFrame = a GUI window to add compnents to______________________________________________________________________________________________________________________________
        JFrame frame = new JFrame();                                            // Declares/creates a new JFrame
        frame.setSize(500, 500);                                                // Sets the x and y dim for the frame
        frame.setTitle("JFrame Title");                                         // Titles JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   // Default setting is to "hide" the frame
        frame.setResizable(false);                                              // Makes the JFrame unable to be resized
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);                 // Changes background color rgb works too (new Color(0x123456))
        
        //JLabel = a GUI display area for a string text, and image, or both____________________________________________________________________________________________________
        JLabel imgLabel = new JLabel("This is imgLabel");                       // "This is imgLabel" will be the text
        imgLabel.setText("This is imgLabel");                                   // Set the text for the JLabel (optional, since it was already set during creation)
        ImageIcon NatImage = new ImageIcon("C:\\Users\\Paxton.Clark"            // Creates an ImageIcon and loads the image
                + "\\OneDrive - Leonardo DRS\\Documents"
                + "\\NetBeansProjects\\JavaGUI\\src\\main"
                + "\\java\\com\\mycompany\\javagui\\NatureImg.jpg");
        Image resizedImage = NatImage.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH); // Resize the image (for example, to 150x150)
        ImageIcon resizedIcon = new ImageIcon(resizedImage);                    // Create a new ImageIcon with the resized image
        imgLabel.setIcon(resizedIcon);                                          // Set the resized image as the label's icon
        imgLabel.setVerticalTextPosition(SwingConstants.BOTTOM);                // Places text at the bottom of the icon
        imgLabel.setHorizontalTextPosition(SwingConstants.CENTER);              // Centers the text horizontally at the bottom of the icon
        
        //JPanel = a GUI compnent that functions as a container to hold other components______________________________________________________________________________________________________________________
        //Creating Labels for the Panels
        JLabel labelx = new JLabel();
        labelx.setText("Label X");
        labelx.setForeground(Color.white);
        JLabel labely = new JLabel();
        labely.setText("Label Y");
        labely.setForeground(Color.white);
        JLabel labelz = new JLabel();
        labelz.setText("Label Z");
        labelz.setForeground(Color.white);
        //Creating Panels
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(100, 0, 100, 100);
        redpanel.add(labelx);
        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(0, 0, 100, 100);
        bluepanel.add(labely);
        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 100, 200, 50);
        greenpanel.add(labelz);
        // Adding Panels to the frame
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        
        */
        
        //Buttons_______________________________________________________________
        
        new myButton();
        
        
        //Adding Components to the frame and more frame settings
        //frame.add(imgLabel);                                                    // Add the label to the frame
        //frame.setVisible(true);                                                 // Make the frame visible

        
        
     
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}