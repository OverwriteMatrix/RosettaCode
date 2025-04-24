package InputComponents;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// @author Paxton.Clark

public class JToggleButtons {
    
    /* 
       A JToggleButton behaves like a button, but instead of only 
       being pressed or released once, it can be toggled between 
       two states: selected (pressed) and deselected (not pressed).
       It's often used for on/off switches (like a light switch) 
       or for any scenario where you need a button to stay in one 
       of two states.
    */
    
    JFrame frame = new JFrame();
    
    public JToggleButtons(){

        // Create the main frame
        JFrame frame = new JFrame("JToggleButton Example");
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create the JToggleButton
        JToggleButton toggleButton = new JToggleButton("Turn On");
        toggleButton.setFocusable(false);
        
        // Set an ActionListener to detect changes in state
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    toggleButton.setText("Turn Off");
                    System.out.println("IT'S ON");
                } else {
                    toggleButton.setText("Turn On");
                    System.out.println("IT'S OFF");
                }
            }
        });

        frame.add(toggleButton);
        frame.setVisible(true);
    }
}