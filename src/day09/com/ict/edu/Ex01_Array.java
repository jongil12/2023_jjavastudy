package day09.com.ict.edu;

public class Ex01_Array {
	public static void main(String[] args) {

//  배열: 같은 자료형의 데이터들을 한 곳에 모아 둔 묶음
//  	   반드시 같은 자료형이어야 한다.(단, 프로모션은(현변환), 디모션,(형변환)은 그냥하다)
// 	   생성할때 반드시 크기를 지정해야 된다.
// 	   한번 지정된 크기는 변경되지 않는다.
//  	   배열의 데이터를 추출할때는 일반적으로  for 문을 사용한다.
// 배열의 종류 : - 1차원 배열과 다차원 배열(1차원 배열안에 배열이 이 존재)
//  			- 기본자료형배열과 참조자료형배열(객체배열)
// 배열 생성 순서 : 선언 => 생성 => 초기화(데이터저장)
// 1. 선언 : 자료형[] 이름 ; 또는 자료형 이름[] ;
 
 int [] su ;
 
// 2. 생성 : 이름 = new 자료형[배열의크기 = 방의 수 = length = 길이]; 			
// 		  new 예약어 : 메모리에 데이터를 저장할 공간을 만들어라
// 		  			= 인스턴스, 객체 생성
 su = new int[4];
 
// 3. 데이터 저장 : 이름[index = 방 번호 = 위치 값 = 0 부터 시작]
// 				같은 자료형 이어야 만 저장 가능 (프로모션, 디모션 가능)
 su[0] = 100;
 su[1] = 'a';	//프로모션
 su[2] = (int) 2.4 ; //디모션 => 형변환 하면 가능 소수점은 날라감(데이터손실)
 su[3] = 124;
//. su[4] = 14; //실행 오류(배열크기보다 크면 실행오류) 런타임 오류라한다.
 
 su[0] = 12 ; // 현재 데이터를 삭제하고 12가 저장된다.(변수와 같음)
 
 // 배열을 호출 하면 주소 (생성ID)가 출력
 System.out.println(su);
 System.out.println(su[0]);  // 하나하나는 변수로 본다
 System.out.println(su[1]);
 System.out.println(su[2]);
 System.out.println(su[3]);
 System.out.println("=========================");
 //배열의 출력은 일반적으로 for문 사용
for (int i = 0; i < su.length; i++) {
	if(i%2==0)
	System.out.println(su[i]*10);
	else
		System.out.println(su[i]);
}
System.out.println("==========================");
 
 //개선된 for 문: 배열이나 컬렉션에 주로사용
 //  			배열 전체에 대해서 정보 출력 및 가공 가능
 //				그러나 특정 몇개나 특정 하나를 별도로 출력하거나 가공할수 없다(단첨)
//  			인덱스값을 이용할 수 없다.
   
 //   : => 오른쪽 배열 데이터를 하나씩 순소대로 왼쪽에 넘긴다. 
  
for (int k : su){
	  if(k>90)
  	System.out.println(k*10);
	  else
		  System.out.println(k);
  }
   
   
   
// 배열 의 구분 1차원 배열과 다차원 배열 하위 객체로는 기본자료형 배열 객채형 배열이 있다.
//기본자료형 배열로는 논리.케릭터.정수.실수 가있다.
//객체형 배열은 참조자료형 배열로 볼수있다.
//다차원 배열은 배열안에 배열을 가지고 있는 배열이다.

//배열은 선언을 먼저한다
//ex) char[] ch; 대괄호가 들어가면 선언으로 본다.
//   배열 생성 ch= new char[4]; 
//    (new 객체를 만들어주세요 char 가들어가는 방 4개짜리 라는 말이다)

		
		
	} //main
} //class