package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	
	//Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
	Ex04_get_set[] arr = new Ex04_get_set[5];
	// 변경하는건 set.  //데이터만 쓰는건 get
	// is 는 get 이다.(boolean) 형은 is 로 나온다
	for (int i = 0; i < arr.length; i++) {
		Ex04_get_set person = new Ex04_get_set();
		
		System.out.print("이름 :");
		person.setName(scan.next());
		
		System.out.print("국어 :");
		person.setKor(scan.nextInt());
		
		System.out.print("영어 :");
		person.setEng(scan.nextInt());
	
		System.out.print("수학 :");
		person.setMath(scan.nextInt());
		
		person.setSum(person.getKor()+person.getEng()+person.getMath());
		
		person.setAvg((int)(person.getSum()/3.0 *10) /10.0);
		
		if(person.getAvg() >=90) {
			person.setHak("A 학점");
		}else if(person.getAvg() >=80) {
			person.setHak("B 학점");
		}else if(person.getAvg() >= 70) {
			person.setHak("C 학점");
		}else {
			person.setHak("F 학점");
		}
		
		person.setRank(1);
		
		arr[i] = person ;
		}
	
	// 순위

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
					
					
				}
			}
		}
		Ex04_get_set[] temp = new Ex04_get_set[5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
				temp[i] = arr[i];
				arr[i] = arr[j];
				arr[j]= temp[i];
				
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : " +arr[i].getName()+"\t");
			System.out.print("총점 수 : "+arr[i].getSum()+"\t");
			System.out.print("평균 점수 :"+arr[i].getAvg()+"\t");
			System.out.print("학점 점수 :"+arr[i].getHak()+"\t");
			System.out.println("순위 : "+arr[i].getRank());
			
			
		}
	
		
		
}//main
}//class
