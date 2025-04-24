package TopLevelContainers;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

// @author Paxton.Clark

public class JDialogs extends JFrame implements ActionListener{
    
    /* 
       A JDialog is a popup window used in Java Swing applications 
       to interact with the user without navigating away from the 
       main window (JFrame). It's perfect for temporary messages, 
       prompts, or secondary actions. Main uses include:
       confirmation prompts, input dialogs, notifications, custom
       pop-up forms, and modal windows.
    */
    
    
    JFrame frame = new JFrame();
    JButton button = new JButton();
    
    public JDialogs(){
        
        frame.setTitle("JDialogs");          
        frame.setSize(300, 100);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);     
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);              
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        frame.setLayout(null);
        
        button.setText("New JDialog");
        button.setBounds(10, 10, 200, 40);
        button.addActionListener(this);
        button.setFocusable(false);
        
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            JDialog dialog = new JDialog(frame, "This is a Dialog", true);  // 'true' makes it modal (A modal window (like a JDialog set to modal) 
                                                                            // is a pop-up that blocks interaction with the main window until the user closes it.)
            dialog.setSize(200, 100);
            dialog.setLayout(new FlowLayout());
            
            JLabel label = new JLabel("Hello from the dialog!");
            JButton okButton = new JButton("OK");
            okButton.setFocusable(false);

            okButton.addActionListener(new ActionListener() {   // Anonymous class (in-line action listener actions)
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose(); // Close the dialog
                }
            });
            
            dialog.add(label);
            dialog.add(okButton);
            
            dialog.setLocationRelativeTo(frame);    // Center the dialog
            dialog.setVisible(true);                // Show the dialog
        }
    }
    
}
