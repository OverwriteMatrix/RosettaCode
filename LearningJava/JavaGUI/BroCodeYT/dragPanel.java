package com.mycompany.mavenproject11_unitconversion2_pc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

/**
 *
 * @author Paxton.Clark
 */

/*
*************************************************************
*************************************************************
*************************************************************
NOT CURRENTLEY WORKING---------------------------------------
*************************************************************
*************************************************************
*************************************************************
*/

public class dragPanel extends JPanel{
    
    JPanel panel = new JPanel();
    final int Width = panel.getWidth();
    final int Height = panel.getHeight();
    Point panelCorner;
    Point prevPt;
    
    
    dragPanel(){
        panel.setSize(50,50);
        panel.setBackground(Color.red);
        panel.setOpaque(true);
        panel.setVisible(true);
        
        panelCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        panel.paint(g);
   
    }
    
    private class ClickListener extends MouseAdapter{
        
        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();
        }
    }
    
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();
            
            panelCorner.translate(
            
                    (int)(currentPt.getX() - prevPt.getX()),
                    (int)(currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();
        }
    }
    
}
