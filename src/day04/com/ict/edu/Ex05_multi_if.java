package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
		// 다중 if문
		// 형식) if(조건식1){
		// 조건식1이 참일때 실행할 문장;
		// 조건식1이 참일때 실행할 문장;
		// }else if(조건식2){
		// 조건식1이 거짓이면서 조건식2가 참일때 실행할 문장;
		// 조건식1이 거짓이면서 조건식2가 참일때 실행할 문장;
		// }else if(조건식3){
		// 조건식1,2가 거짓이면서 조건식3가 참일때 실행할 문장;
		// 조건식1,2가 거짓이면서 조건식3가 참일때 실행할 문장;
		// }else{
		// 조건식1,2,3 모두 거짓인 경우
		// }

		// int k1의 점수가 90이상 이면 A학점 80이상이면 B 학점 70이상이면 C학점

		int k1 = 80;
		String str = " ";
		if (k1 >= 90) {
			str = "A학점";
		} else if (k1 >= 80) {
			str = "B학점";
		} else if (k1 >= 70) {
			str = "C학점";
		} else { 
			str = "F학점";
		}

		System.out.println(str);

		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별하자
		char k2 = '1';
		str = "";
		if (k2 >= 'A' && k2 <= 'Z') {
			str = "대문자";
		} else if (k2 >= 'a' && k2 <= 'z') {
			str = "소문자";
		} else if (k2 >= '0' && k2 <= '9') {
			str = "숫자";
		} else {
			str = "기타문자";
		}
		System.out.println(str);

		// char k3이 A,a 이면 아프리카, B,b 이면 브라질 C,c 이면 캐나다, 한국
		char k3 = 'C';
		str = "";
		if (k3 == 'A' || k3 == 'a') {
			str = "아프리카";
		} else if (k3 == 'B' || k3 == 'b') {
			str = "브라질";
		} else if (k3 == 'C' || k3 == 'c') {
			str = "캐나다";
		} else {
			str = "한국";
		}
		System.out.println(str);

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친과외 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가?(부가세 10% 포함), 친구와 같음 음료만 선택 가능

		int manu = '2';
		int manu1 = 3500;
		int manu2 = 4000;
		int manu3 = 3000;
		int manu4 = 3500;
		int inpay = 10000;
		int outpay = 0;
		if (manu == '1') {
			outpay = inpay - (int) ((manu1 * 2) * 1.1);
		} else if (manu == '2') {
			outpay = inpay - (int) ((manu2 * 2) * 1.1);
		} else if (manu == '3') {
			outpay = inpay - (int) ((manu3 * 2) * 1.1);
		} else if (manu == '4') {
			outpay = inpay - (int) ((manu4 * 2) * 1.1);
		}
		System.out.println("잔돈은" + outpay + "원입니다.");

		// 위에는 내가 한거 아래는 해설

		int menu = 3;
		int in = 10000;
		int su = 2;
		int dan = 0;
		String drink = " ";
		

		if (menu == 1) {
			drink = "카페모카";
			dan = 3500;
		} else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		} else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		} else if (menu == 4) {
			drink = "과일주스";
			dan = 3500;
		}
		
		int total = dan * su;
		int vat = (int) (total *0.1);
		int out = in - (total+vat);
		
		System.out.println("선택메뉴 : " + drink);
		System.out.println("잔돈 : " + out);
		}

	}

