package ContainersLayoutComponents;

// @author Paxton.Clark

import java.awt.Color;
import javax.swing.*;

public class JLayeredPanes {
    
    public JLayeredPanes(){
        JFrame frame = new JFrame("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        frame.add(layeredPane);
        
        JLabel label1 = new JLabel("Default");
        label1.setOpaque(true);
        label1.setForeground(Color.black);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);
        
        JLabel label2 = new JLabel("Palette");
        label2.setOpaque(true);
        label2.setForeground(Color.black);
        label2.setBackground(Color.green);
        label2.setBounds(100, 100, 200, 200);
        
        JLabel label3 = new JLabel("Modal");
        label3.setOpaque(true);
        label3.setForeground(Color.white);
        label3.setBackground(Color.blue);
        label3.setBounds(150, 150, 200, 200);
        
        JLabel label4 = new JLabel("PopUp");
        label4.setOpaque(true);
        label4.setForeground(Color.black);
        label4.setBackground(Color.lightGray);
        label4.setBounds(200, 200, 200, 200);
        
        JLabel label5 = new JLabel("Drag");
        label5.setOpaque(true);
        label5.setForeground(Color.black);
        label5.setBackground(Color.gray);
        label5.setBounds(250, 250, 200, 200);
        
        
        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);      // OR: Integer.valueOf(0)    0 = layer number      
        layeredPane.add(label2, JLayeredPane.PALETTE_LAYER);      // OR: Integer.valueOf(1)    1 = layer number
        layeredPane.add(label3, JLayeredPane.MODAL_LAYER);        // OR: Integer.valueOf(2)    2 = layer number
        layeredPane.add(label4, JLayeredPane.POPUP_LAYER);        // OR: Integer.valueOf(3)    3 = layer number
        layeredPane.add(label5, JLayeredPane.DRAG_LAYER);         // OR: Integer.valueOf(4)    4 = layer number
    }
}
