package UtilityComponents;

// @author Paxton.Clark

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JColorChoosers extends JFrame implements ActionListener{

    JButton button;
    JLabel label;
    
    public JColorChoosers(){
        
        button = new JButton("Pick a Color");
        button.addActionListener(this);
        button.setFocusable(false);
        
        label = new JLabel();
        label.setBackground(Color.white);
        label.setOpaque(rootPaneCheckingEnabled);
        label.setText("This is some text");
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));
        
        this.add(button);
        this.add(label);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            
            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.black);
            //label.setForeground(color);
            label.setBackground(color);
        }
    }
}