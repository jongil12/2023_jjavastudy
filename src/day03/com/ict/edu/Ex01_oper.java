package day03.com.ict.edu;

public class Ex01_oper {

public static void main(String[] args) {
	// 산술연산자 : + , - , * , / , %(나머지)
	int su1 = 9 ;
	int su2 = 4 ;
	int result = 0 ;
	
	result = su1 + su2 ;
	System.out.println("결과 : " + result);
   
	result = su1 - su2 ;
	System.out.println("결과 : " + result);
	//sysout+콘트롤 스페이스바 하면 자동완성
	
	
	result = su1 / su2 ;
	System.out.println("결과 : " + result);
	
	double res = su1 / su2 ;
	System.out.println("결과 : " + res);

	res = (double) (su1) / su2 ;
	System.out.println("결과 : " + res);
	
	res = su1 / (double)(su2) ;
	System.out.println("결과 : " + res);
	
	res = su1 / (su2 * 1.0) ;
	System.out.println("결과 : " + res);
	//두개의 정수 중에 하나만 실수로 만들고나서 1.0 을 곱하면된다.
	//대신에 먼저계산하기 위하여 괄호를 해줘야 한다. 하지 않으면 앞에부터 계산되기 때문에
	//다시 정수의 계산으로 되어버린다.

	result = su1 % su2 ;
	System.out.println("결과 : " + result);
	
   }
}
