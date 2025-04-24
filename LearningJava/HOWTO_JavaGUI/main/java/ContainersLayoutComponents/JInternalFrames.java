package ContainersLayoutComponents;

// @author Paxton.Clark

/*
There's a key difference between JInternalFrame and JDesktopPane—they work together, but they serve very different purposes:

JInternalFrame — The Internal Window
    This is like a mini window that lives inside a JDesktopPane.
    It can be moved, resized, minimized, maximized, and closed—just like a regular window, but it's contained inside the app.
    You don’t use JInternalFrame by itself—it must be added to a JDesktopPane.

JDesktopPane — The Desktop
    Think of it like the background or desktop workspace inside a JFrame.
    It’s a special container designed to hold multiple internal frames (JInternalFrame).
    You typically add it to your main application window (JFrame) using frame.setContentPane(desktopPane);.
    It handles z-ordering (which frame is on top), dragging, and window management of the internal frames.
*/

import javax.swing.*;
import java.awt.*;

public class JInternalFrames {
    
    public JInternalFrames(){
        // Main application frame
        JFrame frame = new JFrame("JInternalFrame Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);

        // Create a desktop pane to hold internal frames
        JDesktopPane desktopPane = new JDesktopPane();

        // Create multiple internal frames
        JInternalFrame internalFrame1 = createInternalFrame("Window 1", 50, 50, Color.LIGHT_GRAY);
        JInternalFrame internalFrame2 = createInternalFrame("Window 2", 150, 100, Color.PINK);
        JInternalFrame internalFrame3 = createInternalFrame("Window 3", 250, 150, Color.CYAN);

        // Add internal frames to desktop pane
        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);
        desktopPane.add(internalFrame3);

        // Set desktop pane in the frame
        frame.setContentPane(desktopPane);
        frame.setVisible(true);
    }

    // Helper method to create internal frames
    private static JInternalFrame createInternalFrame(String title, int x, int y, Color bgColor) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setBounds(x, y, 200, 150);
        
        JPanel panel = new JPanel();
        panel.setBackground(bgColor);
        panel.add(new JLabel("This is " + title));
        
        internalFrame.setContentPane(panel);
        internalFrame.setVisible(true);
        
        return internalFrame;
    }
}