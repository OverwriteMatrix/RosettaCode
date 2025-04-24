package com.mycompany.howto_javagui;

import ContainersLayoutComponents.*;
import DisplayComponents.*;
import MenuComponents.*;
import OtherComponents.*;
import TopLevelContainers.*;
import InputComponents.*;
import UtilityComponents.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

// @author Paxton.Clark

public class HOWTO_main extends JFrame implements ActionListener{
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    
    // Top-Level Components
    JButton btnJFrame = new JButton();
    JButton btnJDialogs = new JButton();
    JButton btnJWindows = new JButton();
    // Containers & Layout Components
    JButton btnJPanels = new JButton();
    JButton btnJScrollPanes = new JButton();
    JButton btnJSplitPanes = new JButton();
    JButton btnJTabbedPanes = new JButton();
    JButton btnJLayeredPanes = new JButton();
    JButton btnJDesktopPanes = new JButton();
    JButton btnJInternalFrames = new JButton();
    JButton btnJToolBars = new JButton();
    JButton btnJavaBoxs = new JButton();
    // Input Components
    JButton btnJButtons = new JButton();
    JButton btnJToggleButton = new JButton();
    JButton btnJCheckBoxs = new JButton();
    JButton btnJRadioButtons = new JButton();
    JButton btnJComboBoxs = new JButton();
    JButton btnJTextFields = new JButton();
    JButton btnJPasswordFields = new JButton();
    JButton btnJTextAreas = new JButton();
    JButton btnJSpinners = new JButton();
    JButton btnJSliders = new JButton();
    JButton btnJLists = new JButton();
    JButton btnJTables = new JButton();
    JButton btnJTrees = new JButton();
    // Display Components
    JButton btnJLabels = new JButton();
    JButton btnJProgressBars = new JButton();
    JButton btnJSeparators = new JButton();
    JButton btnJToolTips = new JButton();
    JButton btnJEditorPanes = new JButton();
    JButton btnJTextPanes = new JButton();
    // Menu Components
    JButton btnJMenuBars = new JButton();
    JButton btnJMenus = new JButton();
    JButton btnJMenuItems = new JButton();
    JButton btnJCheckBoxMenuItems = new JButton();
    JButton btnJRadioButtonMenuItems = new JButton();
    // Utility Components
    JButton btnJFileChoosers = new JButton();
    JButton btnJColorChooser = new JButton();  // Can also be considered a utility/input
    JButton btnJavaTimers = new JButton();
    JButton btnJavaInputVerifiers = new JButton();
    // Other Components
    JButton btnJavaCanvas = new JButton();

    JButton[] buttons = {btnJFrame, btnJPanels, btnJLabels, btnJButtons, btnJDialogs, btnJWindows, btnJavaCanvas, btnJToggleButton, btnJCheckBoxs, 
                         btnJRadioButtons, btnJComboBoxs, btnJTextFields, btnJPasswordFields, btnJTextAreas, btnJSpinners, btnJSliders, btnJLists, btnJTables, btnJTrees,
                         btnJColorChooser, btnJScrollPanes, btnJSplitPanes, btnJTabbedPanes, btnJLayeredPanes, btnJDesktopPanes, btnJInternalFrames, btnJToolBars, btnJavaBoxs,
                         btnJProgressBars, btnJSeparators, btnJToolTips, btnJEditorPanes, btnJTextPanes, btnJMenuBars, btnJMenus, btnJMenuItems, btnJCheckBoxMenuItems, 
                         btnJRadioButtonMenuItems, btnJFileChoosers, btnJavaTimers, btnJavaInputVerifiers};
    
    JLabel topLevelLabel = new JLabel("Top-Level Containers");
    JLabel layoutLabel = new JLabel("Containers & Layout Components");
    JLabel inputCom = new JLabel("Input Components");
    JLabel displayLabel = new JLabel("Display Components");
    JLabel menuLabel = new JLabel("Menu Components");
    JLabel utilityLabel = new JLabel("Utility Components");
    JLabel otherLabel = new JLabel("Other Components");
    
    JLabel[] labels = {topLevelLabel, layoutLabel, inputCom, displayLabel, menuLabel, utilityLabel, otherLabel};
    
