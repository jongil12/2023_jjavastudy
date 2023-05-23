package day12.com.ict.edu;

import java.util.Scanner;

public class Ex01_main {
public static void main(String[] args) {
	Ex01_method coffee = new Ex01_method();
	coffee.name = "커피음료";
	coffee.price = 1000;
	
	Ex01_method ion = new Ex01_method();
	ion.name = "이온음료";
	ion.price = 1500;
	
	Ex01_method cola = new Ex01_method();
	cola.name = "탄산음료";
	cola.price = 1200;
	
	Ex01_method juice = new Ex01_method();
	juice.name = "과일음료";
	juice.price = 1800;
	
	Ex01_method payout = new Ex01_method();
	juice.name = "반환";
	juice.price = 0;
	
	System.out.println(coffee.name);
	System.out.println(coffee.price);
	/*
	Ex01_method[] arr= new Ex01_method[4];
	arr[0] = coffee;
	arr[1] = ion;
	arr[2] = cola;
	arr[3] = juice;   //너무길다 줄여보자
	*/
	
	Ex01_method[] arr= {coffee, ion, cola, juice, payout};
	
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
			if(arr[i].price <= input) {
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
		case "커피":output = input -arr[0].price;break;
		case "이온":output = input -arr[1].price;break;
		case "탄산":output = input -arr[2].price;break;
		case "과일":output = input -arr[3].price;break;
		case "반환":output = input -arr[4].price;break;
		default :
			System.out.println("잘못 선택하셨네요");
			output= input;
		}
		System.out.println("잔돈 : " +output);
	}
	
	
}
}
