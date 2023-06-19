import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code=tmp width=300 height=300></applet> */
public class tmp extends Applet implements ActionListener {
    String s, s1, s2, s3, s4;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button add, sub, eq, cl, mul, div, rem;
    TextField t1;
    int a, b, c;

    public void init() {
        t1 = new TextField(10); b1 = new Button("1"); b2 = new Button("2");
        b3 = new Button("3"); b4 = new Button("4"); b5 = new Button("5");
        b6 = new Button("6"); b7 = new Button("7"); b8 = new Button("8");
        b9 = new Button("9"); b0 = new Button("0"); add = new Button("+");
        sub = new Button("-"); mul = new Button("*"); div = new Button("/");
        eq = new Button("="); cl = new Button("Clear"); rem = new Button("%");

        GridLayout gb = new GridLayout(4, 5);
        setLayout(gb);

        add(t1); add(b1); add(b2);
        add(b3); add(b4); add(b5);
        add(b6); add(b7); add(b8);
        add(b9); add(b0); add(add);
        add(sub); add(mul); add(div);
        add(rem); add(eq); add(cl);

        b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this);
        b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this);
        b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this);
        b0.addActionListener(this); add.addActionListener(this); sub.addActionListener(this);
        mul.addActionListener(this); div.addActionListener(this); eq.addActionListener(this);
        cl.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            s3 = t1.getText();
            s4 = "0";
            s3 = s3 + s4;
            t1.setText(s3);
        } else if (e.getSource() == b1) {
            s3 = t1.getText();
            s4 = "1";
            s3 = s3 + s4;
            t1.setText(s3);
        } else if (e.getSource() == b2) {
            s3 = t1.getText();
            s4 = "2";
            s3 = s3 + s4;
            t1.setText(s3);
        } else if (e.getSource() == b3) {
            s3 = t1.getText();
            s4 = "3";
            s3 = s3 + s4;
            t1.setText(s3);
        } else if (e.getSource() == b4) {
            s3 = t1.getText();
            s4 = "4";
            s3 = s3 + s4;
            t1.setText(s3);
        } else if (e.getSource() == b5) {
            s3 = t1.getText();
            s4 = "5";
            s3 = s3 + s4;
            t1.setText(s3);
        } else if (e.getSource() == b6) {
            s3 = t1.getText();
            s4 = "6";
            s3 = s3 + s4;
            t1.setText(s3);
        } else if (e.getSource() == b7) {
            s3 = t1.getText();
            s4 = "7";
            s3 = s3 + s4;
            t1.setText(s3);
        } else if (e.getSource() == b8) {
            s3 = t1.getText();
            s4 = "8";
            s3 = s3 + s4;
            t1.setText(s3);
        } else if (e.getSource() == b9) {
            s3 = t1.getText();
            s4 = "9";
            s3 = s3 + s4;
            t1.setText(s3);
        } else if (e.getSource() == add) {
            s1 = t1.getText();
            t1.setText("");
            s = "+";
        } else if (e.getSource() == sub) {
            s1 = t1.getText();
            t1.setText("");
            s = "-";
        } else if (e.getSource() == mul) {
            s1 = t1.getText();
            t1.setText("");
            s = "*";
        } else if (e.getSource() == div) {
            s1 = t1.getText();
            t1.setText("");
            s = "/";
        } else if (e.getSource() == rem) {
            s1 = t1.getText();
            t1.setText("");
            s = "%";
        } else if (e.getSource() == eq) {
            s2 = t1.getText();
            if (s.equals("+")) {
                a = Integer.parseInt(s1);
                b = Integer.parseInt(s2);
                c = a + b;
                t1.setText(String.valueOf(c));
            } else if (s.equals("-")) {
                a = Integer.parseInt(s1);
                b = Integer.parseInt(s2);
                c = a - b;
                t1.setText(String.valueOf(c));
            } else if (s.equals("*")) {
                a = Integer.parseInt(s1);
                b = Integer.parseInt(s2);
                c = a * b;
                t1.setText(String.valueOf(c));
            } else if (s.equals("/")) {
                a = Integer.parseInt(s1);
                b = Integer.parseInt(s2);
                c = a / b;
                t1.setText(String.valueOf(c));
            } else if (s.equals("%")) {
                a = Integer.parseInt(s1);
                b = Integer.parseInt(s2);
                c = a % b;
                t1.setText(String.valueOf(c));
            }
        } else if (e.getSource() == cl) {
            t1.setText("");
        }
    }
}
