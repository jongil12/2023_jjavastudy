package day19com.ict.edu;

public class Ex02_Cat extends Thread{
//	public void start() {
//		for(int i = 0; i<20; i++) {
//			System.out.println("야~~옹~~~"+ Thread.currentThread().getName());
//		}}
//	
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
		System.out.println("야~~옹~~~"+ Thread.currentThread().getName());
	}
	}

}
