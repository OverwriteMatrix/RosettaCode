package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.event.*;

public class JComboBoxs extends JFrame implements ActionListener {

    JComboBox<String> languageComboBox;
    JLabel resultLabel;

    public JComboBoxs() {
        // Frame setup
        setTitle("JComboBox Example");
        setSize(300, 150);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create combo box with items
        String[] languages = { "Java", "Python", "C++", "JavaScript" };
        languageComboBox = new JComboBox<>(languages);
        languageComboBox.addActionListener(this);
        
        // Add combo box to frame
        add(languageComboBox);

        // Label to show selected item
        resultLabel = new JLabel("Selected: Java");
        add(resultLabel);

        // Set Bounds
        languageComboBox.setBounds(5, 5, 100, 30);
        resultLabel.setBounds(115, 40, 200, 50);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = (String) languageComboBox.getSelectedItem();
        resultLabel.setText("Selected: " + selected);
    }
}