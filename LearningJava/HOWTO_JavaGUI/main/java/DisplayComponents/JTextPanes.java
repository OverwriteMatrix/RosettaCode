package DisplayComponents;

// @author Paxton.Clark

import javax.swing.*;
import javax.swing.text.*;

public class JTextPanes {
    
    public JTextPanes(){
        JFrame frame = new JFrame("JTextPane Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 300);

        // Create a JTextPane
        JTextPane textPane = new JTextPane();
        
        // Set text content
        String text = "Welcome to JTextPane! You can add <b>bold</b> and <i>italic</i> styles here.";

        // Create a StyledDocument (allows for styled text)
        StyledDocument doc = textPane.getStyledDocument();

        // Define styles for bold and italic
        SimpleAttributeSet bold = new SimpleAttributeSet();
        StyleConstants.setBold(bold, true);
        SimpleAttributeSet italic = new SimpleAttributeSet();
        StyleConstants.setItalic(italic, true);

        try {
            // Insert text with bold and italic styles
            doc.insertString(doc.getLength(), "Welcome to JTextPane! ", null);
            doc.insertString(doc.getLength(), "You can add ", italic);
            doc.insertString(doc.getLength(), "bold", bold);
            doc.insertString(doc.getLength(), " and ", null);
            doc.insertString(doc.getLength(), "italic", italic);
            doc.insertString(doc.getLength(), " styles here.", null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        // Make the text pane non-editable
        textPane.setEditable(false);

        // Add the JTextPane inside a JScrollPane
        JScrollPane scrollPane = new JScrollPane(textPane);
        frame.add(scrollPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
