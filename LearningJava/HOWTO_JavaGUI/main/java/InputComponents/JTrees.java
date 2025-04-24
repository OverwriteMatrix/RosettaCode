package InputComponents;

// @author Paxton.Clark

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class JTrees extends JFrame {

    public JTrees() {
        // Frame setup
        setTitle("JTree Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Fruits");

        // Create child nodes
        DefaultMutableTreeNode apple = new DefaultMutableTreeNode("Apple");
        DefaultMutableTreeNode banana = new DefaultMutableTreeNode("Banana");
        DefaultMutableTreeNode cherry = new DefaultMutableTreeNode("Cherry");

        // Add child nodes to root
        root.add(apple);
        root.add(banana);
        root.add(cherry);

        // Create the tree
        JTree tree = new JTree(root);

        // Add tree to a scroll pane for better viewing
        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane, BorderLayout.CENTER);

        // Set visible
        setVisible(true);
    }
}