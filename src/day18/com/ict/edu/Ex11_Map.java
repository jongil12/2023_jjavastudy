package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex11_Map {
	public static void main(String[] args) {
	//대한민국, 캐나다, 영국,  스위스의 수도가 각각 HashMap에 저장시키고
	//원하는 나라가 key 값이 되어, 화면에서 나라를 물어보면
	//수도가 출력되는 프로그램
//    내가한거
//	Scanner scan = new Scanner(System.in);
//	String su= "";
//	int su1 =0;
//	
//	HashMap<String, String> map = new HashMap<>();
//	map.put("대한민국", "서울");
//	map.put("캐나다", "오타와");
//	map.put("영국", "런던");
//	map.put("스위스", "베른");
//	
//	esc:
//	while (true) {
//	System.out.println("대한민국. 캐나다. 영국. 스위스 수도가 궁금한나라를 입력하시오");
//	su= scan.next();
//	System.out.println("입력하신 국가의 수도는"+map.get(su)+"입니다.");
//	System.out.println("계속할까요? 1.YES 2.NO");	
//	su1 = scan.nextInt();
//	if (su1==2) {
//		break;
//	}	
	Scanner scan = new Scanner(System.in);
	HashMap<String, String> map= new HashMap<>();
	map.put("대한민국", "서울");
	map.put("캐나다", "오타와");
	map.put("영국", "런던");
	map.put("스위스", "베른");
	
	Set<String> keys =map.keySet();
	esc:
		while (true) {
			System.out.println("나라입력 : ");
			String str = scan.next();
			if (keys.contains(str)) {
				String res = map.get(str);
				System.out.println(str + "의 수도는"+res+"입니다.");
			} else {
				System.out.println("데이터에 없는 나라 입니다.");
			}
			while (true) {
				System.out.println("계속할까요?(y/n) >>>");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
			}
		}		
		
	}// main
}// class
