package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButtons extends JFrame implements ActionListener {

    JRadioButton maleButton, femaleButton, otherButton;
    ButtonGroup genderGroup;
    JButton submitButton;
    JLabel resultLabel;

    public JRadioButtons() {
        // Frame setup
        setTitle("JRadioButton Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create radio buttons
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        otherButton = new JRadioButton("Other");

        // Set Focusable
        maleButton.setFocusable(false);
        femaleButton.setFocusable(false);
        otherButton.setFocusable(false);
        
        // Group the radio buttons
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);

        // Add radio buttons to frame
        add(maleButton);
        add(femaleButton);
        add(otherButton);

        // Create and add submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        submitButton.setFocusable(false);
        add(submitButton);

        // Label to display the result
        resultLabel = new JLabel("Selected: ");
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = "Selected: ";
        if (maleButton.isSelected()) selected += "Male";
        else if (femaleButton.isSelected()) selected += "Female";
        else if (otherButton.isSelected()) selected += "Other";
        else selected += "None";

        resultLabel.setText(selected);
    }
}