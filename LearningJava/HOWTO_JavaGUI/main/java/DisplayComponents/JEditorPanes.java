package DisplayComponents;

// @author Paxton.Clark

import javax.swing.*;

public class JEditorPanes {
    
    public JEditorPanes(){
        JFrame frame = new JFrame("JEditorPane Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 300);

        // Create a JEditorPane and make it non-editable
        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);

        // Load HTML content using string concatenation
        String htmlContent = "<html>" +
                "<body>" +
                "<h1 style='color:darkblue;'>Welcome to JEditorPane</h1>" +
                "<p>This is an example of <b>HTML</b> content.</p>" +
                "<a href='https://www.example.com'>Visit Example.com</a>" +
                "</body>" +
                "</html>";

        editorPane.setContentType("text/html");
        editorPane.setText(htmlContent);

        // Optional: handle hyperlink clicks
        editorPane.addHyperlinkListener(e -> {
            if (e.getEventType() == javax.swing.event.HyperlinkEvent.EventType.ACTIVATED) {
                JOptionPane.showMessageDialog(frame, "Hyperlink clicked: " + e.getURL());
            }
        });

        // Add scroll pane
        JScrollPane scrollPane = new JScrollPane(editorPane);
        frame.add(scrollPane);

        frame.setVisible(true);
    }   
}