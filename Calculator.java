import javax.swing.*;
import java.util.ArrayList;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener
{
    private ArrayList<String> clickedButtons;
    private JButton delete, allClear, percent, divide, seven, eight, 
        nine, multiply, four, five, six, subtract, one, two, three, add, changeNumberSign, zero, decimal, equalSign;
    private CalculatorBackend calculatorBackend;
    private CalculatorFrontend calculatorFrontend;
    
    public Calculator()
    {
        clickedButtons = new ArrayList<String>();
        calculatorBackend = new CalculatorBackend();
        calculatorFrontend = new CalculatorFrontend();
    }
    
    public ArrayList<String> getClickedButtons()
    {
        return clickedButtons;
    }

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
    
    public void createCalculator()
    {
        JFrame calculatorGraphics = calculatorFrontend.getJFrame();
        calculatorFrontend.title();
        calculatorFrontend.calculatePart();
        calculatorFrontend.buttonsPane();
        
        //create buttons & add actionlistener to them
        delete = calculatorFrontend.deleteButton();
        delete.addActionListener(this);
        allClear = calculatorFrontend.allClearButton();
        allClear.addActionListener(this);
        percent = calculatorFrontend.percentButton();
        percent.addActionListener(this);
        divide = calculatorFrontend.divideButton();
        divide.addActionListener(this);
        seven = calculatorFrontend.sevenButton();
        seven.addActionListener(this);
        eight = calculatorFrontend.eightButton();
        eight.addActionListener(this);
        nine = calculatorFrontend.nineButton();
        nine.addActionListener(this);
        
        calculatorGraphics.pack();
        calculatorGraphics.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==delete)
        {
            System.out.print(5);
        }
    }
    

}
