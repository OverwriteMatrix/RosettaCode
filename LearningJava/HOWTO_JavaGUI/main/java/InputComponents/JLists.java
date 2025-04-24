package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import java.awt.event.*;

public class JLists extends JFrame implements ActionListener {

    JList<String> itemList;
    JButton showButton;
    JLabel resultLabel;

    public JLists() {
        // Frame setup
        setTitle("JList Example");
        setSize(300, 150);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create list with items
        String[] items = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };
        itemList = new JList<>(items);
        itemList.setVisibleRowCount(4);
        itemList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Scroll pane for the list
        JScrollPane scrollPane = new JScrollPane(itemList);

        // Button to show selected items
        showButton = new JButton("Show Selection");
        showButton.addActionListener(this);
        showButton.setFocusable(false);

        // Label to display selected items
        resultLabel = new JLabel("Selected: ");

        // Add components to frame
        add(scrollPane);
        add(showButton);
        add(resultLabel);

        // Set Bounds
        showButton.setBounds(110, 5, 150, 30);
        resultLabel.setBounds(5, 55, 300, 30);
        scrollPane.setBounds(5, 5, 100, 50);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        java.util.List<String> selected = itemList.getSelectedValuesList();
        resultLabel.setText("Selected: " + String.join(", ", selected));
    }
}