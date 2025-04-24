package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JSliders extends JFrame implements ChangeListener {

    JSlider slider;
    JLabel valueLabel;

    public JSliders() {
        // Frame setup
        setTitle("JSlider Example");
        setSize(350, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a slider (0 to 100, starting at 50)
        slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);

        // Label to show the current slider value
        valueLabel = new JLabel("Value: 50");

        // Add to frame
        add(new JLabel("Adjust the slider:"));
        add(slider);
        add(valueLabel);

        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int value = slider.getValue();
        valueLabel.setText("Value: " + value);
    }
}