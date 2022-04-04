package Additional_Qns.swingahne;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class abc extends JFrame

{
    JTextField t1;
    JTextField t2;
    JLabel l;
    JButton b;

    public abc() {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("add");

        l = new JLabel("Result");
        setLayout(new FlowLayout());
        add(t1);
        add(t2);
        add(l);
        add(b);
        

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int value = num1 + num2;
                l.setText(value + "");
            }
        });

        setVisible(true);
        setSize(400, 400);

    }

}

class swingproject {
    public static void main(String[] args) {
        new abc();

    }

}