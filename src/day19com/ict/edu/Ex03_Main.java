package day19com.ict.edu;

public class Ex03_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		Ex03_Cat cat = new Ex03_Cat();
		Ex03_Dog dog = new Ex03_Dog();

		// Runnable을 start 메서드를 가지고 있지 않으므로 올 ㅠ발샹
		// cat.start();
		System.out.println("main : " + Thread.currentThread().getName());

		Thread thread = new Thread(dog);
		thread.start();

		// Thread thread2 = new Thread(cat);
		// thread2.start();

		// 익명
		new Thread(cat).start();

		// 익명 : new 클래스(인터페이스 i ) ;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println("AAAAAAAAAA" + Thread.currentThread().getName());
				}
			}
		}).start();
		;

		System.out.println("main : " + Thread.currentThread().getName());
	}
}
