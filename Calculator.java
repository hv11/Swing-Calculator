import javax.swing.*;
import javax.swing.border.*;
//import javax.swing.border.Border;
import java.awt.*;

public class Calculator
{
    //private CalculatorGraphics graphics;
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createCalculator();
                calculate();
            }
        });
    }
    
    public static void calculate()
    {
        System.out.print(5);
    }
    
    public static void createCalculator()
    {
        
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
        
        //pane
        JPanel pane = new JPanel(new GridLayout(5,4,5,5));
        pane.setPreferredSize(new Dimension(300,200));
        pane.setBackground(Color.black);
        pane.setOpaque(true);
        pane.setBorder(BorderFactory.createLineBorder(Color.black,5));
        calculatorGraphics.getContentPane().add(pane, BorderLayout.PAGE_END);
        
        //Create buttons
        JButton delete = new JButton("del");
        delete.setBackground(Color.gray);
        delete.setFocusPainted(false); //gets rid of the text box that shows when selected
        pane.add(delete);
        
        
        JButton allClear = new JButton("AC");
        allClear.setBackground(Color.gray);
        allClear.setFocusPainted(false);
        pane.add(allClear);
        
        JButton percent = new JButton("%");
        percent.setBackground(Color.gray);
        percent.setFocusPainted(false);
        pane.add(percent);
        
        JButton divide = new JButton("/");
        divide.setBackground(Color.gray);
        divide.setFocusPainted(false);
        pane.add(divide);
        
        JButton seven = new JButton("7");
        seven.setBackground(Color.gray);
        seven.setFocusPainted(false);
        pane.add(seven);
        
        JButton eight = new JButton("8");
        eight.setBackground(Color.gray);
        eight.setFocusPainted(false);
        pane.add(eight);
        
        JButton nine = new JButton("9");
        nine.setBackground(Color.gray);
        nine.setFocusPainted(false);
        pane.add(nine);
        
        JButton multiply = new JButton("X");
        multiply.setBackground(Color.gray);
        multiply.setFocusPainted(false);
        pane.add(multiply);
        
        JButton four = new JButton("4");
        four.setBackground(Color.gray);
        four.setFocusPainted(false);
        pane.add(four);
        
        JButton five = new JButton("5");
        five.setBackground(Color.gray);
        five.setFocusPainted(false);
        pane.add(five);
        
        JButton six = new JButton("6");
        six.setBackground(Color.gray);
        six.setFocusPainted(false);
        pane.add(six);
        
        JButton subtract = new JButton("-");
        subtract.setBackground(Color.gray);
        pane.add(subtract);
        subtract.setFocusPainted(false);
        
        JButton one = new JButton("1");
        one.setBackground(Color.gray);
        one.setFocusPainted(false);
        pane.add(one);
        
        JButton two = new JButton("2");
        two.setBackground(Color.gray);
        two.setFocusPainted(false);
        pane.add(two);
        
        JButton three = new JButton("3");
        three.setBackground(Color.gray);
        three.setFocusPainted(false);
        pane.add(three);
        
        JButton add = new JButton("+");
        add.setBackground(Color.gray);
        add.setFocusPainted(false);
        pane.add(add);
    
        JButton changeNumberSign = new JButton("+/-");
        changeNumberSign.setBackground(Color.gray);
        changeNumberSign.setFocusPainted(false);
        pane.add(changeNumberSign);
        
        JButton zero = new JButton("0");
        zero.setBackground(Color.gray);
        zero.setFocusPainted(false);
        pane.add(zero);
        
        JButton decimal = new JButton(".");
        decimal.setBackground(Color.gray);
        decimal.setFocusPainted(false);
        pane.add(decimal);
        
        JButton equalSign = new JButton("=");
        equalSign.setBackground(Color.gray);
        equalSign.setFocusPainted(false);
        pane.add(equalSign);
        
        calculatorGraphics.pack();
        calculatorGraphics.setVisible(true);

    }
}