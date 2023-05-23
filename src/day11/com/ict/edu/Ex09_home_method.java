package day11.com.ict.edu;

public class Ex09_home_method {
//	총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고
//	이름, 국어, 영어, 수학를 받아서
//	총점, 평균, 학점, 순위를 구하고
//	순위 기준으로 오름 차순으로 정렬하여
//	출력하는 main 메서드를 가지는 클래스를 만들어라
//	단, 처리는 2차원 배열을 이용해라

	double sum = 0;
	double avg = 0.0;
	char hak;
	int rank = 0;

	// 총점
	public void getSum(double kor, double eng, double math) {
		sum = kor + eng + math;
	}

	// 평균
	public void getAvg() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
	}

	// 학점
	public void getHak() {
		if (avg >= 90) {
			hak = 'A';
		} else if (avg >= 80) {
			hak = 'B';
		} else if (avg >= 70) {
			hak = 'C';
		} else {
			hak = 'F';
		}
	}

	// 순위
	public void getRank() {
		rank = 1;
	}

}// class
