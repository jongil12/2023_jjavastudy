package day19com.ict.edu;

public class Ex04_Cat implements Runnable{
@Override
public void run() {
while (true) {
	//3초간 대기 상태
	try {
	Thread.sleep(1000*3);
} catch (InterruptedException e) {
	e.printStackTrace();
}
System.out.println("야~~옹~~");
}
}
}

