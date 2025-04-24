package ContainersLayoutComponents;

// @author Paxton.Clark

/*
There's a key difference between JInternalFrame and JDesktopPane—they work together, but they serve very different purposes:

JDesktopPane — The Desktop
    Think of it like the background or desktop workspace inside a JFrame.
    It’s a special container designed to hold multiple internal frames (JInternalFrame).
    You typically add it to your main application window (JFrame) using frame.setContentPane(desktopPane);.
    It handles z-ordering (which frame is on top), dragging, and window management of the internal frames.

JInternalFrame — The Internal Window
    This is like a mini window that lives inside a JDesktopPane.
    It can be moved, resized, minimized, maximized, and closed—just like a regular window, but it's contained inside the app.
    You don’t use JInternalFrame by itself—it must be added to a JDesktopPane.
*/

import javax.swing.*;
import java.awt.*;

public class JDesktopPanes {
    
    public JDesktopPanes(){
        // Create the main frame
        JFrame frame = new JFrame("JDesktopPane Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);

        // Create a JDesktopPane
        JDesktopPane desktopPane = new JDesktopPane();

        // Create first internal frame
        JInternalFrame internalFrame1 = new JInternalFrame("Internal Frame 1", true, true, false, false); // public JInternalFrame(String title, 
                                                                                                        // boolean resizable, boolean closable, 
                                                                                                        // boolean maximizable, boolean iconifiable) {}
        internalFrame1.setBounds(50, 50, 200, 150);
        internalFrame1.getContentPane().add(new JLabel("This is the first internal frame"), BorderLayout.CENTER);
        internalFrame1.setVisible(true);

        // Create second internal frame
        JInternalFrame internalFrame2 = new JInternalFrame("Internal Frame 2", true, true, true, true);
        internalFrame2.setBounds(150, 100, 250, 150);
        JButton btnIF2 = new JButton();
        btnIF2.setText("Click Me");
        btnIF2.setFocusable(false);
        internalFrame2.getContentPane().add(btnIF2, BorderLayout.CENTER);
        internalFrame2.setVisible(true);

        // Add internal frames to desktop pane
        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        // Add desktop pane to the main frame
        frame.setContentPane(desktopPane);

        // Display the frame
        frame.setVisible(true);
    }
}
