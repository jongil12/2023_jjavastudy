package day03.com.ict.edu;

public class Test11 {
public static void main(String[] args) {
	//이름이 홍길동인 사람의 점수가 
			// 국어 90, 영어 80, 수학 80 점이다.
			//총점과 평균을 구하자
			//화면 출력은 이름, 총점, 평균만 출력하자
			//(단, 평균은 소수점 첫째자리까지 구하자)
	String name = "홍길동";
	int kor = 90;
	int eng = 80;
	int su = 80;
	int sum = kor + eng + su ;
	double avg = sum / 3.0 ;
	double avg2 =(int)(avg*10) / 10.0;
	
	System.out.println("이름 : "+ name);
	System.out.println("총점 : "+ sum);
	System.out.println("평균 : "+ avg2);
	
			
	
			
}
}
