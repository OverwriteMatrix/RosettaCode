package com.mycompany.javaguipractice;

/**
 * @author Paxton.Clark
 */

import com.mycompany.javaguipractice.JavaGUI.colorChooser;
import com.mycompany.javaguipractice.JavaGUI.keyListener;
import com.mycompany.javaguipractice.JavaGUI.checkBox;
import com.mycompany.javaguipractice.JavaGUI.comboBox;
import com.mycompany.javaguipractice.JavaGUI.progressBar;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Paxton.Clark
 */
public class JavaGUI_Launch implements ActionListener{
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JButton btn1 = new JButton("Check Box");
    JButton btn2 = new JButton("Color Chooser");
    JButton btn3 = new JButton("Combo Box");
    JButton btn4 = new JButton("Program");
    JButton btn5 = new JButton("Key Listener");
    JButton btn6 = new JButton("Program");
    JButton btn7 = new JButton("Program");
    JButton btn8 = new JButton("Progress Bar");
    JButton btn9 = new JButton("Program");
    JButton btn0 = new JButton("Quit");
    
    JavaGUI_Launch(){
        
        label.setBounds(10, 0, 250, 40);
        label.setText("Java GUI");
        label.setFont(new Font("Poppins", Font.PLAIN, 22));
        frame.add(label);
        
        btn1.setBounds(10, 50, 200, 40);
        btn1.setFocusable(false);
        btn1.addActionListener(this);
        frame.add(btn1);
        
        btn2.setBounds(10, 100, 200, 40);
        btn2.setFocusable(false);
        btn2.addActionListener(this);
        frame.add(btn2);
        
        btn3.setBounds(10, 150, 200, 40);
        btn3.setFocusable(false);
        btn3.addActionListener(this);
        frame.add(btn3);
        
        btn4.setBounds(10, 200, 200, 40);
        btn4.setFocusable(false);
        btn4.addActionListener(this);
        frame.add(btn4);
        
        btn5.setBounds(225, 50, 200, 40);
        btn5.setFocusable(false);
        btn5.addActionListener(this);
        frame.add(btn5);
        
        btn6.setBounds(225, 100, 200, 40);
        btn6.setFocusable(false);
        btn6.addActionListener(this);
        frame.add(btn6);
        
        btn7.setBounds(225, 150, 200, 40);
        btn7.setFocusable(false);
        btn7.addActionListener(this);
        frame.add(btn7);
        
        btn8.setBounds(225, 200, 200, 40);
        btn8.setFocusable(false);
        btn8.addActionListener(this);
        frame.add(btn8);

        frame.setTitle("Launch Page"); 
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(450, 500);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1){
            new checkBox();
        } else if (e.getSource()==btn2){
            new colorChooser();     
        } else if (e.getSource()==btn3){
            new comboBox();
        } else if (e.getSource()==btn4){
            
        } else if (e.getSource()==btn5){
            new keyListener(); 
        } else if (e.getSource()==btn6){
                 
        } else if (e.getSource()==btn7){
            System.out.println("Button 7 Pressed");                 
        } else if (e.getSource()==btn8){
            new progressBar();         
        }
    }
    
    
}
