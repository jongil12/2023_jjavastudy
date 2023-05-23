package day11.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
	Ex08_method[] arr = new Ex08_method[5];
	
	for (int i = 0; i < arr.length; i++) {
		Ex08_method person = new Ex08_method();
		
		System.out.print("이름 :");
		person.name = scan.next();
		
		System.out.print("국어 :");
		person.kor = scan.nextInt();
		
		System.out.print("영어 :");
		person.eng = scan.nextInt();
	
		System.out.print("수학 :");
		person.math = scan.nextInt();
		
		person.sum = person.kor + person.eng+person.math;
		
		person.avg = (int)(person.sum/ 3.0 * 10)/10.0;
		
		if(person.avg >=90) {
			person.hak = "A 학점";
		}else if(person.avg >=80) {
			person.hak = "B 학점";
		}else if(person.avg >= 70) {
			person.hak = "C 학점";
		}else {
			person.hak = "F 학점";
		}
		
	 
		
		arr[i] = person ;
		}
	
	// 순위

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].sum < arr[j].sum) {
					arr[i].rank++;
					
					
				}
			}
		}
		Ex08_method[] temp = new Ex08_method[5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
				temp[i] = arr[i];
				arr[i] = arr[j];
				arr[j]= temp[i];
				
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : " +arr[i].name+"\t");
			System.out.print("국어점수 : "+arr[i].kor+"\t");
			System.out.print("영어점수 :"+arr[i].eng+"\t");
			System.out.print("수학점수 :"+arr[i].math+"\t");
			System.out.println("순위 : "+arr[i].rank);
			
			
		}
	
		
		
		}
	
	
	}
	