    HOWTO_main(){
        // Frame Styling
        frame.setTitle("Individual Java GUI Components");          
        frame.setSize(550, 250);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);     
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);              
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        // Default Panel To Replace Content Pane Additions
        panel.setLayout(null);
        panel.setBackground(new Color(205, 205, 205));
        
        // Default Button Styling
        for(JButton button : buttons){
            button.setFocusable(false);
            button.addActionListener(this);
            button.setFont(new Font("Arial", Font.BOLD, 9));
            panel.add(button);
        }

        // Menu Bar
        String[] buttonLabels = {"Top", "Layout", "Input", "Display", "Menu", "Utility", "Other"}; // Custom button labels
        JPanel menuPanel = new JPanel();           // Create a panel for the "menu bar"
        menuPanel.setLayout(new GridLayout(1, 7)); // 1 row, 7 columns
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            // Menu Bar Button Styling
            button.setFocusPainted(false);
            button.setBackground(Color.black);
            button.setForeground(Color.white);
            button.setBorder(BorderFactory.createLineBorder(Color.black));
            // Menu Bar Hover Effect
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    button.setBackground(new Color(60, 130, 200)); // Soft blue
                    button.setForeground(Color.black);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button.setBackground(Color.black);
                    button.setForeground(Color.white);
                }
            });
            // Menu Bar Button Click action
            button.addActionListener(e -> {
                if(label.equals("Top")){
                    hideButtons();
                    hideLabels();
                    frame.setSize(550, 250);
                    
                    JButton[] topLevel = {btnJFrame, btnJDialogs, btnJWindows};
                    
                    // Default Top-Level Button Styling
                    for(JButton tlButton : topLevel){
                        tlButton.setVisible(true);
                        tlButton.setBackground(Color.gray);
                        tlButton.setForeground(Color.black);
                    }
                    
                    // Unique Top-Level Buttons Styling
                    btnJWindows.setFont(new Font("Arial", Font.BOLD, 8));
                    
                    // Top-Level Label Styling
                    topLevelLabel.setVisible(true);
                    topLevelLabel.setBounds(10, 5, 150, 30);
                    topLevelLabel.setText("<html><u>Top-Level Containers</u></html>");
                    topLevelLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    
                    // .setText() for Top-Level Buttons
                    btnJFrame.setText("JFrames");
                    btnJDialogs.setText("JDialogs");
                    btnJWindows.setText("JWindow");
                    
                    // .setBounds() for Top-Level Buttons
                    btnJFrame.setBounds(10, 35, 75, 30);
                    btnJDialogs.setBounds(95, 35, 75, 30);
                    btnJWindows.setBounds(180, 35, 75, 30);
                }
                else if(label.equals("Layout")){
                    hideButtons();
                    hideLabels();
                    frame.setSize(550, 250);
                    
                    JButton[] layoutBtns = {btnJPanels, btnJScrollPanes, btnJSplitPanes, btnJTabbedPanes, btnJLayeredPanes, btnJDesktopPanes, btnJInternalFrames, btnJToolBars, btnJavaBoxs};
                    
                    // Default Layout Buttons Styling
                    for(JButton layoutBtn : layoutBtns){
                        layoutBtn.setVisible(true);
                        layoutBtn.setBackground(Color.gray);
                        layoutBtn.setForeground(Color.black);
                    }
                    
                    // Layout Label Styling
                    layoutLabel.setVisible(true);
                    layoutLabel.setBounds(10, 5, 300, 30);
                    layoutLabel.setText("<html><u>Containers & Layout Components</u></html>");
                    layoutLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    
                    // .setText() for Layout Buttons
                            btnJPanels.setText("JPanels");
                       btnJScrollPanes.setText("JScrollPanes");
                        btnJSplitPanes.setText("JSplitPanes");
                       btnJTabbedPanes.setText("JTabbedPanes");
                      btnJLayeredPanes.setText("JLayeredPanes");
                      btnJDesktopPanes.setText("JDesktopPanes");
                    btnJInternalFrames.setText("JInternalFrames");
                          btnJToolBars.setText("JToolBars");
                           btnJavaBoxs.setText("Boxs");
                    // .setBounds() for Layout Buttons
                            btnJPanels.setBounds(10, 35, 115, 30);
                       btnJScrollPanes.setBounds(135, 35, 115, 30);
                        btnJSplitPanes.setBounds(260, 35, 115, 30);
                       btnJTabbedPanes.setBounds(10, 70, 115, 30);
                      btnJLayeredPanes.setBounds(135, 70, 115, 30);
                      btnJDesktopPanes.setBounds(260, 70, 115, 30);
                    btnJInternalFrames.setBounds(10, 105, 115, 30);
                          btnJToolBars.setBounds(135, 105, 115, 30);
                           btnJavaBoxs.setBounds(260, 105, 115, 30);
                }
                else if(label.equals("Input")){
                    hideButtons();
                    hideLabels();
                    frame.setSize(550, 250);
                    
                    JButton[] input = {btnJButtons, btnJToggleButton, btnJCheckBoxs, btnJRadioButtons, btnJComboBoxs, 
                                       btnJTextFields, btnJPasswordFields, btnJTextAreas, btnJSpinners, btnJSliders, 
                                       btnJLists, btnJTables, btnJTrees};
                
                    // Default Input Buttons Styling
                    for(JButton inputButton : input){
                        inputButton.setVisible(true);
                        inputButton.setBackground(Color.gray);
                        inputButton.setForeground(Color.black);
                    }
                    
                    // Input Label Styling
                    inputCom.setVisible(true);
                    inputCom.setBounds(10, 5, 150, 30);
                    inputCom.setText("<html><u>Input Components</u></html>");
                    inputCom.setFont(new Font("Arial", Font.BOLD, 15));
                   
                    // .setText() for Input Buttons
                           btnJButtons.setText("JButtons");
                      btnJToggleButton.setText("JToggleButtons");
                         btnJCheckBoxs.setText("JCheckBoxs");
                      btnJRadioButtons.setText("JRadioButtons");
                         btnJComboBoxs.setText("JComboBoxs");
                        btnJTextFields.setText("JTextFields");
                    btnJPasswordFields.setText("JPasswordFields");
                         btnJTextAreas.setText("JTextAreas");
                          btnJSpinners.setText("JSpinners");
                           btnJSliders.setText("JSliders");
                             btnJLists.setText("JLists");
                            btnJTables.setText("JTables");
                             btnJTrees.setText("JTree");
                    
                    // .setBounds() for Input Buttons
                           btnJButtons.setBounds(10, 35, 115, 30);
                      btnJToggleButton.setBounds(10, 75, 115, 30);
                         btnJCheckBoxs.setBounds(10, 115, 115, 30);
                      btnJRadioButtons.setBounds(10, 155, 115, 30);
                    btnJPasswordFields.setBounds(130, 35, 115, 30);
                         btnJTextAreas.setBounds(130, 75, 115, 30);
                          btnJSpinners.setBounds(130, 115, 115, 30);
                           btnJSliders.setBounds(130, 155, 115, 30);
                         btnJComboBoxs.setBounds(250, 75, 115, 30);
                        btnJTextFields.setBounds(250, 35, 115, 30);
                             btnJLists.setBounds(250, 115, 115, 30);
                            btnJTables.setBounds(250, 155, 115, 30);
                             btnJTrees.setBounds(370, 35, 115, 30);
                }
                else if(label.equals("Display")){
                    hideButtons();
                    hideLabels();
                    frame.setSize(550, 250);
                    
                    JButton[] displayButtons = {btnJLabels, btnJProgressBars, btnJSeparators, btnJToolTips, btnJEditorPanes, btnJTextPanes};
                    
                    // Default Display Buttons Styling
                    for(JButton displayButton : displayButtons){
                        displayButton.setVisible(true);
                        displayButton.setBackground(Color.gray);
                        displayButton.setForeground(Color.black);
                    }

                    // Display Label Styling
                    displayLabel.setVisible(true);
                    displayLabel.setBounds(10, 5, 150, 30);
                    displayLabel.setText("<html><u>Display Components</u></html>");
                    displayLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    
                    // .setText() for Display Buttons
                          btnJLabels.setText("JLabels");
                    btnJProgressBars.setText("JProgressBars");
                      btnJSeparators.setText("JSeparators");
                        btnJToolTips.setText("JToolTips");
                     btnJEditorPanes.setText("JEditorPanes");
                       btnJTextPanes.setText("JTextPanes");
                    
                    // .setBounds() for Display Buttons
                          btnJLabels.setBounds(10, 35, 110, 30);
                    btnJProgressBars.setBounds(130, 35, 110, 30);
                      btnJSeparators.setBounds(250, 35, 110, 30);
                        btnJToolTips.setBounds(10, 75, 110, 30);
                     btnJEditorPanes.setBounds(130, 75, 110, 30);
                       btnJTextPanes.setBounds(250, 75, 110, 30);
                }
                else if(label.equals("Menu")){
                    hideButtons();
                    hideLabels();
                    frame.setSize(550, 250);
                    
                    JButton[] menuButtons = {btnJMenuBars, btnJMenus, btnJMenuItems, btnJCheckBoxMenuItems, btnJRadioButtonMenuItems};
                    
                    // Default Menu Buttons Styling
                    for(JButton menuButton : menuButtons){
                        menuButton.setVisible(true);
                        menuButton.setBackground(Color.gray);
                        menuButton.setForeground(Color.black);
                    }

                    // Menu Label Styling
                    menuLabel.setVisible(true);
                    menuLabel.setBounds(10, 5, 150, 30);
                    menuLabel.setText("<html><u>Menu Components</u></html>");
                    menuLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    
                    // .setText() for Menu Buttons
                                btnJMenuBars.setText("JMenuBars");
                                   btnJMenus.setText("JMenus");
                               btnJMenuItems.setText("JMenuItems");
                       btnJCheckBoxMenuItems.setText("JCheckBoxMenuItems");
                    btnJRadioButtonMenuItems.setText("JRadioButtonMenuItems");
                    
                    // .setBounds() for Menu Buttons
                                btnJMenuBars.setBounds(10, 35, 150, 30);
                                   btnJMenus.setBounds(170, 35, 150, 30);
                               btnJMenuItems.setBounds(330, 35, 150, 30);
                       btnJCheckBoxMenuItems.setBounds(170, 75, 150, 30);
                    btnJRadioButtonMenuItems.setBounds(10, 75, 150, 30);
                }
                else if(label.equals("Utility")){
                    hideButtons();
                    hideLabels();
                    frame.setSize(550, 250);
                    
                    JButton[] utilityButtons = {btnJColorChooser, btnJFileChoosers, btnJavaTimers, btnJavaInputVerifiers};
                    
                    // Default Utility Buttons Styling
                    for(JButton utilityButton : utilityButtons){
                        utilityButton.setVisible(true);
                        utilityButton.setBackground(Color.gray);
                        utilityButton.setForeground(Color.black);
                    }

                    // Utility Label Styling
                    utilityLabel.setVisible(true);
                    utilityLabel.setBounds(10, 5, 150, 30);
                    utilityLabel.setText("<html><u>Utility Components</u></html>");
                    utilityLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    
                    // .setText() for Utility Buttons
                         btnJFileChoosers.setText("JFileChoosers");
                         btnJColorChooser.setText("JColorChooser");
                            btnJavaTimers.setText("JavaTimers");
                    btnJavaInputVerifiers.setText("JavaInputVerifiers");
                    
                    // .setBounds() for Utility Buttons
                         btnJFileChoosers.setBounds(10, 35, 120, 30);
                         btnJColorChooser.setBounds(10, 75, 120, 30);
                            btnJavaTimers.setBounds(140, 75, 120, 30);
                    btnJavaInputVerifiers.setBounds(140, 35, 120, 30);
                }
                else if(label.equals("Other")){
                    hideButtons();
                    hideLabels();
                    frame.setSize(550, 250);
                    
                    JButton[] otherButtons = {btnJavaCanvas};
                    
                    // Default Utility Buttons Styling
                    for(JButton otherButton : otherButtons){
                        otherButton.setVisible(true);
                        otherButton.setBackground(Color.gray);
                        otherButton.setForeground(Color.black);
                    }

                    // Other Label Styling
                    otherLabel.setVisible(true);
                    otherLabel.setBounds(10, 5, 150, 30);
                    otherLabel.setText("<html><u>Other Components</u></html>");
                    otherLabel.setFont(new Font("Arial", Font.BOLD, 15));
                    
                    // .setText() for Other Buttons
                    btnJavaCanvas.setText("Java Canvas");
                    
                    // .setBounds() for Other Buttons
                    btnJavaCanvas.setBounds(10, 35, 120, 30);
                }
            });

            menuPanel.add(button);
        }

        // Adding Components
        frame.add(menuPanel, BorderLayout.NORTH);
        panel.add(topLevelLabel);
        panel.add(layoutLabel);
        panel.add(inputCom);
        panel.add(displayLabel);
        panel.add(utilityLabel);
        panel.add(menuLabel);
        panel.add(otherLabel);
        frame.add(panel);
        frame.setVisible(true);
    }

    // Hide Buttons Method - Hides all buttons added to the frame
    public void hideButtons(){
        for(JButton button : buttons){
            button.setVisible(false);
        }
    }
    
    // Hide Labels Method - Hides all labels added to the frame
    public void hideLabels(){
        for(JLabel label : labels){
            label.setVisible(false);
        }
    }
    
    // Action Listener
    @Override
    public void actionPerformed(ActionEvent e) {
        // Top-Level Containers ------------------------------------------------------------------
        if(e.getSource() == btnJFrame){
            new JFrames();
        }                            // JFrames
        else if(e.getSource() == btnJWindows){
            new JWindows();
        }                     // JWindows
        else if(e.getSource() == btnJDialogs){
            new JDialogs();
        }                     // JDialogs
        // Containers & Layout Components --------------------------------------------------------
        else if(e.getSource() == btnJPanels){
            new JPanels();
        }                      // JPanels
        else if(e.getSource() == btnJScrollPanes){
            new JScrollPanes();
        }                 // JScrollPanes
        else if(e.getSource() == btnJSplitPanes){
            new JSplitPanes();
        }                  // JSplitPanes
        else if(e.getSource() == btnJTabbedPanes){
            new JTabbedPanes();
        }                 // JTabbedPanes
        else if(e.getSource() == btnJLayeredPanes){
            new JLayeredPanes();
        }                // JLayeredPanes
        else if(e.getSource() == btnJDesktopPanes){
            new JDesktopPanes();
        }                // JDesktopPanes
        else if(e.getSource() == btnJInternalFrames){
            new JInternalFrames();
        }              // JInternalFrames
        else if(e.getSource() == btnJToolBars){
            new JToolBars();
        }                    // JToolBars
        else if(e.getSource() == btnJavaBoxs){
            new JavaBoxs();
        }                     // Java Boxs
        // Input Components -----------------------------------------------------------------------
        else if(e.getSource() == btnJButtons){
            new JButtons();
        }                     // JButtons
        else if(e.getSource() == btnJToggleButton){
            new JToggleButtons();
        }                // JToggleButtons
        else if(e.getSource() == btnJCheckBoxs){
            new JCheckBoxs();
        }                   // JCheckBoxs
        else if(e.getSource() == btnJRadioButtons){
            new JRadioButtons();
        }                // JRadioButtons
        else if(e.getSource() == btnJComboBoxs){
            new JComboBoxs();
        }                   // JComboBoxs
        else if(e.getSource() == btnJTextFields){
            new JTextFields();
        }                  // JTextFields
        else if(e.getSource() == btnJPasswordFields){
            new JPasswordFields();
        }              // JPasswordFields
        else if(e.getSource() == btnJTextAreas){
            new JTextAreas();
        }                   // JTextAreas
        else if(e.getSource() == btnJSpinners){
            new JSpinners();
        }                    // JSpinners
        else if(e.getSource() == btnJSliders){
            new JSliders();
        }                     // JSliders
        else if(e.getSource() == btnJLists){
            new JLists();
        }                       // JLists
        else if(e.getSource() == btnJTables){
            new JTables();
        }                      // JTables
        else if(e.getSource() == btnJTrees){
            new JTrees();
        }                       // JTrees
        // Display Components ----------------------------------------------------------------------
        else if(e.getSource() == btnJLabels){
            new JLabels();
        }                      // JLabels
        else if(e.getSource() == btnJProgressBars){
            new JProgressBars();
        }                // JProgressBars
        else if(e.getSource() == btnJSeparators){
            new JSeparators();
        }                  // btnJSeparators
        else if(e.getSource() == btnJToolTips){
            new JToolTips();
        }                    // JLabels
        else if(e.getSource() == btnJEditorPanes){
            new JEditorPanes();
        }                 // JEditorPanes
        else if(e.getSource() == btnJTextPanes){
            new JTextPanes();
        }                   // JTextPanes
        // Menu Components -------------------------------------------------------------------------
        else if(e.getSource() == btnJMenuBars){
            new JMenuBars();
        }                    // JMenuBars
        else if(e.getSource() == btnJMenus){
            new JMenus();
        }                       // JMenus
        else if(e.getSource() == btnJMenuItems){
            new JMenuItems();
        }                   // JMenuItems
        else if(e.getSource() == btnJCheckBoxMenuItems){
            new JCheckBoxMenuItems();
        }           // JCheckBoxMenuItems
        else if(e.getSource() == btnJRadioButtonMenuItems){
            new JRadioButtonMenuItems();
        }        // JRadioButtonMenuItems
        // Utility Components ----------------------------------------------------------------------
        else if(e.getSource() == btnJFileChoosers){
            new JFileChoosers();
        }                // JFileChoosers
        else if(e.getSource() == btnJColorChooser){
            new JColorChoosers();
        }                // JColorChooser
        else if(e.getSource() == btnJavaTimers){
            SwingUtilities.invokeLater(() -> new JavaTimers());
        }                   // JavaTimers
        else if(e.getSource() == btnJavaInputVerifiers){
            new JavaInputVerifiers();
        }           // JavaInputVerifiers
        // Other Components (AWT Components) -------------------------------------------------------
        else if(e.getSource() == btnJavaCanvas){
            SwingUtilities.invokeLater(() -> new JavaCanvas());
        }                   // Java Canvas
    }
}