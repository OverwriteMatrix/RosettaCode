package ContainersLayoutComponents;

//@author Paxton.Clark

import javax.swing.*;

public class JSplitPanes {
    public JSplitPanes() {
        // Create a new JFrame
        JFrame frame = new JFrame("JSplitPane Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 350);

        // Create components to add to the split pane
        JTextArea textArea = new JTextArea("Left Side (Text Area)");
        JButton button = new JButton("Right Side (Button)");
        
        button.setFocusable(false);

        // Wrap text area in a scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create a JSplitPane with horizontal split
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, button);
        splitPane.setDividerLocation(200); // Initial position of the divider

        // Optional: allow the divider to be resized with a one-touch expandable UI
        splitPane.setOneTouchExpandable(true);

        // Add the split pane to the frame
        frame.getContentPane().add(splitPane);

        // Show the frame
        frame.setVisible(true);
    }
}

