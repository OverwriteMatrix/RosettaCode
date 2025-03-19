/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.titlesorterapp;

/**
 *
 * @author Paxton.Clark
 */
import javax.swing.*;
import java.awt.*;

public class TitleSorterApp {
    private JFrame frame;
    private JTextField titleField;
    private JTextField tagField;
    private final JTextArea displayArea;
    private TitleManager manager;

    public TitleSorterApp() {
        manager = new TitleManager("titles.txt");

        frame = new JFrame("Title Sorter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 500);
        frame.setLayout(new BorderLayout());

        // Input fields
        titleField = new JTextField(20);
        tagField = new JTextField(20);

        // Buttons
        JButton addButton = new JButton("Add Title & Tags");
        addButton.setFocusable(false);
        addButton.addActionListener(e -> {
            String title = titleField.getText();
            String tags = tagField.getText();
            if (!title.isEmpty() && !tags.isEmpty()) {
                manager.addTitle(title);
                manager.addTagsToTitle(title, tags);
                titleField.setText("");
                tagField.setText("");
                updateDisplay();
            }
        });

        JButton sortByNameButton = new JButton("Sort by Title");
        sortByNameButton.setFocusable(false);
        sortByNameButton.addActionListener(e -> updateDisplayBySortingName());

        JButton sortByTagButton = new JButton("Sort by Tag");
        sortByTagButton.setFocusable(false);
        sortByTagButton.addActionListener(e -> {
            String tag = JOptionPane.showInputDialog(frame, "Enter tag to sort by:");
            if (tag != null) {
                updateDisplayBySortingTag(tag);
            }
        });

        JButton deleteTagButton = new JButton("Delete Tag");
        deleteTagButton.setFocusable(false);
        deleteTagButton.addActionListener(e -> {
            String title = JOptionPane.showInputDialog(frame, "Enter title:");
            String tag = JOptionPane.showInputDialog(frame, "Enter tag to remove:");
            if (title != null && tag != null) {
                manager.removeTagFromTitle(title, tag);
                updateDisplay();
            }
        });

        JButton deleteTitleButton = new JButton("Delete Title"); // NEW
        deleteTitleButton.setFocusable(false);
        deleteTitleButton.addActionListener(e -> {
            String title = JOptionPane.showInputDialog(frame, "Enter title to delete:");
            if (title != null) {
                manager.deleteTitle(title);
                updateDisplay();
            }
        });

        // Display area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Panel Layout
        JPanel panel = new JPanel();
        panel.add(new JLabel("Title:"));
        panel.add(titleField);
        panel.add(new JLabel("Tags (comma-separated):"));
        panel.add(tagField);
        panel.add(addButton);
        panel.add(sortByNameButton);
        panel.add(sortByTagButton);
        panel.add(deleteTagButton);
        panel.add(deleteTitleButton); // Added button

        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
        updateDisplay();
    }

    private void updateDisplay() {
        StringBuilder sb = new StringBuilder();
        for (Title title : manager.getTitlesSortedByName()) {
            sb.append(title).append("\n");
        }
        displayArea.setText(sb.toString());
    }

    private void updateDisplayBySortingName() {
        StringBuilder sb = new StringBuilder();
        for (Title title : manager.getTitlesSortedByName()) {
            sb.append(title).append("\n");
        }
        displayArea.setText(sb.toString());
    }

    private void updateDisplayBySortingTag(String tag) {
        StringBuilder sb = new StringBuilder();
        for (Title title : manager.getTitlesSortedByTag(tag)) {
            sb.append(title).append("\n");
        }
        displayArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TitleSorterApp::new);
    }
}
