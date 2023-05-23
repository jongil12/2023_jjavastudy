package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex05_Calc extends JFrame {
	public Ex05_Calc() {
		super("성적계산");
		
		JPanel name =new JPanel();
		JLabel njl1 =new JLabel("이름 :");
		JTextField njtf1 = new JTextField(10);
		name.add(njl1);
		name.add(njtf1);
		add(name,BorderLayout.NORTH);
		//sum.add(name);
		
		JPanel np =new JPanel();
		JLabel jl1 =new JLabel("국어 :");
		JTextField jtf1 = new JTextField(10);
		JLabel jl2 =new JLabel("영어 :");
		JTextField jtf2 = new JTextField(10);
		JLabel jl3 =new JLabel("수학 :");
		JTextField jtf3 = new JTextField(10);
		JTextArea jtf4 = new JTextArea(38,43);
		
		
		np.add(jl1);
		np.add(jtf1);
		np.add(jl2);
		np.add(jtf2);
		np.add(jl3);
		np.add(jtf3);
		np.add(jtf4);
		add(np,BorderLayout.CENTER);
			
	
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds= Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
public static void main(String[] args) {
	new Ex05_Calc();
}
}
