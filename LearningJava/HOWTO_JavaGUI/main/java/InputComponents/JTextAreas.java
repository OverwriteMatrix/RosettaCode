package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextAreas extends JFrame implements ActionListener {

    JTextArea textArea;
    JButton submitButton;
    JLabel resultLabel;

    public JTextAreas() {
        // Frame setup
        setTitle("JTextArea Example");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a text area with scroll
        textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Button and label
        submitButton = new JButton("Submit");
        resultLabel = new JLabel("Words: 0");

        // Add action listener
        submitButton.addActionListener(this);
        submitButton.setFocusable(false);
        
        // Layout
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(submitButton);
        bottomPanel.add(resultLabel);

        add(new JLabel("Enter text below:"), BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String content = textArea.getText().trim();
        int wordCount = content.isEmpty() ? 0 : content.split("\\s+").length;
        resultLabel.setText("Words: " + wordCount);
    }
}