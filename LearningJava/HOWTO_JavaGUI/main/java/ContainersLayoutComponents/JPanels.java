/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContainersLayoutComponents;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Paxton.Clark
 */
public class JPanels {
    
    JFrame frame = new JFrame();
   
    public JPanels(){
        frame.setTitle("JPanels");          
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);     
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);              
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
        
        JPanel redpanel = new JPanel();         // Declaring a new JPanel
        redpanel.setBackground(Color.red);      // Seting the background color of redpanel
        redpanel.setBounds(250, 0, 250, 250);   // Setting the the location (X, Y) and the size (X, Y) so (X, Y, X, Y)
        frame.add(redpanel);                    // Adding the panel to the JFrame
        
        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(0, 0, 250, 250);
        frame.add(bluepanel);
        
        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 500, 250);
        frame.add(greenpanel);
        
        frame.setVisible(true);
    }
}
