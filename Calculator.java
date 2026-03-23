import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener
{
    private String thus;
    private JButton delete, allClear, percent, divide, seven, eight, 
        nine, multiply, four, five, six, subtract, one, two, three, add, changeNumberSign, zero, decimal, equalSign;
    
    private CalculatorBackEnd calculatorBackEnd;
        
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                calculator.createCalculator();
            }
        });
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == delete)
        {
            System.out.print("delete");
        }
    }
    
    public void createCalculator()
    {
        calculatorBackEnd = new CalculatorBackEnd();
        System.out.print("run");
        JFrame calculatorGraphics = new JFrame("Calculator");
        
        //Title
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
        
        //Calculate section
        JPanel calculatePart = new JPanel(new BorderLayout());
        calculatePart.setPreferredSize(new Dimension(300,175));
        calculatePart.setBackground(Color.WHITE);
        calculatePart.setOpaque(true);
        calculatePart.setBorder(BorderFactory.createLineBorder(Color.black,5));
        calculatorGraphics.getContentPane().add(calculatePart, BorderLayout.CENTER);
        
        //Buttons Pane
        JPanel pane = new JPanel(new GridLayout(5,4,5,5));
        pane.setPreferredSize(new Dimension(300,200));
        pane.setBackground(Color.black);
        pane.setOpaque(true);
        pane.setBorder(BorderFactory.createLineBorder(Color.black,5));
        calculatorGraphics.getContentPane().add(pane, BorderLayout.PAGE_END);
        
        //Create buttons
        delete = new JButton("del");
        delete.setBackground(Color.gray);
        delete.setFocusPainted(false); //gets rid of the text box that shows when selected
        delete.addActionListener(this);
        pane.add(delete);
        
        allClear = new JButton("AC");
        allClear.setBackground(Color.gray);
        allClear.setFocusPainted(false);
        allClear.addActionListener(this);
        pane.add(allClear);
        
        percent = new JButton("%");
        percent.setBackground(Color.gray);
        percent.setFocusPainted(false);
        percent.addActionListener(this);
        pane.add(percent);
        
        divide = new JButton("/");
        divide.setBackground(Color.gray);
        divide.setFocusPainted(false);
        divide.addActionListener(this);
        pane.add(divide);
        
        seven = new JButton("7");
        seven.setBackground(Color.gray);
        seven.setFocusPainted(false);
        seven.addActionListener(this);
        pane.add(seven);
        
        eight = new JButton("8");
        eight.setBackground(Color.gray);
        eight.setFocusPainted(false);
        eight.addActionListener(this);
        pane.add(eight);
        
        nine = new JButton("9");
        nine.setBackground(Color.gray);
        nine.setFocusPainted(false);
        nine.addActionListener(this);
        pane.add(nine);
        
        multiply = new JButton("X");
        multiply.setBackground(Color.gray);
        multiply.setFocusPainted(false);
        multiply.addActionListener(this);
        pane.add(multiply);
        
        four = new JButton("4");
        four.setBackground(Color.gray);
        four.setFocusPainted(false);
        four.addActionListener(this);
        pane.add(four);
        
        five = new JButton("5");
        five.setBackground(Color.gray);
        five.setFocusPainted(false);
        five.addActionListener(this);
        pane.add(five);
        
        six = new JButton("6");
        six.setBackground(Color.gray);
        six.setFocusPainted(false);
        six.addActionListener(this);
        pane.add(six);
        
        subtract = new JButton("-");
        subtract.setBackground(Color.gray);
        subtract.setFocusPainted(false);
        subtract.addActionListener(this);
        pane.add(subtract);
        
        one = new JButton("1");
        one.setBackground(Color.gray);
        one.setFocusPainted(false);
        one.addActionListener(this);
        pane.add(one);
        
        two = new JButton("2");
        two.setBackground(Color.gray);
        two.setFocusPainted(false);
        two.addActionListener(this);
        pane.add(two);
        
        three = new JButton("3");
        three.setBackground(Color.gray);
        three.setFocusPainted(false);
        three.addActionListener(this);
        pane.add(three);
        
        add = new JButton("+");
        add.setBackground(Color.gray);
        add.setFocusPainted(false);
        add.addActionListener(this);
        pane.add(add);
    
        changeNumberSign = new JButton("+/-");
        changeNumberSign.setBackground(Color.gray);
        changeNumberSign.setFocusPainted(false);
        changeNumberSign.addActionListener(this);
        pane.add(changeNumberSign);
        
        zero = new JButton("0");
        zero.setBackground(Color.gray);
        zero.setFocusPainted(false);
        zero.addActionListener(this);
        pane.add(zero);
        
        decimal = new JButton(".");
        decimal.setBackground(Color.gray);
        decimal.setFocusPainted(false);
        decimal.addActionListener(this);
        pane.add(decimal);
        
        equalSign = new JButton("=");
        equalSign.setBackground(Color.gray);
        equalSign.setFocusPainted(false);
        equalSign.addActionListener(this);
        pane.add(equalSign);
        
        calculatorGraphics.pack();
        calculatorGraphics.setVisible(true);

    }
}
