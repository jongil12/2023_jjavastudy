package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ex04_Calc extends JFrame {
	public Ex04_Calc() {
	super("계산기");
	JPanel np =new JPanel(new BorderLayout());
	JTextField jtf = new JTextField(40);
	np.add(jtf);
	add(np, BorderLayout.NORTH);
	
	JLabel jlb = new JLabel();
	JPanel jp = new JPanel (new GridLayout(5,3,10,10));	
	JButton jb1 = new JButton("1");
	JButton jb2 = new JButton("2");
	JButton jb3 = new JButton("3");
	JButton jb4 = new JButton("4");
	JButton jb5 = new JButton("5");
	JButton jb6 = new JButton("6");
	JButton jb7 = new JButton("7");
	JButton jb8 = new JButton("8");
	JButton jb9 = new JButton("9");
	JButton jb10 = new JButton("0");
	JButton jb11 = new JButton("+");
	JButton jb12 = new JButton("-");
	JButton jb13 = new JButton("*");
	JButton jb14 = new JButton("/");
	JButton jb15 = new JButton("=");

	jp.add(jb1);
	jp.add(jb2);
	jp.add(jb3);
	jp.add(jb4);
	jp.add(jb5);
	jp.add(jb6);
	jp.add(jb7);
	jp.add(jb8);
	jp.add(jb9);
	jp.add(jb10);
	jp.add(jb11);
	jp.add(jb12);
	jp.add(jb13);
	jp.add(jb14);
	jp.add(jb15);

	add(jp);
	Dimension ds= Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-150, ds.height/2-125, 300, 250);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
public static void main(String[] args) {
	new Ex04_Calc();
}
}
