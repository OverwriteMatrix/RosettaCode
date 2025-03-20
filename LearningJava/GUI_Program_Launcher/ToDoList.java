/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaguipractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Paxton.Clark
 */
public class ToDoList {
    
    
    ToDoList(){
        // Create JFrame
        JFrame frame = new JFrame("To-Do List");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        // Panel for input and buttons
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setFocusable(false);

        // Text field for entering tasks
        JTextField taskField = new JTextField(20);

        // Add Button
        JButton addButton = new JButton("Add");
        addButton.setFocusable(false);

        // Remove Button
        JButton removeButton = new JButton("Remove");
        removeButton.setFocusable(false);

        // Clear All Button
        JButton clearButton = new JButton("Clear All");

        // To-Do List Model & JList
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Action to add task (used in both button and Enter key)
        ActionListener addTaskAction = e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText(""); // Clear input field after adding
            }
        };

        // Add Action Listener to Add Button
        addButton.addActionListener(addTaskAction);

        // Add Key Listener to TaskField to trigger Add Button when Enter is pressed
        taskField.addActionListener(addTaskAction);

        // Add Action Listener for "Remove" button
        removeButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            }
        });

        // Add Action Listener for "Clear All" button
        clearButton.addActionListener(e -> listModel.clear());

        // Add components to the panel
        panel.add(taskField);
        panel.add(addButton);
        panel.add(removeButton);
        panel.add(clearButton);

        // Add components to the frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set frame visibility
        frame.setVisible(true);
    }
}
