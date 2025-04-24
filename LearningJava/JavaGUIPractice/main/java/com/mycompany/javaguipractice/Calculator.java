package com.mycompany.javaguipractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.out;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//   @author Paxton.Clark

public class Calculator extends JFrame implements ActionListener{
    
    // Variable/Component Declerations
    JFrame mainFrame = new JFrame();
    JPanel mainPanel = new JPanel();
    JLabel mainText = new JLabel();
    
    JButton btn0 = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnplusminus = new JButton("+/-");
    JButton btnclear = new JButton("C");
    JButton btnmod = new JButton("%");
    JButton btndot = new JButton(".");
    JButton btneqls = new JButton("=");
    JButton btnadd = new JButton("+");
    JButton btnsub = new JButton("-");
    JButton btndiv = new JButton("/");
    JButton btnmul = new JButton("*");
    JButton calSwitch = new JButton("#");
    
    JButton[] buttons = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, 
                     btnplusminus, btnclear, btnmod, btndot, btneqls, btnadd, btnsub, 
                     btndiv, btnmul, calSwitch};

    Queue<Integer> numbers = new LinkedList<>();
    Queue<Integer> operands = new LinkedList<>();
    Queue<Integer> operations = new LinkedList<>();
    
    double finalNum;
    
    int calType = 0;
    
    public Calculator(){
        // mainFrame Configuration
        mainFrame.setTitle("Calculator");                                       // Titles the frame
        mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);                   // Disposes of the frame but does not terminate the program on close
        mainFrame.setSize(265, 400);                                            // Sets the inital size of the frame
        mainFrame.setLocationRelativeTo(null);                                  // Center the frame on the page
        mainFrame.setLayout(null);                                              // Sets the frame's layout/layout manager
        mainFrame.setResizable(false);                                          // Allows the frame to be resizeable or not
        mainFrame.setVisible(true);                                             // Sets the frame to be visible or not
        // mainPanel Configuration
        mainPanel.setSize(265, 400);                                            // Sets the inital Panel size
        mainPanel.setLayout(null);                                              // Sets the panel's layout/layout manager
        mainPanel.setBackground(Color.GRAY);                                    // Sets the panel's background color
        // mainText Label Configuration
        mainText.setSize(230, 35);                                              // Sets the inital size
        mainText.setLocation(10, 5);                                            // Sets the inital location
        mainText.setBackground(Color.LIGHT_GRAY);                               // Sets the background color
        mainText.setOpaque(true);                                               // Make label background (color) visible
        mainText.setText("");                                                   // Set initial text to display
        mainText.setFont(new Font("Arial", Font.PLAIN, 20));
        
        // Buttons SetFocusable, Action Listeners, Background Color, Foreground Color
        for (JButton btn : buttons) {
            btn.setSize(50, 50);
            btn.setFocusable(false);
            btn.addActionListener(this);
            btn.setBackground(new Color(210, 210, 210));
            btn.setForeground(new Color(0, 0, 0));
            btn.setFont(new Font("Arial", Font.PLAIN, 15));
        }
        
        btnplusminus.setFont(new Font("Arial", Font.PLAIN, 12));
        btndot.setFont(new Font("Arial", Font.PLAIN, 25));

        
        // Button Layout    (X ,  Y)                          (X ,  Y)                    (X ,  Y)                       (X ,  Y)
        btnclear.setLocation(10, 50); btnplusminus.setLocation(70, 50); btnmod.setLocation(130, 50);   btndiv.setLocation(190, 50);
            btn7.setLocation(10, 110);        btn8.setLocation(70, 110);  btn9.setLocation(130, 110);  btnmul.setLocation(190, 110);
            btn4.setLocation(10, 170);        btn5.setLocation(70, 170);  btn6.setLocation(130, 170);  btnsub.setLocation(190, 170);
            btn1.setLocation(10, 230);        btn2.setLocation(70, 230);  btn3.setLocation(130, 230);  btnadd.setLocation(190, 230);
       calSwitch.setLocation(10, 290);      btndot.setLocation(70, 290);  btn0.setLocation(130, 290); btneqls.setLocation(190, 290);

        
        // Adding Components to Frame
        mainPanel.add(mainText);
        for (JButton btn : buttons) {
            mainPanel.add(btn);
        }
        mainFrame.add(mainPanel);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calSwitch){
            if(calType == 0){
                out.println("CLICKED -> Scientific Calculator");
                mainFrame.setSize(500, 500);
                mainFrame.setTitle("Scientific Calculator");
                mainPanel.setSize(500, 500);
                mainText.setSize(465, 35);      
                calType = 1;
            }else if (calType == 1){
                out.println("CLICKED -> Calculator");
                mainFrame.setSize(265, 400);
                mainFrame.setTitle("Calculator");
                mainPanel.setSize(265, 400);
                mainText.setSize(230, 35);      
                calType = 0;
            }
        } 
        
        // Digits
        else if(e.getSource() == btn0){
            out.println("Button 0 Pressed");
            mainText.setText(mainText.getText() + "0");
            numbers.offer(0);
        } 
        else if(e.getSource() == btn1){
            out.println("Button 1 Pressed");
            mainText.setText(mainText.getText() + "1");
            numbers.offer(1);
        } 
        else if(e.getSource() == btn2){
            out.println("Button 2 Pressed");
            mainText.setText(mainText.getText() + "2");
            numbers.offer(2);
        } 
        else if(e.getSource() == btn3){
            out.println("Button 3 Pressed");
            mainText.setText(mainText.getText() + "3");
            numbers.offer(3);
        } 
        else if(e.getSource() == btn4){
            out.println("Button 4 Pressed");
            mainText.setText(mainText.getText() + "4");
            numbers.offer(4);
        }
        else if(e.getSource() == btn5){
            out.println("Button 5 Pressed");
            mainText.setText(mainText.getText() + "5");
            numbers.offer(5);
        }
        else if(e.getSource() == btn6){
            out.println("Button 6 Pressed");
            mainText.setText(mainText.getText() + "6");
            numbers.offer(6);
        }
        else if(e.getSource() == btn7){
            out.println("Button 7 Pressed");
            mainText.setText(mainText.getText() + "7");
            numbers.offer(7);
        }
        else if(e.getSource() == btn8){
            out.println("Button 8 Pressed");
            mainText.setText(mainText.getText() + "8");
            numbers.offer(8);
        }
        else if(e.getSource() == btn9){
            out.println("Button 9 Pressed");
            mainText.setText(mainText.getText() + "9");
            numbers.offer(9);
        }
        
        // Arithmetic Operators
        else if(e.getSource() == btnadd){
            mainText.setText(mainText.getText() + " + ");
            out.println("Add Button Pressed");
            operations.offer(1);
            operands.offer(queueToNumber(numbers));
        } 
        else if(e.getSource() == btnsub){
            mainText.setText(mainText.getText() + " - ");
            out.println("Subtract Button Pressed");
            operations.offer(2);
            operands.offer(queueToNumber(numbers));
        }
        else if(e.getSource() == btndiv){
            mainText.setText(mainText.getText() + " / ");
            out.println("Divide Button Pressed");
            operations.offer(3);
            operands.offer(queueToNumber(numbers));
        }
        else if(e.getSource() == btnmul){
            mainText.setText(mainText.getText() + " * ");
            out.println("Multiply Button Pressed");
            operations.offer(4);
            operands.offer(queueToNumber(numbers));
        }
        else if(e.getSource() == btnmod){
            mainText.setText(mainText.getText() + " % ");
            out.println("Modulus Button Pressed");
            operations.offer(5);
            operands.offer(queueToNumber(numbers));
        }
        
        
        else if(e.getSource() == btneqls){
   
            
            for(int numbers : operands){
                
                int result = 0;
                int temp1 = 0;
                int temp2 = operands.poll();
                int operation = operations.poll();
                
                if(operation == 1){
                    result = temp1 + temp2;
                }
                else if(operation == 2){
                    result = temp1 - temp2;
                }
                else if(operation == 3){
                    result = temp1 / temp2;
                }
                else if(operation == 4){
                    result = temp1 * temp2;
                }
                else if(operation == 5){
                    result = temp1 % temp2;
                }
                
                temp1 = result;
                result = 0;
                
                
            }
            
            mainText.setText(" = " + finalNum);
            

            
        }
        else if(e.getSource() == btnclear){
            System.out.println("Clear Button Pressed");

            mainText.setText("");

        }
        
        else if(e.getSource() == btnplusminus){
//            System.out.println("PlusMinus Button Pressed");
//            int convert = (oneNum.poll() * -1);
//            oneNum.offer(convert);
//            mainText.setText(Integer.toString(convert));  
        }
        
    }
    
    // THIS ALSO CLEARS EACH QUEUE
    public int queueToNumber(Queue<Integer> queue) {
        if (queue.isEmpty()) return 0;                                          // Handle empty queue
        boolean isNegative = queue.peek() < 0;                                  // Check if the first number is negative
        int num = 0;
        while (!queue.isEmpty()) {
            num = num * 10 + Math.abs(queue.poll());                            // Use absolute value to correctly form the number
        }
        return isNegative ? -num : num;                                         // Apply negative sign only once if needed
    }
}




//        calSwitch.addActionListener(new ActionListener() {
//            @Override                                           //   <---------- This is called an anonymous class
//            public void actionPerformed(ActionEvent e) {
//                out.println("Calculator Switched!");         
//            }
//        });