package day11.com.ict.edu;

public class Ex_AnimalTest {
	public static void main(String[] args) {
		// 객체 생성
		Ex05_Animal animal = new Ex05_Animal();

		// 이름 큰뿔소 변경
		animal.setName("큰뿔소");

		// 나이는 3살
		animal.setAge(3);
		// 생존여보는 : 살았다
		animal.setLive(true);

		// 결과 출력
		// System.out.println("이름 : " + animal.setName());
		String m1 = animal.setName();
		System.out.println("이름 : " + m1);

		int m2 = animal.setAge();
		System.out.println("나이 : " + m2);

		boolean m3 = animal.setLive();
		if (m3) {
			System.out.println("생사여부 : 살았음");
		} else {
			System.out.println("생사 여부 : 죽었음");
		}
		System.out.println("=================");
		// 이름을 펭귄, 나이를 1, 생존여부 살아있음 으로 변경
		animal.setName("펭귄");
		animal.setAge(1);
		animal.setLive();

		// 결과 출력

		String p1 = animal.setName();
		System.out.println("이름 : " + p1);

		int p2 = animal.setAge();
		System.out.println("나이 : " + p2);

		boolean p3 = animal.setLive();
		if (p3) {
			System.out.println("생사여부 : 살았음");
		} else {
			System.out.println("생사여부 : 죽었음");
			
		}
		System.out.println("==============");
		
		animal.play(false, 14, "개똥이");
		animal.prn();
		
		System.out.println("===============");
		animal.play("까치", 14, true);
		animal.prn();
	}
}
