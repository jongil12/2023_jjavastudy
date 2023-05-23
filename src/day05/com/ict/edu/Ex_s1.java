package day05.com.ict.edu;

import java.util.Iterator;

public class Ex_s1 {
	public static void main(String[] args) {
		// 숙제 1 + (-2)+ 3+ (-4) +5 (-6) + 7 + (-8) + 9 + (-10)
		// FOR문을 이용한 누적합 힌트 짝수일때 - 이프엘스까지 써야한다//1 번 if~ else문
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			} else {
				sum = sum - i;

			}
		}

		System.out.println(sum);
		System.out.println("=================");
		// 1. if~ else문
		// 농구공 5개씩 한 박스에 들어간다.
		// 40개면 8상자, 26개면 6개이다.
		// 농구공이 127 개이면 몇 박스 인가
		// int k1 = 127개이다.
		int k1 = 127; // 농구공개수
		int box = 0; // 박스개수
		box = k1 / 5;
		if (k1 % 5 == 0) {
			box = box;
		} else {
			box = box + 1;
		}
		System.out.println(box);
		System.out.println("=================");

		// 2번 0000
		// 0000
		// 0000
		// 0000 for 문으로 만들기

		for (int i = 1; i < 8; i++) {
			System.out.println("0 0 0 0");
			i++;

		}

		System.out.println("=========================");

		// 3번 1000
		// 0100
		// 0010
		// 0001 이중 for 문으로 만들기
		
			for (int m = 0; m < 4; m++) { // 행(row) 반복
			       for (int j = 0; j < 4; j++) { // 열(column) 반복
			           if (m == j) { // 대각선 요소는 1로 출력
			               System.out.print("1 ");
			           } else { // 나머지 요소는 0으로 출력
			               System.out.print("0 ");
			           }
			       }
			       System.out.println(); // 다음 행으로 이동
			  }
		System.out.println("================");

		// 4번
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을때, 몇까지 더해야 총합이 100
		// 이상이 되는지 구하시오(for 문)
		sum = 0;
		int i = 0;
		while (true) {
			i++;
			if (sum >= 100) {
				break;
			}

			if (i % 2 == 1) {
				sum += i;
			} else {
				sum -= i;

			}
		}
		System.out.println(i - 1);
		System.out.println("==============");

		// 5번

		for (int k = 0; k < 5; k++) {
			for (int j = 0; j < k; j++) {
				System.out.print("*");

			}
			System.out.println("");

		}
		System.out.println("======================");
		// 6번 별찍기

		for (int k = 0; k < 4; k++) {
			for (int j = 4; j > k; j--) {
				System.out.print(" ");
			}
			for (int l = 0; l <= k; l++)
				System.out.print("*");
			System.out.println();
		}

	}
}
