package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex10_Blue extends JPanel {
	//패널을 상속받아야 패널을 사용할수 있다.\
	public Ex10_Blue() {
	setBackground(Color.blue);
	JButton jb1 = new JButton("+");
	JButton jb2 = new JButton("-");
	JButton jb3 = new JButton("*");
	JButton jb4 = new JButton("/");
	
	add(jb1);
	add(jb2);
	add(jb3);
	add(jb4);
		
	}
}
