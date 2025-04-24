package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.event.*;

public class JCheckBoxs extends JFrame implements ItemListener {

    JCheckBox javaCheckBox, pythonCheckBox, cppCheckBox;
    JLabel resultLabel;

    public JCheckBoxs() {
        // Frame settings
        setSize(200, 150);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create checkboxes
        javaCheckBox = new JCheckBox("Java");
        pythonCheckBox = new JCheckBox("Python");
        cppCheckBox = new JCheckBox("C++");

        // Set Focusable
        javaCheckBox.setFocusable(false);
        pythonCheckBox.setFocusable(false);
        cppCheckBox.setFocusable(false);
        
        // Add item listeners
        javaCheckBox.addItemListener(this);
        pythonCheckBox.addItemListener(this);
        cppCheckBox.addItemListener(this);

        // Set Bounds
        javaCheckBox.setBounds(5, 5, 100, 20);
        pythonCheckBox.setBounds(5, 25, 100, 20);
        cppCheckBox.setBounds(5, 45, 100, 20);
        
        
        // Add to frame
        add(javaCheckBox);
        add(pythonCheckBox);
        add(cppCheckBox);

        // Label to display results
        resultLabel = new JLabel("Selected: ");
        resultLabel.setBounds(5, 60, 300, 40);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String selected = "Selected: ";
        if (javaCheckBox.isSelected()) selected += "Java, ";
        if (pythonCheckBox.isSelected()) selected += "Python, ";
        if (cppCheckBox.isSelected()) selected += "C++ ";
        resultLabel.setText(selected);
    }
}

