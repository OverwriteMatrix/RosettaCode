package MenuComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JRadioButtonMenuItems {

    public JRadioButtonMenuItems() {
        JFrame frame = new JFrame("JRadioButtonMenuItem Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu themeMenu = new JMenu("Theme");

        // Create radio button menu items
        JRadioButtonMenuItem lightModeItem = new JRadioButtonMenuItem("Light Mode");
        JRadioButtonMenuItem darkModeItem = new JRadioButtonMenuItem("Dark Mode");

        // Group the radio buttons so only one can be selected
        ButtonGroup themeGroup = new ButtonGroup();
        themeGroup.add(lightModeItem);
        themeGroup.add(darkModeItem);

        // Set default selection
        lightModeItem.setSelected(true);

        // Add action listeners
        lightModeItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Light Mode selected");
        });

        darkModeItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Dark Mode selected");
        });

        // Add radio items to menu
        themeMenu.add(lightModeItem);
        themeMenu.add(darkModeItem);

        menuBar.add(themeMenu);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}