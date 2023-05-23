package day06.com.ict.edu2;

import java.util.Scanner;

public class Exsj {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//ex1)

		//원하는 회수를 입력 받고
		//숫자를 입력 받아서
		//입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		
		System.out.print("원하는 반복 횟수 : ");
		int su = scan.nextInt();
		int su1= 0;
		for (int i = 0; i < su; i++) {
			
			System.out.print("숫자를 입력하시오  : ");
			su1 = scan.nextInt();
			if (su1%2 == 0) {
				System.out.println(su1+"는 짝수 입니다.");
			} else {
				System.out.println(su1+"는 홀수 입니다.");

			}
			
		}
System.out.println("====================================");

/*이름, 국어, 영어, 수학를 입력 받아서 
총점, 평균, 학점을 구하고 
이름, 총점, 평균, 학점을 출력하는 코딩 
(평균은 소숫점 첫째자리까지 구하자)
won1 =이름 
won2 = 국어
won3 = 영어
won4 = 수학
*/
System.out.print("이름 : "+"\t");
String won1 = scan.next();
System.out.print("국어 점수 :"+"\t");
int won2 = scan.nextInt();
System.out.print("영어 점수 :"+"\t");
int won3 = scan.nextInt();
System.out.print("수학 점수 :"+"\t");
int won4 = scan.nextInt();
int sum = won2 + won3+ won4;
double sum2= sum/3.0;
double sum1= (int)(sum2*10)/10.0;
String str = "";
System.out.println("총점 :" + sum);
System.out.println("평균 점수 : "+(sum1));
if (sum1 >= 90) {
	str = "A 학점";
} else if (sum1 >= 80) {
	str = "B 학점";
	
} else if (sum1 >= 70){
	str = "C 학점";
	}else {
		str = "F 학점";

}
System.out.println(str);

System.out.println("============================");


/*첫번째 숫자 받기
두번째 숫자 받기
연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")

*/
System.out.println("첫번째 숫자 :");
int su11 = scan.nextInt();
System.out.println("두번째 숫자 :");
int su12 = scan.nextInt();
System.out.println("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ");
int su13 = scan.nextInt();
if (su13==1) {
	System.out.println(su11+su12);
} else if (su13==2) {
	System.out.println(su11-su12);
} else if (su13==3) {
	System.out.println(su11*su12);
} else if (su13==4) {
	double su111 = (int)(su11*10)/10.0;
	double su112 = (int)(su12*10)/10.0;
	System.out.println(su111/su112);
}
{

}



	}
}
	


