package day14.com.ict.edu;

import java.util.StringTokenizer;

public class Ex02_StringBuffer {
public static void main(String[] args) {
	// 문자열을 추가할때 사용(메모리 주소가 변경되지 않는다.)
	// 추가할 때 append() 메소드 사용
	// toString() => String 전환한다
	StringBuffer sb = new StringBuffer("ictedu");
	//추가
	sb.append(" 대한민국");
	
	System.out.println(sb);
	System.out.println(sb.toString());
	
	//StringTokenizer : 구분자를 이용해서 문자열 분리.(split 과 비슷)
	//					구분자가 없으면(뛰어쓰가,"," )
	//nextToken()을 이용해서 문자열 분리
	
	//split(String regex) : String[]
	//split(String regex, int limit : String[]
	//regex => 구분자(나눌 기준), limit => 배열의 크기(방의 갯수)

	String str = "사과, 바나나, 망고, 오렌지, 수박";
	//구분자 없음 (뛰어쓰기, 탭, 줄바꾸기)
	StringTokenizer st =new StringTokenizer(str);
	while(st.hasMoreElements()) { //엘리먼트가 요소이다 다음요소가 있니? 라고 물어보는거다
		String res = st.nextToken();
		System.out.println(res);
	}
	
	System.out.println();
	str = "사과,바나나,망고,오렌지,수박";
	//구분자 있음, 
	//split과 다른 점은 크기지정 못함
	StringTokenizer st2 =new StringTokenizer(str,",");
	while(st2.hasMoreElements()) { //엘리먼트가 요소이다 다음요소가 있니? 라고 물어보는거다
		String res = st2.nextToken();
		System.out.println(res);
	}
	System.out.println();
	
	//추천
	String[] arr = str.split(",");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
}
}
