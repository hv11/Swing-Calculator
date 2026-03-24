import javax.swing.*;
import java.util.ArrayList;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorFrontend
{
    private JPanel pane;
    private JFrame calculatorGraphics;
    
    public CalculatorFrontend()
    {
        calculatorGraphics = new JFrame("Calculator");

    }
    
    public JFrame getJFrame()
    {
        return this.calculatorGraphics;
    }
        
    public void title()
    {
        JLabel title = new JLabel("Calculator Demo",SwingConstants.CENTER);
        Font titleFont = new Font("Times New Roman",Font.BOLD,25);
        title.setFont(titleFont);
        title.setPreferredSize(new Dimension(300,50));
        Color brown = new Color(155,103,60);
        title.setForeground(brown);
        title.setOpaque(true);
        Color maroon = new Color(128,0,0);
        title.setBackground(maroon);
        title.setBorder(BorderFactory.createLineBorder(Color.black,5));
        calculatorGraphics.getContentPane().add(title, BorderLayout.PAGE_START);
    }
        
    public void calculatePart()
    {
        JPanel calculatePart = new JPanel(new BorderLayout());
        calculatePart.setPreferredSize(new Dimension(300,175));
        calculatePart.setBackground(Color.WHITE);
        calculatePart.setOpaque(true);
        calculatePart.setBorder(BorderFactory.createLineBorder(Color.black,5));
        calculatorGraphics.getContentPane().add(calculatePart, BorderLayout.CENTER);
    }
    
    public void buttonsPane()
    {
        pane = new JPanel(new GridLayout(5,4,5,5));
        pane.setPreferredSize(new Dimension(300,200));
        pane.setBackground(Color.black);
        pane.setOpaque(true);
        pane.setBorder(BorderFactory.createLineBorder(Color.black,5));
        calculatorGraphics.getContentPane().add(pane, BorderLayout.PAGE_END);
    }
        
    public JButton deleteButton()
    {
        JButton delete = new JButton("del");
        delete.setBackground(Color.gray);
        delete.setFocusPainted(false); //gets rid of the text box that shows when selected
        pane.add(delete);
        return delete;
    }
        
    public JButton allClearButton()
    {
        JButton allClear = new JButton("AC");
        allClear.setBackground(Color.gray);
        allClear.setFocusPainted(false);
        pane.add(allClear);
        return allClear;
    }
    
    public JButton percentButton()
    {
        JButton percent = new JButton("%");
        percent.setBackground(Color.gray);
        percent.setFocusPainted(false);
        pane.add(percent);
        return percent;
    }

    public JButton divideButton()
    {
        JButton divide = new JButton("/");
        divide.setBackground(Color.gray);
        divide.setFocusPainted(false);
        pane.add(divide);
        return divide;
    }
        
    public JButton sevenButton()
    {
        JButton seven = new JButton("7");
        seven.setBackground(Color.gray);
        seven.setFocusPainted(false);
        pane.add(seven);
        return seven;
    }
        
    public JButton eightButton()
    {
        JButton eight = new JButton("8");
        eight.setBackground(Color.gray);
        eight.setFocusPainted(false);
        pane.add(eight);
        return eight;
    }
        
    public JButton nineButton()
    {
        JButton nine = new JButton("9");
        nine.setBackground(Color.gray);
        nine.setFocusPainted(false);
        pane.add(nine);
        return nine;
    }
        
    public void multiplyButton()
    {
    multiply = new JButton("X");
    multiply.setBackground(Color.gray);
    multiply.setFocusPainted(false);
    //multiply.addActionListener(this);
    pane.add(multiply);
    }
        
    public void fourButton()
    {
    four = new JButton("4");
    four.setBackground(Color.gray);
    four.setFocusPainted(false);
    //four.addActionListener(this);
    pane.add(four);
    }
        
    public void fiveButton()
    {
    five = new JButton("5");
    five.setBackground(Color.gray);
    five.setFocusPainted(false);
    //five.addActionListener(this);
    pane.add(five);
    }
        
    public void sixButton()
    {
    six = new JButton("6");
    six.setBackground(Color.gray);
    six.setFocusPainted(false);
    //six.addActionListener(this);
    pane.add(six);
    }
    
    public void subtractButton()
    {
    subtract = new JButton("-");
    subtract.setBackground(Color.gray);
    subtract.setFocusPainted(false);
    //subtract.addActionListener(this);
    pane.add(subtract);
    }
        
    public void oneButton()
    {
    one = new JButton("1");
    one.setBackground(Color.gray);
    one.setFocusPainted(false);
    //one.addActionListener(this);
    pane.add(one);
    }
        
    public void twoButton()
    {
    two = new JButton("2");
    two.setBackground(Color.gray);
    two.setFocusPainted(false);
    //two.addActionListener(this);
    pane.add(two);
    }
        
    public void threeButton()
    {
    three = new JButton("3");
    three.setBackground(Color.gray);
    three.setFocusPainted(false);
    //three.addActionListener(this);
    pane.add(three);
    }
        
    public void addButton()
    {
    add = new JButton("+");
    add.setBackground(Color.gray);
    add.setFocusPainted(false);
    //add.addActionListener(this);
    pane.add(add);
    }
        
    public void changeNumberSignButton()
    {
    changeNumberSign = new JButton("+/-");
    changeNumberSign.setBackground(Color.gray);
    changeNumberSign.setFocusPainted(false);
    //changeNumberSign.addActionListener(this);
    pane.add(changeNumberSign);
    }
        
    public void zeroButton()
    {
    zero = new JButton("0");
    zero.setBackground(Color.gray);
    zero.setFocusPainted(false);
    //zero.addActionListener(this);
    pane.add(zero);
    }
        
    public void decimalButton()
    {
    decimal = new JButton(".");
    decimal.setBackground(Color.gray);
    decimal.setFocusPainted(false);
    //decimal.addActionListener(this);
    pane.add(decimal);
    }
        
    public void equalButton()
    {
    equalSign = new JButton("=");
    equalSign.setBackground(Color.gray);
    equalSign.setFocusPainted(false);
    //equalSign.addActionListener(this);
    pane.add(equalSign);
    }
}
