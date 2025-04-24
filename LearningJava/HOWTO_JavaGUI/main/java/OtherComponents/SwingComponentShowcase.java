package com.mycompany.howto_javagui;

import javax.swing.*;
import java.awt.*;

// @author ChatGPT

public class SwingComponentShowcase {
    public SwingComponentShowcase(){
        // Create frame
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);

        // Create main panel with BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add components
        panel.add(new JLabel("🔤 JLabel: Hello, world!"));

        panel.add(new JButton("🖱 JButton: Click Me"));

        panel.add(new JTextField("🔠 JTextField: Type here...", 20));

        panel.add(new JPasswordField("🔒 Password"));

        panel.add(new JTextArea("📝 JTextArea: Multi-line text\nLine 2", 4, 20));

        panel.add(new JCheckBox("✅ JCheckBox: Agree to terms"));

        panel.add(new JRadioButton("🔘 JRadioButton: Option 1"));
        panel.add(new JRadioButton("🔘 JRadioButton: Option 2"));

        String[] options = {"Java", "Python", "C++", "Go"};
        panel.add(new JComboBox<>(options));

        panel.add(new JSpinner(new SpinnerNumberModel(5, 0, 10, 1)));

        panel.add(new JSlider(0, 100, 50));

        panel.add(new JProgressBar(0, 100));

        panel.add(new JList<>(options));

        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacer
        panel.add(new JSeparator());

        // Menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        file.add(new JMenuItem("New"));
        file.add(new JMenuItem("Exit"));
        menuBar.add(file);
        frame.setJMenuBar(menuBar);

        // Scrollable pane in case window is too small
        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane);

        // Show frame
        frame.setVisible(true);
    }
}

