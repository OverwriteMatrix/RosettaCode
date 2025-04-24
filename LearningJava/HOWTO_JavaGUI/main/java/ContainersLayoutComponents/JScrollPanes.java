package ContainersLayoutComponents;

// @author Paxton.Clark

import javax.swing.*;

public class JScrollPanes {
    
    
    public JScrollPanes(){
        // Create a new frame
        JFrame frame = new JFrame("JScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a text area
        JTextArea textArea = new JTextArea(10, 30);

        // Use StringBuilder to add 100 lines of text
        StringBuilder sb = new StringBuilder("This is a JTextArea inside a JScrollPane.\n"
                + "Basically, all a JScrollPane does is add a scroll bar to a frame.\n\n");
        for (int i = 1; i <= 100; i++) {
            sb.append("Line ").append(i).append("\n");
        }

        // Set the text
        textArea.setText(sb.toString());

        // Wrap the text area in a scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Optional: control scroll bar policies
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}