/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.JAVA_GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import static java.awt.font.TextHitInfo.leading;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Paxton.Clark
 */
public class Mavenproject11_UnitConversion2_PC {

    public static void main(String[] args) {
        boolean x;
        
        new progressBar();
        
        /*
        
        //JFrame = a GUI window to add compnents to______________________________________________________________________________________________________________________________
        JFrame frame = new JFrame();    //creates a new JFrame
        
        frame.setSize(1000, 1000); // Sets the x and y dim for the frame
        frame.setVisible(true);  //Makes frame visible
        frame.setTitle("JFrame Title"); //Titles JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Default setting is to "hide"
        frame.setResizable(false); //Makes the JFrame unable to be resized
        frame.getContentPane().setBackground(new Color(0x123456));        //Changes background color rgb works too
        
        /*
        ImageIcon image = new ImageIcon("\"C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\"
                + "NetBeansProjects\\mavenproject11_UnitConversion2_PC\\src\\main\\java\\com\\mycompany\\"
                + "mavenproject11_unitconversion2_pc\\GhostbustersLogo.jpg\""); //Creates image icon (when working)
        this.setIconImage(image.getImage());   //Changes Icon of frame
        */
        
        //JLabel = a GUI display area for a string text, and image, or both____________________________________________________________________________________________________
        //JLabel label = new JLabel();    //creates a label
        //label.setText("Label");   //Set text of label
        //frame.add(label);
        
        //ImageIcon image = new ImageIcon("GhostbustersLogo.jpg");    //NOT WORKING
        //label.setIcon(image);                                       //NOT WORKING
        
        //label.setHorizontalTextPosition(JLabel.CENTER); //Set text left center or right of image icon
        //label.setVerticalTextPosition(JLabel.CENTER);  //Set text top center or bottom of image icon
        
        //label.setHorizontalAlignment(JLabel.CENTER);    //Changes the horizontal positioning w/in label
        //label.setVerticalAlignment(JLabel.CENTER);      //Changes the vertical positioning w/in label
        
        //label.setForeground(Color.black);   //Changes text color
        //label.setFont(new Font("MV Boli", Font.PLAIN, 20));         //Set font of text
        //label.setIconTextGap(100); //Sets the gap between image and text
        
        //Border border = BorderFactory.createLineBorder(Color.black, 6);
        //label.setBorder(border);
        
        //label.setBackground(Color.white);
        //label.setOpaque(true);
        
        //frame.setLayout(null);
        //label.setBounds(730, 710, 100, 100);        //sets x and y position within frame as well as dimensions
                //x-coordinate, y-coordinate, x-size, y-size
        
        //frame.pack();     //adjusts to fit what is in the label (add all compnents before using frame.pack();
        
        
        //JPanel = a GUI compnent that functions as a container to hold other components______________________________________________________________________________________________________________________
        
        /*JLabel labelx = new JLabel();
        labelx.setText("Another Label X");
        labelx.setForeground(Color.white);
        
        JLabel labely = new JLabel();
        labely.setText("Another Label Y");
        labely.setForeground(Color.white);
        
        JLabel labelz = new JLabel();
        labelz.setText("Another Label Z");
        labelz.setForeground(Color.black);
        
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(250, 0, 250, 250);
        redpanel.setBorder(border);
        frame.add(redpanel);
        redpanel.add(labelx);
        
        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(0, 0, 250, 250);
        frame.add(bluepanel);
        bluepanel.add(labely);
        
        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 500, 250);
        frame.add(greenpanel);
        greenpanel.add(labelz);
        
        */
        
        
        //Buttons_______________________________________________________________
        
        // JButton = a buton that performs an action when clicked on
        //Button code is in myFrame.java
        //myFrame();
        
        
        //Border Layout Manager_________________________________________________
        
        // Border layout = A BorderLayout places components in five areas: NORTH,SOUTH,EAST,WEST,CENTER.
        //                 All extra space is placed in the center area
        
        
        /*
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10, 10));  //sets border layout and then adds margins
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        
        panel1.setPreferredSize(new Dimension(100, 50));
        panel2.setPreferredSize(new Dimension(50, 100));
        panel3.setPreferredSize(new Dimension(50, 100));
        panel4.setPreferredSize(new Dimension(100, 50));
        panel5.setPreferredSize(new Dimension(100, 100));
        
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);
        
        panel5.setLayout(new BorderLayout(10, 10));
        
        //Sub Panels---------------------------------------------
        
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panelX = new JPanel();
        
        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panelX.setPreferredSize(new Dimension(50, 50));
        
        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panelX.setBackground(Color.white);
        
        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panelX, BorderLayout.CENTER);
        
        //-------------------------------------------------------
        
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);
        */
        
        /*
        //Flow Layout Manager___________________________________________________
        
        //FlowLayout = places components in a row, sized at their preferred size.
        //             If the horizontal space in the container is too small,
        //             the FlowLayout class uses the next avalible row.
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));     //Center is default
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());
        
        
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));
        panel.add(new JButton("11"));
        panel.add(new JButton("12"));
        panel.add(new JButton("13"));
        panel.add(new JButton("14"));
        panel.add(new JButton("15"));
        panel.add(new JButton("16"));
        panel.add(new JButton("17"));
        panel.add(new JButton("18"));
        panel.add(new JButton("19"));
        panel.add(new JButton("20"));
        
        frame.add(panel);
        panel.setVisible(true);
        frame.setVisible(true);
        */
        
        /*
        //Grid Layout Manager___________________________________________________
        
        //GridLayout = places components in a grid of cells.
        //             Each component takes all the avalible space within its cell,
        //             and each cell is the same size
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3, 3, 2, 2));  //Rows, Colums, Margins
        
        JButton button1 = new JButton("1");
        frame.add(button1);
        JButton button2 = new JButton("2");
        frame.add(button2);
        JButton button3 = new JButton("3");
        frame.add(button3);
        JButton button4 = new JButton("4");
        frame.add(button4);
        JButton button5 = new JButton("5");
        frame.add(button5);
        JButton button6 = new JButton("6");
        frame.add(button6);
        JButton button7 = new JButton("7");
        frame.add(button7);
        JButton button8 = new JButton("8");
        frame.add(button8);
        JButton button9 = new JButton("9");
        frame.add(button9);
        //JButton buttonX = new JButton("X");       //What happens if we add an uneven number of compnents
        //frame.add(buttonX);
        
        frame.setVisible(true);
        */
        
        /*
        //JLayeredPanes_________________________________________________________
        
        //JLayeredPane = Swing container that provides a third dimension for positioning components (Z-index)
        
        JFrame frame = new JFrame("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        
        
        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);      //OR: Integer.valueOf(0)    0 = layer number      
        layeredPane.add(label2, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(label3, JLayeredPane.MODAL_LAYER);
        layeredPane.add(label4, JLayeredPane.POPUP_LAYER);
        layeredPane.add(label5, JLayeredPane.DRAG_LAYER);
        */
        
        //Opening a new Window__________________________________________________
        //Includes newWindow.java abd launchPage.java
        //launchPage launchPage = new launchPage();
        
        //JOption Panes_________________________________________________________
        
        //JOption Pane = a pop up standard dialog box that prompts users for a value or informs them of something
        
        //JOptionPane.showMessageDialog(null, "This is a useless plain message", "Plain Title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "Info Title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a useless question?", "Question Title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a useless warning!", "Warning Title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a useless error", "Error Title", JOptionPane.ERROR_MESSAGE);
        
        //int answer = (JOptionPane.showConfirmDialog(null, "Do you like coding?", "Yes, No, Cancel", JOptionPane.YES_NO_CANCEL_OPTION));
        //System.out.println(JOptionPane.showConfirmDialog(null, "Do you like coding?", "Yes, No, Cancel", JOptionPane.YES_NO_CANCEL_OPTION));
        //System.out.println(answer);
       
        //String name = JOptionPane.showInputDialog("What is your name?");
        //System.out.println("Hello  " + name);
        
        //String[] responses = {"No, you are awesome", "Thanks", "No I\'m not"};
        //ImageIcon icon = new ImageIcon("Image.png");
        //JOptionPane.showOptionDialog(null, "You are awesome", 
        //                             "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, 
        //                             JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
        
        //Text Fields___________________________________________________________
        
        //JTextField = A GUI textbox component that can be used to add set or get text
        //Code in mytextfram.java
        //mytextframe frame = new mytextframe();
        
        //Checkboxs_____________________________________________________________
        
        //JCheckboxes = A GUI component that can be selected or de-selected
        //Code in checkboxFrame.java
        //new checkboxFrame();
        
        //Radio Buttons_________________________________________________________
        
        //JRadioButton = one or more buttons in a grouping where only 1 may be selected
        //Code in radioButtonFrame.java
        //new radioButtonFrame();
        
        //Combo Boxes___________________________________________________________
        
        //JComboBoxes = a GUI component that combines a button or etidable field and a drop-down list
        //Code in comboBoxes.java
        //new comboBoxes();
        
        //Sliders_______________________________________________________________
        
        //JSliders = a GUI component that lets users enter a value by using an adjustable sliding knob on a track
        //Code in slider.java
        //new slider();
        
        //Progress Bars_________________________________________________________
        
        //JProgressBar = a visual aid tool to let the user know that an operation is processing
        //Code in progressBar.java
        //new progressBar();
        
        //Menu Bars_____________________________________________________________
        //Code in menuBar.java
        //new menuBar();
        
        
        //File Choosers_________________________________________________________
        //JFileChooser = a GUI mechanism that let's a user choose a file (helpful for opening or saving a file)
        //Code in fileChooser.java
        //new fileChooser();
        
        //Color Chooser
        //JColorChooser = a GUI mechanism that let's a user choose a color
        //Code in colorChooser.java
        //new colorChooser();
        
        //Key Listener__________________________________________________________
        //Code in keyListener.java
        //new keyListener();
        
        //Mouse Listener________________________________________________________
        //Code in mouseListener.java
        //new mouseListener();
        
        //Drag and Drop_________________________________________________________
        //Code in dragAndDrop.java and dragPanel.java
        //new dragAndDrop();
        //NOT CURRENTLEY WORKING
        
        //Key Bindings__________________________________________________________
        //Key Bindings = bind an action to a keystroke which doesnt require you to click on a component
        //               all Swing components use key bindings
        //               increased flexibility compared to keylisteners and can 
        //               assign key strokes to individual Swing components
        //               more difficult to utilize and set up
        
        
        
        
        
    }
    
    
    
    
    
    //Button Method
    //private static void myFrame() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
















}
