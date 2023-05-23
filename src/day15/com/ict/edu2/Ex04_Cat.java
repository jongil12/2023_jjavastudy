package day15.com.ict.edu2;

public class Ex04_Cat extends Ex04_abstract{
	String name ="나비";
@Override
public void sound() {
	System.out.println("야용");
	
}
@Override
	public void play() {
		System.out.println("들에서 놀기");
	}
public String getName() {
	return name;
}
}
