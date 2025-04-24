/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputComponents;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Paxton.Clark
 */
public class JButtons extends JFrame implements ActionListener{
    
    /* 
       An ActionListener is like a listener or a watcher that waits 
       for something to happen — in this case, when a JButton is clicked. 
       When the button is clicked, the ActionListener says: "Hey! The 
       button was clicked! Let's do something!"
    */
    
    JFrame frame = new JFrame();
    JButton button1 = new JButton();
    
    public JButtons(){
        
        frame.setTitle("JButtons");          
        frame.setSize(300, 100);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);     
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);              
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        frame.setLayout(null);
        
        button1.setText("Print 'Hello' to console.");  // Sets the button's text
        button1.setBounds(10, 10, 200, 40);            // Sets the button's bounds (Location X, Location Y, Size X, Size Y)
        button1.addActionListener(this);               // Adds an Action Listener to the button
        button1.setFocusable(false);                   // Makes the button focusable or not (gray box on button)
        button1.setBackground(Color.red);              // Sets the button's background color
        button1.setOpaque(true);                       // Allows the button's background color to show if it is contained be an element that has a background color
        button1.setForeground(Color.black);            // Sets the button's text color
        
        frame.add(button1);
        frame.setVisible(true);
    }
    
    /*
       Below is where the action listener code goes to add more than 
       one button or component that requires the action listener use 
       an if statement like this: if (e.getSource() == component name){}.
    */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            System.out.println("Hello");
        }
    }
    
}
