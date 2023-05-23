package day03.com.ict.edu;

public class Test14 {
public static void main(String[] args) {
	//카페모카 6500이다.
			//친구와 둘이서 15000을 내고 주문했다.
			//잔돈은 얼마 인가 (단, 부가세 10%포함)
	int cup = 6500;
	int su = 3;
	int in = 22000;
	int otr = cup * su ;
	int vat = (int)(otr*0.1);
	int out = in-otr-vat;
	System.out.println("잔돈 : "+out);
			
			
}
}
