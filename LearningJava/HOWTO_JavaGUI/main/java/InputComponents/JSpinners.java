package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinners extends JFrame implements ChangeListener {

    JSpinner numberSpinner;
    JLabel resultLabel;

    public JSpinners() {
        // Frame setup
        setTitle("JSpinner Example");
        setSize(300, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create spinner with numbers 0 to 100
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 1);
        numberSpinner = new JSpinner(model);
        numberSpinner.addChangeListener(this);

        // Create label to display selected value
        resultLabel = new JLabel("Selected: 0");

        // Add components to frame
        add(new JLabel("Pick a number:"));
        add(numberSpinner);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int value = (int) numberSpinner.getValue();
        resultLabel.setText("Selected: " + value);
    }
}