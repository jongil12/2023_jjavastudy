package day09.com.ict.edu;

import java.util.Arrays;

public class Ex11_Array {
public static void main(String[] args) {
	//double p1=번호,국어,영어,수학,총점,평균,학점,순위
	//double p2=번호,국어,영어,수학,총점,평균,학점,순위
	//double p3=번호,국어,영어,수학,총점,평균,학점,순위
	int[][] arr = new int[5][5];
			 // 번호, 총점, 평균, 학점, 순위
    int[] p1 = { 1, 270, 90, 'A', 1 };
    int[] p2 = { 2, 210, 70, 'C', 1 };
    int[] p3 = { 3, 180, 60, 'F', 1 };
    int[] p4 = { 4, 300, 100, 'A', 1 };
    int[] p5 = { 5, 285, 95, 'A', 1 };

    arr[0] = p1;
    arr[1] = p2;
    arr[2] = p3;
    arr[3] = p4;
    arr[4] = p5;


    // 순위를 구하자
    for (int i = 0; i < arr.length; i++) {
       for (int j = 0; j < arr.length; j++) {
    	   if (i == j)         //자기자신 제외
             continue;
          if (arr[i][1] < arr[j][1]) {
             arr[i][4]++;
          }
       }
      
    }
    //자리변경을 위한 임시배열 필요
    int[] temp = new int[5];
    //int [] temp = {0,0,0,0,0};
       // 순위로 오름차순 정렬
    for (int i = 0; i < arr.length - 1; i++) {
       for (int j = i + 1; j < arr.length; j++) {
          if (arr[i][4] > arr[j][4]) { //오름차순
             temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             
          }
       }
    }
    for (int i = 0; i < arr.length; i++) {
       for (int j = 0; j < arr[i].length; j++) {
          if (j == 3) {
             System.out.print((char) arr[i][j]+ "\t");

          } else {
             System.out.print(arr[i][j]+ "\t");
          }                   
       }
       System.out.println();
    }

 }// main
}// class
	
	
	// 출력
	/*
	4, 300, 100, 'A', 1
	5, 285, 95, 'A', 2
	1, 270, 90, 'A', 3
	2, 210, 70, 'C', 4
	3, 180, 90, 'F', 5 
	*/
	

