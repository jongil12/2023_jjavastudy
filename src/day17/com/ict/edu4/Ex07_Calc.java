package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex07_Calc extends JFrame {
	public Ex07_Calc() {
	super("회원가입");
	String[] items = {"부서","영업팀","관리팀","업무팀","노는팀" };
	
	JPanel jp1 =new JPanel();	// 이름 성별
	JLabel jl1 =new JLabel("이 름 :");
	JTextField jtf1 = new JTextField(10);
	jp1.add(jl1);
	jp1.add(jtf1);
	ButtonGroup bg = new ButtonGroup();
	
	
	JRadioButton jrb1 = new JRadioButton("남");
	JRadioButton jrb2 = new JRadioButton("여");
	bg.add(jrb1);
	bg.add(jrb2);
	
	jp1.add(jrb1);
	jp1.add(jrb2);
	
	
	JPanel jp2 =new JPanel();	// 생년월일
	JLabel jl2 =new JLabel("생년월일 :");
	JTextField jtf2 = new JTextField(10);
	jp2.add(jl2);
	jp2.add(jtf2);
	
	
	JPanel jp3 =new JPanel();	// 주소
	JLabel jl3 =new JLabel("주소 :");
	JTextField jtf3 = new JTextField(15);
	jp3.add(jl3);
	jp3.add(jtf3);
	
	JPanel jpsum1 =new JPanel();
	jpsum1.setLayout(new FlowLayout(FlowLayout.LEFT));
	jpsum1.setLayout(new BorderLayout());
	jpsum1.add(jp1,BorderLayout.NORTH);
	jpsum1.add(jp2,BorderLayout.CENTER);
	jpsum1.add(jp3,BorderLayout.SOUTH);
	
	
	JPanel jp4 =new JPanel();	// 부서명
	JLabel jl4 =new JLabel("부서명 :");
	JComboBox<String> jcom = new JComboBox<>(items);
	jp4.add(jl4);
	jp4.add(jcom);
	
	JPanel jp5 =new JPanel();	// 취미
	JCheckBox jcb1 = new JCheckBox("운동");
	JCheckBox jcb2 = new JCheckBox("영화");
	JCheckBox jcb3 = new JCheckBox("독서");
	JCheckBox jcb4 = new JCheckBox("컴퓨터");
	
	jp5.add(jcb1);
	jp5.add(jcb2);
	jp5.add(jcb3);
	jp5.add(jcb4);
	
	
	JPanel jp6 =new JPanel();	// 자기소개
	JLabel jl5 =new JLabel("자 기 소 개");
	jp6.add(jl5);
	
	JPanel jpsum2 =new JPanel();
	jpsum2.setLayout(new FlowLayout(FlowLayout.LEFT));
	jpsum2.setLayout(new BorderLayout());
	jpsum2.add(jp4,BorderLayout.NORTH);
	jpsum2.add(jp5,BorderLayout.CENTER);
	jpsum2.add(jp6,BorderLayout.SOUTH);
	
	
	JPanel jp7 =new JPanel();	// 텍스트에어리어
	JTextArea jta = new JTextArea(13,33);
	jp7.add(jta);
	
	JPanel jp8 =new JPanel();	// 버튼
	JButton jb1 =new JButton("저장");
	JButton jb2 =new JButton("종료");
	JButton jb3 =new JButton("취소");
	jp8.add(jb1);
	jp8.add(jb2);
	jp8.add(jb3);
	
	
	JPanel jpsum3 =new JPanel();
	jpsum3.setLayout(new FlowLayout(FlowLayout.LEFT));
	jpsum3.setLayout(new BorderLayout());
	jpsum2.add(jp7,BorderLayout.NORTH);
	jpsum2.add(jp8,BorderLayout.SOUTH);
	JPanel jpsum =new JPanel();	// 합치기
	
	
	jpsum.add(jpsum1, BorderLayout.NORTH);
	jpsum.add(jpsum2, BorderLayout.CENTER);
	jpsum.add(jpsum3, BorderLayout.SOUTH);
	
	
	jpsum.setLayout(new FlowLayout(FlowLayout.LEFT));

	add(jpsum) ;
	
	
	
	
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-200, ds.height/2-250, 400, 500);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	
	}
	public static void main(String[] args) {
		new Ex07_Calc();
		
	}

}
