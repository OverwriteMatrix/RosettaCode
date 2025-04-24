package OtherComponents;

// @author Paxton.Clark

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ALLinOne extends JFrame implements ActionListener, KeyListener, ItemListener{
    
    JFrame frame = new JFrame();
    JPanel panelTitle = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    
    public ALLinOne(){
        // Frame Specifications
        frame.setTitle("Java Swing");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 540);
        frame.setLayout(null);
        
        // Panel Locations
        panelTitle.setBounds(0, 0, 500, 40);
        panel1.setBounds(0, 40, 250, 250);
        panel2.setBounds(250, 40, 250, 250);
        panel3.setBounds(0, 290, 250, 250);
        panel4.setBounds(250, 290, 250, 250);
        // Panel Background Colors
        panel1.setBackground(new Color(230, 230, 230));
        panel2.setBackground(new Color(208, 208, 208));
        panel3.setBackground(new Color(180, 180, 180));
        panel4.setBackground(new Color(150, 150, 150));
        // Default Panel Specifications
        JPanel[] panels = {panelTitle, panel1, panel2, panel3, panel4};
        for(JPanel panel : panels){
            panel.setLayout(null);
            frame.add(panel);
        }
        // Unique Panel Specifications
        panelTitle.setLayout(new FlowLayout());
        
        buildPanelTitle();
        buildPanel1();
        buildPanel2();
        buildPanel3();
        buildPanel4();
        
        
        frame.setVisible(true);
    }
    
    public void buildPanelTitle(){
        JLabel label = new JLabel("Java Swing");
        label.setFont(new Font("Arial", Font.BOLD, 30));
        label.setToolTipText("Java Swing (JLabel)");
        panelTitle.add(label);
       
    }
    
    public void buildPanel1(){
        // JButton
        JButton button = new JButton();
        button.setBounds(5, 5, 80, 30);
        button.setFocusable(false);
        button.setText("JButton");
        panel1.add(button);
        // JToggleButton
        JToggleButton toggleButton = new JToggleButton();
        toggleButton.setBounds(5, 40, 120, 30);
        toggleButton.setFocusable(false);
        toggleButton.setText("JToggleButton");
        panel1.add(toggleButton);
        //JCheckBox
        JCheckBox checkBox = new JCheckBox();
        checkBox.setBounds(5, 75, 100, 30);
        checkBox.setFocusable(false);
        checkBox.setText("JCheckBox");
        panel1.add(checkBox);
        // JRadioButton
            // Create radio buttons
            JRadioButton btn1 = new JRadioButton("Radio Button 1");
            JRadioButton btn2 = new JRadioButton("Radio Button 2");
            JRadioButton btn3 = new JRadioButton("Radio Button 3");
            // Set Focusable
            btn1.setFocusable(false);
            btn2.setFocusable(false);
            btn3.setFocusable(false);
            // Set Bounds
            btn1.setBounds(5, 120, 130, 15);
            btn2.setBounds(5, 140, 130, 15);
            btn3.setBounds(5, 160, 130, 15);
            // Group the radio buttons
            ButtonGroup genderGroup = new ButtonGroup();
            genderGroup.add(btn1);
            genderGroup.add(btn2);
            genderGroup.add(btn3);
            // Add radio buttons to panel
            panel1.add(btn1);
            panel1.add(btn2);
            panel1.add(btn3);
        // JComboBox
            // Create combo box with items
            String[] languages = { "Java", "Python", "C++", "JavaScript" };
            JComboBox languageComboBox = new JComboBox<>(languages);
            languageComboBox.addActionListener(this);
            // Add combo box to frame
            panel1.add(languageComboBox);
            // Label to show selected item
            JLabel resultLabel = new JLabel("Selected: Java");
            panel1.add(resultLabel);
            // Set Bounds
            languageComboBox.setBounds(5, 160, 100, 30);
            resultLabel.setBounds(5, 40, 200, 50);
        
    }
    public void buildPanel2(){
        
    }
    public void buildPanel3(){
        
    }
    public void buildPanel4(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
