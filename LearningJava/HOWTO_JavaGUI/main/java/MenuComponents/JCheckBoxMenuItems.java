package MenuComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.event.ItemEvent;

public class JCheckBoxMenuItems {

    public JCheckBoxMenuItems() {
        JFrame frame = new JFrame("JCheckBoxMenuItem Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu viewMenu = new JMenu("View");

        // Create checkbox menu items
        JCheckBoxMenuItem showStatusBarItem = new JCheckBoxMenuItem("Show Status Bar");
        JCheckBoxMenuItem enableDarkModeItem = new JCheckBoxMenuItem("Enable Dark Mode");

        // Add item listeners
        showStatusBarItem.addItemListener((ItemEvent e) -> {
            if (showStatusBarItem.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Status bar is now visible");
            } else {
                JOptionPane.showMessageDialog(frame, "Status bar is now hidden");
            }
        });

        enableDarkModeItem.addItemListener((ItemEvent e) -> {
            if (enableDarkModeItem.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Dark Mode Enabled");
            } else {
                JOptionPane.showMessageDialog(frame, "Dark Mode Disabled");
            }
        });

        // Add checkbox items to menu
        viewMenu.add(showStatusBarItem);
        viewMenu.add(enableDarkModeItem);

        menuBar.add(viewMenu);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}