package day03.com.ict.edu;

public class Test03 {
	public static void main(String[] args) {
		//3989초는 몇시간, 몇분, 몇초 인가?
		int ex1 = 3989;
		int s1 = 1 ;
		int m1 = s1 * 60 ;
		int h1 = m1 * 60 ;
		
		int h2 = ex1 / h1 ;
		int m2 = (ex1 % h1) / m1 ;
		int s2 = (ex1 % h1) / m2 ;
	
		System.out.print(h2+ " 시간 ");
		System.out.print(m2+ " 분 ");
		System.out.println(s2+" 초 ");
		// 위에 내가한거
		int time = 3989;
		int hour = time/(60*60);
		int minute = time/60-(hour*60) ;
		int second = time%60;
		System.out.println(hour +" 시간 " + minute + " 분 " +second + " 초 ");
		// 위는 인터넷 아래는 해설
		int t = 3989 ;
		int h = 0;   //시
		int m = 0;   //분
		int s = 0;   //초
		int res = 0; // 나머지
		h = time / (60*60);    //1
		res = time % (60*60);  //389
		m = res / 60 ;         //6
		s = res % 60 ;         //29초
		
		System.out.println(h + " 시간 " + m + " 분 " + s + " 초 ");
	
		
	}
}
