package day19.com.ict.edu2;
//package day19.com.ict.edu2;
//
//import java.awt.BorderLayout;
//import java.awt.Dimension;
//import java.awt.Toolkit;
//
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//
//public class Ex04_ItemListener extends JFrame{
//	public Ex04_ItemListener() {
//	super("체크박스 이벤트처리");
//	
//	JPanel jp1 = new JPanel();
//	JPanel jp2 = new JPanel();
//
//	
//	JCheckBox jcb1 = new JCheckBox("축구");
//	JCheckBox jcb2 = new JCheckBox("야구");
//	JCheckBox jcb3 = new JCheckBox("농구");
//	JCheckBox jcb4 = new JCheckBox("배구");
//	
//	JTextArea jta= new JTextArea(30,43);
//	
//	JButton jb1= new JButton("clear");
//	JButton jb2= new JButton("exit");
//	
//	jp1.add(jcb1);
//	jp1.add(jcb2);
//	jp1.add(jcb3);
//	jp1.add(jcb4);
//	
//	add(jta);
//	
//	jp2.add(jb1);
//	jp2.add(jb2);
//	
//	add(jp1, BorderLayout.NORTH);
//	
//	add(jp2, BorderLayout.SOUTH);
//	
//	
//	
//	
//	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
//	setBounds(ds.width/2-250, ds.height/2-200, 500, 400);
//	setDefaultCloseOperation(EXIT_ON_CLOSE);
//	setVisible(true);
//	
//	}
//public static void main(String[] args) {
//	new Ex04_ItemListener();
//}
//}
