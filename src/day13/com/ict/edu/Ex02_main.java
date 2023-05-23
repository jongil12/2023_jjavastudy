package day13.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		System.out.println(Ex02_static.su2);
		System.out.println();
		Ex02_static p1 = new Ex02_static();
		System.out.println(p1.su1);
		System.out.println(p1.su2);
		
		//위 결과는 둘다 같다
		
		//아래 결과는 11과 12가 나온다
		//이유는 생성자 생성시 초기값으로 생성됨다
		//su1 은 인스턴스 변수 su2는 static 변수
		//하지만 static 은 static 메모리에
		//따로 저장 되기때문에 위에서 저장한값+가된다
		
		Ex02_static p2 = new Ex02_static();
		System.out.println(p2.su1);
		System.out.println(p2.su2);

		Ex02_static p3 = new Ex02_static();
		System.out.println(p3.su1);
		System.out.println(p3.su2);
		
		System.out.println(p1.su1);
		System.out.println(p1.su2);
		
	}
}
