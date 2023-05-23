package day10.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
	// static : 객체 생성 없이, 클래스이름.변수이름 
	System.out.println(Ex02_class.AVG);
	System.out.println(Ex02_class.sum);
	
	// instance는 객체 생성 후 접근
	// 객체 생성)
	// 클래스이름 참조변수 = new 생성자([인자]);
	// ** 해당 클래스의 생성자가 없으면 기본생성자 사용
	// ** 기본 생성자란 인자가 없는 생성자, 클래스이름() == 기본생성자()
	Ex02_class test = new Ex02_class(); 
	// 접근법 : 참조변수.멤버필드
	System.out.println(test);
	System.out.println(test.name);
	System.out.println(test.GENDER);
	System.out.println(test.AVG);
	System.out.println(test.sum);
	
	test.name = "일지매";
	// test.GENDER = "여성"; /Ex02_class 에서  final 이붙어있어 상수라서 변경못함 
	
	Ex02_class.sum =1000;
	//Ex02_class.AVG =1000; /Ex02_class 에서  final 이붙어있어 상수라서 변경못함 
	
	System.out.println(test.name);
	System.out.println(Ex02_class.sum);
	
	
}
}
