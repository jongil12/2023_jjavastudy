package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 근무시간이 8시간 까지는 시간당 9620 원 이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 (xx) 이다.
		// 얼마를 받아야 하는가? 숫자
		System.out.print("근무시간 : ");
		int time = scan.nextInt();
		int limt = 8;
		int dan = 9620;
		int pay = 0;

		if (time > limt) {
			pay = (limt * dan) + (int) ((time - limt) * dan * 1.5);
		} else {
			pay = (time * dan);

		}
		System.out.println(time + "시간 근무시 받을돈은 : " + pay + "원 입니다.");
System.out.println("=======================1");
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
		// 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
		// 친구와 함께 2잔을 10000 내고 먹었다.
		// 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
		// (친구와 같은 음료을 먹어야 한다.) 숫자
System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"
        + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");		
System.out.print("메뉴번호 : ");

		int menu = scan.nextInt();
		int in = 10000;
		int su = 2;
		dan = 0;
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
		int vat = (int) (total * 0.1);
		int out = in - (total + vat);

		System.out.println("선택메뉴 : " + drink);
		System.out.println("잔돈 : " + out);

		System.out.println("================");

		// 나라를 입력하면 수도가 출력되게 하자
		// 한국=서울, 중국=베이징, 일본=도쿄, 미국=워싱턴, 이외에는 데이터 없음
		// (swtich~case) 문자
		System.out.print("나라 : ");
		String res = scan.next();
		switch (res) {
		case "한국":	res = "서울";		break;
		case "중국":	res = "베이징";	break;
		case "일본":	res = "도쿄";		break;
		case "미국":	res = "워싱턴";	break;
		default : 	res = "없는 데이터 입니다.";

		}
		System.out.print("의 수도는 " + res);
	}
}
