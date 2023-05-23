package day16.com.ict.edu;

enum Type{
	WALKING, RUNNING, TRACKING, HIKING
}

public class Ex02_enum {
	String name;
	int size;
	Type type; // 선언을 enum 으로 했다
	
	public static void main(String[] args) {
		Ex02_enum shose = new Ex02_enum();
		shose.name = "나이키";
		shose.size = 270;
		shose.type = Type.RUNNING; //enum 에서 꺼내써야한다.
		
		System.out.println("신발 이름 :"+shose.name);
		System.out.println("신발 사이즈 :"+shose.size);
		System.out.println("신발 종류 :"+shose.type);
		System.out.println("신발 종류 :"+Type.RUNNING);
	}

}
