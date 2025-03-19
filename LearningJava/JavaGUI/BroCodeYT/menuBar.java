package com.mycompany.mavenproject11_unitconversion2_pc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Paxton.Clark
 */
public class menuBar extends JFrame implements ActionListener{

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    
    menuBar(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        
        menuBar = new JMenuBar();
        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        
        fileMenu.setMnemonic(KeyEvent.VK_F);    //Alt + F for File            
        editMenu.setMnemonic(KeyEvent.VK_E);    //Alt + E for Edit
        helpMenu.setMnemonic(KeyEvent.VK_H);    //Alt + H for Help
        
        loadItem.setMnemonic(KeyEvent.VK_L);    //L for Load
        saveItem.setMnemonic(KeyEvent.VK_S);    //S for Save
        exitItem.setMnemonic(KeyEvent.VK_E);    //E for Exit
        
        
        this.setJMenuBar(menuBar);
        this.setVisible(true);
        
        
        
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loadItem){
            System.out.println("Loading Item");
        } else if (e.getSource()==saveItem){
            System.out.println("Saving Item");
        } else if (e.getSource()==exitItem){
            System.exit(0);
        }

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setMenuBar(JMenuBar menuBar) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
