package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_Scanner4 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	
	
	System.out.print("원하는 반복 횟수 : ");
	int su = scan.nextInt();
	System.out.print("원하는 단어 : ");
	String str = scan.next();
	//
	//for (int i = 0; i < su; i++) {
	//	System.out.println(str);
	//}
	
	int i=0;
	while (i<su) {
		System.out.println(str);
		i++;
		}
	System.out.println("=========================");
	
	
	//원하는 회수를 입력 받고 
	//숫자를 입력 받아서 
	//입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
	
	
	
	//이름, 국어, 영어, 수학를 입력 받아서 
	//총점, 평균, 학점을 구하고 
	//이름, 총점, 평균, 학점을 출력하는 코딩 
	//(평균은 소숫점 첫째자리까지 구하자)
	
	
	
	//첫번째 숫자 받기
	//두번째 숫자 받기
	//연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
	// n4 가 소수점이 나오기 때문에 모든 결과는 소수점으로 나오게 해야한다.
}
}
