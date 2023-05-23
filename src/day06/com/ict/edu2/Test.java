package day06.com.ict.edu2;

public class Test {
	public static void main(String[] args) {

int time =10;
int lmit = 8;
int won = 9620;
int pay = 0;
if (time <= lmit) {
	pay = time*won;
	System.out.println("급여는"+pay+"원 입니다.");
} else {
	pay = lmit*won + (int) ((time-lmit)*won*1.5);
System.out.println("급여는"+pay+"원 입니다.");
}


		

	}
}
