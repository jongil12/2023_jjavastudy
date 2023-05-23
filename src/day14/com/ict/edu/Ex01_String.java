package day14.com.ict.edu;

public class Ex01_String {
	public static void main(String[] args) {
		String s1 = "ictedu";
		String s2 = "ictedu";
		String s3 = new String("ictedu");
		String s4 = new String("ictedu");
		char[] ch = {'i','c','t','e','d','u'};
		String s5 = new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println();
		
		//비교 했을때 문자열을 비교하는 것이 아니라 주소값을 비교하기때문에
		//를 보여 주는 예 이다.(생성자 s3, s4, s5 는 다른 주소값을 갖는다)
		if (s1 == s2) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다.");
		}
		if (s1 == s3) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다.");
		}
		if (s1 == s4) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다.");
		}
		if (s1 == s5) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다.");
		}
		System.out.println();
		
		//equals() : 입력된 주소값의 내용이 같냐 물어보는것이다.
		if (s1.equals(s2)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다.");
		}
		if (s1.equals(s3)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다.");
		}
		if (s1.equals(s4)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다.");
		}
		if (s1.equals(s5)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다.");
		}
		System.out.println();
		
		//위에 보면 s1 과 s2는 같은 주소값을 가지고 있는데 s1 월 변호시켰을때
		//s2는 변하지 않는 이유는 s1 에 +로 값이 추가될경우 다른 메모리에 저장되기에
		//같은 주소가 아니다
		s1 = s1 + " 대한민국";
		System.out.println(s1);
		System.out.println(s2);
		if (s1 == s2) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다.");
		}
	}

}
