// 20. Design a java program to write an applet that computes the payment of loan which is based on the amount of loan, interest rate and number of months. It takes one parameter from browser which is called Monthly Rate. If it is True then interest rate is per month else it is annual. (Use label, textfield, button, check box, checkbox group)

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code=Q20 width=150 height=150>
<param name=N1 value=5>
</applet>
*/
public class Q20 extends Applet implements ItemListener, ActionListener {
    String s1;
    int n1;
    TextField tf1,tf2;
    Button result;
    Checkbox cb1,cb2;
    CheckboxGroup cbg;
    double monthlyPayment;
    public void init() {
        Label f=new Label("ENTER AMOUNT OF LOAN", Label.RIGHT);
        Label s=new Label("ENTER INTEREST RATE", Label.RIGHT);
        tf1=new TextField(4);
        tf2=new TextField(4);
        add(f);
        add(tf1);
        add(s);
        add(tf2);
        cbg=new CheckboxGroup();
        cb1=new Checkbox("MONTHLY RATE",cbg,true);
        cb2=new Checkbox("YEARLY RATE",cbg,false);
        result=new Button("LOAN PAYMENT AMOUNT");
        add(cb1);
        add(cb2);
        add(result);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        result.addActionListener(this);
        s1=getParameter("N1");
        if(s1!=null) {
            n1=Integer.parseInt(s1);
        }
    }
    public void itemStateChanged(ItemEvent ie) { //WRITE PROGRAM HERE
        /*
        if (cb1.getState()) {
            tf2.setLabel("ENTER INTEREST RATE (PER MONTH)");
        } else {
            tf2.setLabel("ENTER INTEREST RATE (PER YEAR)");
        }
        */
    }
    public void actionPerformed(ActionEvent ae) { //WRITE PROGRAM HERE
        double loanAmount = Double.parseDouble(tf1.getText());
        double interestRate;
        if (cb1.getState()) {
            interestRate = Double.parseDouble(tf2.getText()) / 100; // Assuming percentage rate per month
        } else {
            interestRate = Double.parseDouble(tf2.getText()) / 100 / 12; // Assuming percentage rate per year, divided by 12 for monthly rate
        }
        int numberOfMonths = n1;

        // Calculate the loan payment amount
        double numerator = interestRate * Math.pow(1 + interestRate, numberOfMonths);
        double denominator = Math.pow(1 + interestRate, numberOfMonths) - 1;
        monthlyPayment = loanAmount * (numerator / denominator);

        // Display the loan payment amount
        repaint();
    }
    public void paint(Graphics g) { //WRITE PROGRAM HERE
        g.drawString("Loan Payment Amount:" + Double.toString(monthlyPayment), 100, 100);
    }
}
