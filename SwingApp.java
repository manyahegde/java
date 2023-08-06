package SwingApp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class A extends JFrame implements ActionListener{
	JButton b1;
	JTextField tf1,tf2,tf3;
	JLabel l1,l2,l3;
	A(){
		setLayout(new FlowLayout());
		setSize(500,200);
		l1=new JLabel("Enter number 1");
		add(l1);
		tf1=new JTextField(10);
		add(tf1);
		l2=new JLabel("Enter number 2");
		add(l2);
		tf2=new JTextField(10);
		add(tf2);
		add(new JLabel("                    "));
		l3=new JLabel("Result");
		add(l3);
		tf3=new JTextField(10);
		add(tf3);
		b1=new JButton("Divide");
		add(b1);
		b1.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		try {
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			float c=(float)a/b;
			if(b==0) {
				throw new ArithmeticException("Divide by Zero error!");
			}
			tf3.setText(String.valueOf(c));
		}
		catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
		catch(ArithmeticException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}
}
public class SwingApp {
	public static void main(String[] args) {
		A a=new A();
	}
}
