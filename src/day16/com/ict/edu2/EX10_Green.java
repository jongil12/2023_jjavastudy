package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class EX10_Green extends JPanel {
public EX10_Green() {
setBackground(Color.green);
	JCheckBox jcb1 =new JCheckBox("바보");
	//jcb1.setText("바보");
	//jcb1.setSelected(true);
	JCheckBox jcb2 = new JCheckBox("똥개");
	JCheckBox jcb3 = new JCheckBox("해삼");
	JCheckBox jcb4 = new JCheckBox("말미잘");
	add(jcb1);
	add(jcb2);
	add(jcb3);
	add(jcb4);
}
}
