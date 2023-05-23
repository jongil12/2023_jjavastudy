package day03.com.ict.edu;

public abstract class Test13 {
public static void main(String[] args) {
	//5238 초는 몇시간, 몇분, 몇초 인가?
	
	int time = 5238 ;
	int h = 0;
	int m = 0;
	int s = 0;
	int res = 0;
	
	h = time / (60*60);
	res = time % (60*60);
	m = res / 60;
	s = res % 60;
	
	System.out.println("5238초는 "+ h+"시간"+m+"분"+s+"초 입니다.");
	
	
}
}
