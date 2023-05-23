package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    
    //학생 수(스캐너) 받기
    System.out.print("학생 수를 입력하세요 : ");
    int su = scan.nextInt();
    double[][] arr = new double[su][8];
    //double[] p = new double[8];을 밖으로 빼면 p가 1개. 
    //그래서 정보가 계속 덮어씌워지면서 맨 마지막꺼만 출력됨.
    
    for (int i = 0; i < arr.length; i++) {
       //(중요!)★★★★for문이 실행될 때 마다 한 사람의 정보를 담을 수 있는 배열을 만들자★★★★
       //for문이 돌 때마다 새로운 배열이 만들어진다.
       double[] p = new double[8]; // for문이 돌 때마다 이 배열이 계속 만들어짐. 
                            // 하지만 이름은 p1, p2가 아닌 모두 p.
       
       //키보드로(스캐너) 번호, 국어, 영어, 수학 받고
          System.out.print("번호 : ");
          p[0] = scan.nextInt();
          
          System.out.print("국어 점수 : ");
          p[1] = scan.nextInt();
          
          System.out.print("영어 점수 : ");
          p[2] = scan.nextInt();
          
          System.out.print("수학 점수 : ");
          p[3] = scan.nextInt();
          
       //총점, 평균, 학점, 순위(초기값 지정)
          p[4] = p[1] + p[2] + p[3];  //총점
          p[5] = (int)(p[4]/3.0*10)/10.0;   //평균
          
       //학점
          if (p[5] >= 90) {
             p[6] = 'A';
          } else if (p[5] >= 80) {
             p[6] = 'B';
          } else if (p[5] >= 70) {
             p[6] = 'C';
          } else {
             p[6] = 'F';
          }
          
        
          p[7] = 1;
          
       //(중요!)★★★★다차원 배열에 넣자★★★★
          arr[i] = p;
    }
    //순위
    for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			//if(i==j) continue;(생략가능)
			if (arr[i][4] < arr[j][4]) {
				arr[i][7]++;
			}
		}
	}
    //순위로 오름차순 정렬
    //자리를 변경하기 위해서 임시
    double[] tmp= new double[8];
    for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i][7] >  arr[j][7]) {
				tmp= arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			} 
		}
	}
 
       //출력
    System.out.println("번호\t총점\t평균\t학점\t순위");
    for (int i = 0; i < arr.length; i++) {
       for (int j = 0; j < arr[i].length; j++) {
          //국어, 영어, 수학은 출력에서 제외
          if (j == 1 || j == 2 || j == 3) continue;
          if (j == 5) {
             System.out.print(arr[i][j] + "\t");
          }else if (j == 6){
             System.out.print((char)(arr[i][j]) + "\t");
          }else {  //double이니깐 int로 나올 수있게 형 변환
             System.out.print((int)(arr[i][j]) + "\t");
          }
       }
       System.out.println();
    }
 
    
 }//main
}//class