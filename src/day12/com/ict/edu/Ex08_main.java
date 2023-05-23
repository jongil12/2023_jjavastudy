package day12.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
public static void main(String[] args) {

	Ex08_Constructor coffee = new Ex08_Constructor("커피음료", 1000);
	Ex08_Constructor ion = new Ex08_Constructor("이온음료", 1500);
	Ex08_Constructor cola = new Ex08_Constructor("탄산음료", 1200);
	Ex08_Constructor juice = new Ex08_Constructor("과일음료", 1800);
	
	Ex08_Constructor[] arr= {coffee, ion, cola, juice};
	
	Scanner scan = new Scanner(System.in);
	System.out.println("금액을 투입하세요 >>>");
	int input = scan.nextInt();
	
	// 음료들의 최소금액을 구하자. (오름차순에서 맨 처음 최소값, 맨 끝이 최대값)
	
	
	if(input < 1000) {
		System.out.println("금액이 부족합니다.");
		System.out.println("잔돈 : "+input);
	}else {
		System.out.println("커피\t이욘\t탄산\t과일\t반환");
		
		//입력금액과 각 음료수의 가격을 비교
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getPrice() <= input) {
				System.out.print("O\t");
				//System.out.print(arr[i].name+"\t");
			}else {
				System.out.print("x\t");
			}
		}
		System.out.println();
		System.out.println("선택하세요 >>");
		String drink = scan.next();
		int output = 0;
		switch (drink) {
		case "커피":output = input -arr[0].getPrice();break;
		case "이온":output = input -arr[1].getPrice();
		case "탄산":output = input -arr[2].getPrice();
		case "과일":output = input -arr[3].getPrice();break;
		default :
			System.out.println("잘못 선택하셨네요");
			output= input;
		}
		System.out.println("잔돈 : " +output);
	}
	
	
	
	
}//main
}//class
