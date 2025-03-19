/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA_GUI;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Paxton.Clark
 */
public class slider implements ChangeListener{

    JFrame frame;
    JLabel label;
    JPanel panel;
    JSlider slider;

    slider(){
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50); //(min, max, starting point)
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setOrientation(SwingConstants.VERTICAL);         //Changes orientation of slider to vertical
        //slider.setOrientation(SwingConstants.HORIZONTAL);   //Horizontal is default
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider.addChangeListener(this);
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

