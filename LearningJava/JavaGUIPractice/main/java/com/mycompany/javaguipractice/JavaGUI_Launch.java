package com.mycompany.javaguipractice;

/**
 * @author Paxton.Clark
 */

import com.mycompany.javaguipractice.JavaGUI.colorChooser;
import com.mycompany.javaguipractice.JavaGUI.keyListener;
import com.mycompany.javaguipractice.JavaGUI.checkBox;
import com.mycompany.javaguipractice.JavaGUI.comboBox;
import com.mycompany.javaguipractice.JavaGUI.progressBar;
import com.mycompany.javaguipractice.JavaGUI.menuBar;
import com.mycompany.javaguipractice.JavaGUI.mouseListener;
import com.mycompany.javaguipractice.JavaGUI.dragPanel;
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
    JButton btn4 = new JButton("Drag Panel");
    JButton btn5 = new JButton("Key Listener");
    JButton btn6 = new JButton("Menu Bar");
    JButton btn7 = new JButton("Mouse Listener");
    JButton btn8 = new JButton("Progress Bar");
    
    JButton[] buttons = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8};
    
    JavaGUI_Launch(){
        
        label.setBounds(10, 0, 250, 40);
        label.setText("Java GUI");
        label.setFont(new Font("Poppins", Font.PLAIN, 22));
        frame.add(label);
        
        for(JButton btn : buttons){
            btn.setSize(200, 40);
            btn.setFocusable(false);
            btn.addActionListener(this);
            frame.add(btn);
        }
        
        btn1.setLocation(10, 50);
        btn2.setLocation(10, 100);
        btn3.setLocation(10, 150);
        btn4.setLocation(10, 200);
        btn5.setLocation(225, 50);
        btn6.setLocation(225, 100);
        btn7.setLocation(225, 150);
        btn8.setLocation(225, 200);
      
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
            new dragPanel();
        } else if (e.getSource()==btn5){
            new keyListener(); 
        } else if (e.getSource()==btn6){
            new menuBar();
        } else if (e.getSource()==btn7){
            new mouseListener();                 
        } else if (e.getSource()==btn8){
            new progressBar();         
        }
    } 
}
