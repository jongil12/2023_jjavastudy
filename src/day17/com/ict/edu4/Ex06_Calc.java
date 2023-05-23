package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex06_Calc extends JFrame {
	public Ex06_Calc() {
		super("카페주문");
		JPanel sum =new JPanel(); // 세개 합친거 1-위
		JPanel jp = new JPanel(); // 라디오버튼 2-센터
		JPanel str =new JPanel(); // 아메리카노 2-위
		JPanel np =new JPanel();  // 텍스트 필드2-아래
		
		JPanel ta = new JPanel(); // 텍스트 에어리어 1-센터
		
		JPanel sp = new JPanel(); // 버튼 1-아래
		
		
		JLabel njl =new JLabel("원하는음료선택하세요");
	
		str.add(njl);
		//add(str);
		
		JRadioButton jrb1 = new JRadioButton();
		jrb1.setText("아메리카노(3000)");
		jrb1.setSelected(true);

		JRadioButton jrb2 = new JRadioButton("카페모카(4000)");
		JRadioButton jrb3 = new JRadioButton("카페라떼(3500)");
		JRadioButton jrb4 = new JRadioButton("과일쥬스(3000)");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);


		jp.add(jrb1);
		jp.add(jrb2);
		jp.add(jrb3);
		jp.add(jrb4);
		
	
		JLabel jl1 =new JLabel("수량 :");
		JTextField jtf1 = new JTextField(10);
		JLabel jl2 =new JLabel("입금액 :");
		JTextField jtf2 = new JTextField(10);
		JTextArea jtf3 = new JTextArea(23,42);
		np.add(jl1);
		np.add(jtf1);
		np.add(jl2);
		np.add(jtf2);
		ta.add(jtf3);
		str.add(jp);
	
		sum.add(str);//위
		sum.add(jp);//센터
		sum.add(np);//아래
		sum.add(jtf3);
		add(sum,BorderLayout.NORTH);
	
	
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		add(sp,BorderLayout.SOUTH);
		


		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-225, 500, 450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Ex06_Calc();
	}

}
