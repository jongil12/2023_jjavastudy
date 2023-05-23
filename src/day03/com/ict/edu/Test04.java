package day03.com.ict.edu;

public class Test04 {
	public static void main(String[] args) {
		//카페모카 6500이다.
		//친구와 둘이서 15000을 내고 주문했다.
		//잔돈은 얼마 인가 (단, 부가세 10%포함)
		int won = 15000;
		int cfm = 6500;
	    int sm = (int) (6500*0.1);
	    int cfm2 = cfm+cfm;
		int sm2 = sm+sm;
		System.out.println(won-cfm-sm+ "원");
		System.out.println(won-cfm2-sm2 + "원");
		// 위에 내가한거 아래 해설
		String coff = "카페모카";
		int dan = 6500;
		int su = 2 ;
		int in = 15000;
		// 부가세를 구하기 위해서 총 금액을 구하자
		int total = dan * su ;
		
		//아래 둘중 하나만 사용하자
		int vat = total /10 ;  
		int vat2 = (int) (total *0.1);
		int out = in - (total +vat);
		System.out.println("잔돈 : " + out);
		
		// 위 정보를 한번이 처리하는 방법
		int out2 = in - (int)(total *1.1);
		System.out.println("잔돈 : " + out2);
		
		
	}
}
