package day14.com.ict.edu;

import java.util.Random;

public class Ex05_extends extends Random {
	int su = nextInt();
	
	public void play() {
	System.out.println("EX05 : " +su);	
	}
	
	//static 메서드는 static 변수만 사용가능
	public static void main(String[] args) {
		//System.out.println(su);
		//play();
		
		//자기 자신이라도 객체를만들자
		Ex05_extends test = new Ex05_extends();
		test.play();
}
}
