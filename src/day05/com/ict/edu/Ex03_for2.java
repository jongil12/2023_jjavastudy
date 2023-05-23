package day05.com.ict.edu;

public class Ex03_for2 {
	public static void main (String[] args) {
		//중첩 for 문 : for문 안에 또다른 for 문이 존재하는 
		
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			for (int j = 1; j < 10; j++) {
				System.out.print(i+"X"+j+"="+i*j+"\t");
			}// 안쪽for문 끝
			System.out.println("====================");
				}//바깥쪽 for문 끝
					
		
		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int j = 2; j < 10; j++) {
				System.out.print(j+"x"+i+"="+i*j+"\t");
		}// 안쪽for문 끝
					}
		System.out.println("====================");
		
	}

}
