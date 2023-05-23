package day08.com.ict.edu;

import java.util.Scanner;

public class SJ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String str = "";

			if (su % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			System.out.println(su + " 는 " + str + " 입니다");

			int s1;
			while (true) {
				System.out.print("계속 할까요?(1. yes,  2. no)  >>>");
				s1 = scan.nextInt();
				if (s1 == 1 || s1 == 2)
					break;
				else {
					System.out.println("다시 입력하세요.");
				}
			}
			if (s1 == 2)
				break;
		}

	}
}
