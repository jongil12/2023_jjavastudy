package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_Main extends JFrame  {
	public Ex10_Main() {
		super("JTab_2");
		
		//JPanel을 상속한 클래스 객체로 만들기
		Ex10_Blue blue = new Ex10_Blue();
		Ex10_Cyan cyan = new Ex10_Cyan();
		EX10_Green green = new EX10_Green();
		
		JTabbedPane jtab = new JTabbedPane();
		// JPanel 들을 JTab 에 넣기
		jtab.addTab("블루 탭", blue);
		jtab.addTab("시안 탭", cyan);
		jtab.addTab("그린 탭", green);
		
		//JTab 을 JFrame 에 넣자
		add(jtab);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
public static void main(String[] args) {
	new Ex10_Main();
	
}
}
