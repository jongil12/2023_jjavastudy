package day03.com.ict.edu;

public class Test15 {
public static void main(String[] args) {
	        //결과 3781 이라면
			//천의자리 : 3
			//백의자리 : 7
			//십의자리 : 8
			//일의자리 : 1
	int su = 5218;
	int c = 0;
	int b = 0;
	int s = 0;
	int i = 0;
	int res = 0;
	
	c= su / 1000;
	res = su % 1000;
	b = res / 100;
	res = su % 100;
	s = res / 10;
	res = su % 10;
	i = res ;
	
	System.out.println("천의자리"+ c);
	System.out.println("백의자리"+ b);
	System.out.println("십의자리"+ s);
	System.out.println("일의자리"+ i);
	
}
}
