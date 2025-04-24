package UtilityComponents;

// @author Paxton.Clark

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileChoosers extends JFrame implements ActionListener{
    
    JButton button;
    
    public JFileChoosers(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button = new JButton("Select File");
        button.addActionListener(this);
        
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
           
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));  //"." Saves to project folder but a direct file path can be placed here
            
            
            //int response = fileChooser.showOpenDialog(null);       //select file to open
            int response = fileChooser.showSaveDialog(null);        //Select file to save
            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
     
            //fileChooser.showSaveDialog(this);
        }
    }
}