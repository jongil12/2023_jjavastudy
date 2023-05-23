package day03.com.ict.edu;

public class Test02 {
	public static void main(String[] args) {
		//2 시간 40 분 30초는 몇 초 일까요?
		int s1 = 1 ;
		int m1 = s1 * 60 ;
		int h1 = m1 * 60 ;
		System.out.println(2*h1 + 40*m1 + s1*30 + " 초 " );
		
		//위는 내가한것 아래는 해설
		int h = 2 * 60 *60 ; // 시간 => 초
		int m = 40 * 60 ;  // 분 => 초
		int s = 30 ;
		
		int result = h+m+s;
		System.out.println("2시간 40분 30초는 " + result + "초 입니다.");

	}
}
