package day16.com.ict.edu;

public class Ex01_enum {
	//열거형(enum) : 상수를 하나의 객체로 인식하고, 여러개의 상수 객체들을 한곳에
	//			   모아둔 하나의 묶음
	
	int su = 12;
	static final int JAVA = 200;
	static final int HTML = 300;
	
	public void play() {
		//지역변수는 호출과 함께 생성되는데 스테틱은 먼저생성이라 말이 안된다.
		//지역변수는 static 사용할 수 없다.
		//static final int CSS=500;
	}
	
	//열거형
	public enum Lesson{
		JAVA, JSP, SPRING, ANDROID, HTML
	}
	public static void main(String[] args) {
		int num = 100;
		//지역변수는 static을 사용할 수 없다.
		//static final int JSP = 400;
		//Static 메서드 에서는 전역변수 사용 불가
		//System.out.println(su); 
		//지역변수 사용가능
		System.out.println(num);
		
		System.out.println(JAVA);
		System.out.println(HTML);
	
		//열거형 안에 있는 JAVA 추출하기
		Lesson s1 = Lesson.JAVA;
		System.out.println(s1);
		
		//한번에 다 추출
		Lesson[] items = Lesson.values();
		for (int i = 0; i < items.length; i++) {
			//ordinal = 배열의 인덱스값(배열의 주소값)
			System.out.println(items[i] + ":" + items[i].ordinal());
		}
		
	}
}
