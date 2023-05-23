package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		

	Scanner scan = new Scanner(System.in);

    Ex09_Constructor[] arr = new Ex09_Constructor[5];

    for (int i = 0; i < arr.length; i++) {
       
       System.out.print("이름: ");
       String name = scan.next(); 

       System.out.print("국어: ");
       int kor = scan.nextInt();

       System.out.print("영어: ");
       int eng = scan.nextInt();

       System.out.print("수학: ");
       int math = scan.nextInt();
       
       Ex09_Constructor person = new Ex09_Constructor(name, kor, eng, math);
       
       
       arr[i] = person; // 5번 만들어진 person을 arr배열의 각 방에 들어가도록.

    } // 이제 값은 다 들어갔음.
    
    // 순위
          for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                if (i == j)
                   continue;
                if (arr[i].getSum() < arr[j].getSum()) { // 클래스 배열은 .이름 으로 출력해야 함.
                   arr[i].setRank(arr[i].getRank()+1);
                }

             }
          }

          // 정렬
          //임시 tmp 때문에 메서드에 기본 생성자가 있어야 함.
          Ex09_Constructor tmp = new Ex09_Constructor();
          
          for (int i = 0; i < arr.length - 1; i++) {
             for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getRank() > arr[j].getRank()) {
                   tmp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp;
                }
             }
          }


    // 출력
          for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i].getName() + "\t");
             System.out.print(arr[i].getSum() + "\t");
             System.out.print(arr[i].getAvg() + "\t");
             System.out.print(arr[i].getHak() + "\t");
             System.out.println(arr[i].getRank());
          }
 }// main
}
