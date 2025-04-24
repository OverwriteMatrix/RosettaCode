package com.mycompany.howto_javagui;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Listeners extends JFrame implements
        ActionListener,
        KeyListener,
        MouseListener,
        MouseMotionListener,
        MouseWheelListener,
        ComponentListener,
        ContainerListener,
        FocusListener,
        HierarchyListener,
        HierarchyBoundsListener,
        WindowListener,
        WindowFocusListener,
        WindowStateListener,
        ItemListener,
        ChangeListener,
        AdjustmentListener,
        InputMethodListener {

    public Listeners() {
        setTitle("All Listeners");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    // ===== ActionListener ====================================================
    @Override
    public void actionPerformed(ActionEvent e) {}

    // ===== KeyListener =======================================================
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}

    // ===== MouseListener =====================================================
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    // ===== MouseMotionListener ===============================================
    @Override
    public void mouseDragged(MouseEvent e) {}
    @Override
    public void mouseMoved(MouseEvent e) {}

    // ===== MouseWheelListener ================================================
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {}

    // ===== ComponentListener =================================================
    @Override
    public void componentResized(ComponentEvent e) {}
    @Override
    public void componentMoved(ComponentEvent e) {}
    @Override
    public void componentShown(ComponentEvent e) {}
    @Override
    public void componentHidden(ComponentEvent e) {}

    // ===== ContainerListener =================================================
    @Override
    public void componentAdded(ContainerEvent e) {}
    @Override
    public void componentRemoved(ContainerEvent e) {}

    // ===== FocusListener =====================================================
    @Override
    public void focusGained(FocusEvent e) {}
    @Override
    public void focusLost(FocusEvent e) {}

    // ===== HierarchyListener =================================================
    @Override
    public void hierarchyChanged(HierarchyEvent e) {}

    // ===== HierarchyBoundsListener ===========================================
    @Override
    public void ancestorMoved(HierarchyEvent e) {}
    @Override
    public void ancestorResized(HierarchyEvent e) {}

    // ===== WindowListener ====================================================
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosing(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}

    // ===== WindowFocusListener ===============================================
    @Override
    public void windowGainedFocus(WindowEvent e) {}
    @Override
    public void windowLostFocus(WindowEvent e) {}

    // ===== WindowStateListener ===============================================
    @Override
    public void windowStateChanged(WindowEvent e) {}

    // ===== ItemListener ======================================================
    @Override
    public void itemStateChanged(ItemEvent e) {}

    // ===== ChangeListener ====================================================
    @Override
    public void stateChanged(ChangeEvent e) {}

    // ===== AdjustmentListener ================================================
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {}

    // ===== InputMethodListener ===============================================
    @Override
    public void inputMethodTextChanged(InputMethodEvent e) {}
    @Override
    public void caretPositionChanged(InputMethodEvent e) {}
}
