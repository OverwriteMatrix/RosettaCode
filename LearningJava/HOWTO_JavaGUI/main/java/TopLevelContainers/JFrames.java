package TopLevelContainers;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

// @author Paxton.Clark

public class JFrames {
    
    JFrame frame = new JFrame();
    
    public JFrames(){
        
        frame.setTitle("JFrames");           // Titles the JFrame
        frame.setSize(500, 500);            // Sets the size of the frame (X, Y)
        //frame.setLocation(null);          // Sets the location on screen for the frame (X, Y) by default it appears in the top left corner
        frame.setResizable(false);          // Sets weather or not the frame can be resized or not
        
        frame.setLocationRelativeTo(null);  // Positions the frame relative to another component (pass in the other components name) 
                                            // if null it centers the frame on the screen
                                            
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);  // The JFrame itself doesn’t directly show content. 
                                                                 // Its content pane is what you actually see and interact with, 
                                                                 // so you set the background color on the content pane (See Colors.java for more info on colors)
                                                                 
        frame.setUndecorated(false);    // Sets weather or not the frame has the bar with the title and minimize and close buttons
                                            
        // Frame Default Close Operations
        // EXIT_ON_CLOSE: Terminates everything on close of the frame (program + frame)  (Not Sure? -> THIS ONE)
        // DO_NOTHING_ON_CLOSE: Does nothing on close (Disables the close button)
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Gets rid of the frame on close but does not terminate the program
        // HIDE_ON_CLOSE: Hides the frame on close (still there just invisable) and does not terminate the program   

        frame.setVisible(true);             // Makes the frame visible or not (Ensure you put at very end so you dont get java.awt.IllegalComponentStateException)
    }
}

/*
    // Good Starter Frame

        frame.setTitle("JFrame");          
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);     
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);              
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 

        frame.setVisible(true);
*/