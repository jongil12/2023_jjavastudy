package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int even = 0;
		
		while (true) {
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
			double per =(even / (count*1.0))*100;
			System.out.println(su + "는 " + str + "입니다.");
			System.out.println("전체횟수 : " +count);
			System.out.println("짝수 횟수 : " +even);
			System.out.println("퍼센트 : " +(int)(per*10)/10.0+"%");
			System.out.println("계속할까요?(1.yes,   2.no >> ");
			int s1 = scan.nextInt();
			if (s1 == 2)
				break;
			// 숙제 위 코딩의 문제는 2번외의 모든 숫자를 입력하면 다시 실행된다.
			// 2번 외의 숫자를 입력하면 다시입력하시오 를 출력후 계속할까요 를 실행하시오

			// 전제횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기(소수점 첫째자리까지구하자)
		}

	}
}
