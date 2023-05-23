package day16.com.ict.edu;


public class Ex05_Main {
public static void main(String[] args) {
	//내부클래스로 별도로 객체 생성할 수 없다.(static 은 제외)
	//Inner01 test = new Inner01(); 내부클래스 호출이라 오류 난다.
	
	//외부클래스를 통해서 내부클래스 객체를 생성한다.(Member내부클래스0
	Ex05_MemberInnerCalss test = new Ex05_MemberInnerCalss();

	Ex05_MemberInnerCalss.Inner01 exam = test.new Inner01();

	exam.prn();
	System.err.println();
	test.play();
}
}
