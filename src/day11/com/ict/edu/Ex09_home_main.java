package day11.com.ict.edu;

import java.util.Scanner;

public class Ex09_home_main {
//	총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고
//	번호, 국어, 영어, 수학를 받아서
//	총점, 평균, 학점, 순위를 구하고
//	순위 기준으로 오름 차순으로 정렬하여
//	출력하는 main 메서드를 가지는 클래스를 만들어라
//	단, 처리는 2차원 배열을 이용해라
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("학생 수: ");
		int su = scan.nextInt();
		double[][] arr = new double[su][8]; 

		for (int i = 0; i < arr.length; i++) {
			double[] student = new double[8];

			System.out.print("번호: ");
			student[0] = scan.nextInt();

			System.out.print("국어: ");
			student[1] = scan.nextInt();

			System.out.print("영어: ");
			student[2] = scan.nextInt();

			System.out.print("수학: ");
			student[3] = scan.nextInt();
			
			Ex09_home_method test = new Ex09_home_method();
			// Ex09_homework_method 객체 생성

			// 총점
			test.getSum(student[1], student[2], student[3]);
			student[4] = test.sum;

			// 평균
			test.getAvg();
			student[5] = test.avg;

			// 학점
			test.getHak();
			student[6] = test.hak;

			// 순위
			test.getRank();
			student[7] = test.rank;
			
			arr[i] = student;    

		}

		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i][4] < arr[j][4]) {
					arr[i][7]++;
				}

			}

		}
		// 정렬
		double[] tmp = new double[8];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][7] > arr[j][7]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}

		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 1 || j == 2 || j == 3)
					continue;
				if (j == 5) {
					System.out.print(arr[i][j] +"\t");
				} else if (j == 6) {
					System.out.print((char) (arr[i][j])+"\t");
				} else {
				System.out.print((int) (arr[i][j])+"\t");
				}
			}System.out.println();
		}

	}// main
}// class