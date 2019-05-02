package calculator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.lang.Math.*;

public class Calculator {
	
    private JFrame frame;
    private JTextField txtDisplay;
    double firstnum;
    double secondnum;
    double result;
    String operations;
    String answer;
    
    public static void main(String[] args) {
    	Calculator window = new Calculator();
    	window.initialize();
    	window.frame.setVisible(true);
    }
    
    private void initialize() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 247, 360);
        frame.getContentPane().setLayout(null);
        
        txtDisplay = new JTextField();
        txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtDisplay.setBounds(10, 11, 218, 32);
        txtDisplay.setColumns(10);
        frame.add(txtDisplay);
                
        // Row 1
        JButton percent = new JButton("%");
        percent.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		double temp = Double.parseDouble(txtDisplay.getText());
        		temp = temp * .01;
        		txtDisplay.setText(String.valueOf(temp));
        	}
        });
        percent.setFont(new Font("Tahoma", Font.BOLD, 20));
        percent.setBounds(10, 54, 50, 50);
        frame.add(percent);
        
        JButton btnClear = new JButton("C");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               txtDisplay.setText(null);
            }
        });
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnClear.setBounds(66, 54, 50, 50);
        frame.add(btnClear);
        
        JButton btnBS = new JButton("\uF0E7");
        btnBS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String backspace=null;
               if(txtDisplay.getText().length() > 0) {
            	   StringBuilder strB = new StringBuilder(txtDisplay.getText());
            	   strB.deleteCharAt(txtDisplay.getText().length() - 1);
            	   backspace = strB.toString();
            	   txtDisplay.setText(backspace);
               }
            }
        });
        btnBS.setFont(new Font("Wingdings", Font.BOLD, 20));
        btnBS.setBounds(122, 54, 50, 50);
        frame.add(btnBS);
        
        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               firstnum = Double.parseDouble(txtDisplay.getText());
               txtDisplay.setText("");
               operations = "/";
            }
        });
        btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDivide.setBounds(178, 54, 50, 50);
        frame.add(btnDivide);
        
        // Row 2
        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               String EnterNumber = txtDisplay.getText() + btn7.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn7.setBounds(10, 110, 50, 50);
        frame.add(btn7);
        
        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String EnterNumber = txtDisplay.getText() + btn8.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn8.setBounds(66, 110, 50, 50);
        frame.add(btn8);
        
        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String EnterNumber = txtDisplay.getText() + btn9.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn9.setBounds(122, 110, 50, 50);
        frame.getContentPane().add(btn9);
        
        JButton btnMult = new JButton("*");
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               firstnum = Double.parseDouble(txtDisplay.getText());
               txtDisplay.setText("");
               operations = "*";
            }
        });
        btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMult.setBounds(178, 110, 50, 50);
        frame.add(btnMult);
        
        // Row 3
        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String EnterNumber = txtDisplay.getText() + btn4.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn4.setBounds(10, 166, 50, 50);
        frame.add(btn4);
        
        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String EnterNumber = txtDisplay.getText() + btn5.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn5.setBounds(66, 166, 50, 50);
        frame.add(btn5);
        
        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String EnterNumber = txtDisplay.getText() + btn6.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn6.setBounds(122, 166, 50, 50);
        frame.add(btn6);
        
        JButton btnSub = new JButton("-");
        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               firstnum = Double.parseDouble(txtDisplay.getText());
               txtDisplay.setText("");
               operations = "-";
            }
        });
        btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnSub.setBounds(178, 166, 50, 50);
        frame.add(btnSub);
        
        // Row 4
        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String EnterNumber = txtDisplay.getText() + btn1.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn1.setBounds(10, 222, 50, 50);
        frame.add(btn1);
        
        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String EnterNumber = txtDisplay.getText() + btn2.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn2.setBounds(66, 222, 50, 50);
        frame.add(btn2);
        
        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String EnterNumber = txtDisplay.getText() + btn3.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn3.setBounds(122, 222, 50, 50);
        frame.add(btn3);
        
        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               firstnum = Double.parseDouble(txtDisplay.getText());
               txtDisplay.setText("");
               operations = "+";
            }
        });
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPlus.setBounds(178, 222, 50, 50);
        frame.add(btnPlus);
        
        // Row 5
        JButton posNeg = new JButton("+/-");
        posNeg.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		double temp = Double.parseDouble(txtDisplay.getText());
        		temp = temp * -1;
        		txtDisplay.setText(String.valueOf(temp));
        	}
        });
        posNeg.setFont(new Font("Tahoma", Font.BOLD, 18));
        posNeg.setBounds(10, 278, 50, 50);
        frame.add(posNeg);
        
        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String EnterNumber = txtDisplay.getText() + btn0.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn0.setBounds(66, 278, 50, 50);
        frame.add(btn0);
        
        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String EnterNumber = txtDisplay.getText() + btnDot.getText();
               txtDisplay.setText(EnterNumber );
            }
        });
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDot.setBounds(122, 278, 50, 50);
        frame.add(btnDot);
        
        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String answer;
               secondnum = Double.parseDouble(txtDisplay.getText());
               if (operations == "+")
               {
                   result = firstnum + secondnum;
                   answer = String.format("%.2f",result);
                   txtDisplay.setText(answer);
               }
               else if (operations == "-")
               {
                   result = firstnum - secondnum;
                   answer = String.format("%.2f",result);
                   txtDisplay.setText(answer);
               }
               else if (operations == "*")
               {
                  result = firstnum * secondnum;
                   answer = String.format("%.2f",result);
                   txtDisplay.setText(answer); 
               }
               else if (operations == "/")
               {
                   result = firstnum / secondnum;
                   answer = String.format("%.2f",result);
                   txtDisplay.setText(answer);
               }
            }
        });
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnEqual.setBounds(178, 278, 50, 50);
        frame.add(btnEqual);
                
    }
}
