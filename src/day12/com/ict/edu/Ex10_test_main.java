package day12.com.ict.edu;

import java.util.Scanner;

public class Ex10_test_main {
	public static void main(String[] args) {
		
	//1.입금액이 품목금액 보다 작은데 선택 하였을 때 계산이 되면 안된다
	//위 상황에서 금액이 부족합니다.
	//잔돈은 얼마 입니다.표시

	//2.자판기에 만원을 넣었다면 음료를 1개 선택 후  잔돈이 판매액 보다 크면 
	//반환이 아니라 물품 선택 과 반환 선택을 고를 수 있게 만들어라
	//잔돈이 판매액 보다 작으면 잔돈 반환
		
	//3.메뉴에 반환 메뉴를 추가해서 입금 후 구매 하지 않아도 반환 받을 수 있는 선택지를 준다
		
		
		// 음료들의 최소금액을 구하자. (오름차순에서 맨 처음 최소값, 맨 끝이 최대값)
		
		int input = 0;
		int arr[] = {};
		
		
		if(input < 0) {// 이프문에서 계산도 같이 할수 있도록 이중으로 만들어 보자
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
			case  "커피":output = input -arr[0].getPrice();break;
			
			case "이온":output = input -arr[1].getPrice();
			
			case "탄산":output = input -arr[2].getPrice();
			
			case "과일":output = input -arr[3].getPrice();break;
			
			//case "반환":output = input -arr[3].getPrice();break;
			default :
				System.out.println("잘못 선택하셨네요");
				output= input;
			}
			System.out.println("잔돈 : " +output);
		}
		
		
		
		
	}//main
	}//class

	
