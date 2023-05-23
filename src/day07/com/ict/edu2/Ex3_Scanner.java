package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex3_Scanner {
public static void main(String[] args) {
	//계속할까요(1.yes, 2.no)일때 Ex02_Scanner 는 숫자로 받았는데
	//문자가 들어오니 오류 발생 된다.
	//그래서 문자로 받아서 처리 하자
	Scanner scan = new Scanner(System.in);
	int count = 0;
	int even = 0;
	esc: while (true) {
		count++;
		System.out.print("숫자입력 : ");
		int su = scan.nextInt();

		String str = "";

		if (su % 2 == 0) {
			str = "짝수";
			even++;
		} else {
			str = "홀수";

		}
		System.out.println(su + "는 " + str + "입니다.");
		while (true) {
			System.out.print("계속할까요?(Y(y)/N(n)) >> ");
			String s1 = scan.next();
			if (s1.equalsIgnoreCase("y")) {
				continue esc;
			} else if (s1.equalsIgnoreCase("n")) {
				break esc;
			} else {
				System.out.println("제대로 입력하세요");
				continue;
			}

		}
	}
	double per = (even / (count * 1.0)) * 100;

	System.out.println("전체횟수 : " + count);
	System.out.println("짝수 횟수 : " + even);
	System.out.println("퍼센트 : " + (int) (per * 10) / 10.0 + "%");

	
	
	
}//main
}//class
