package day15.com.ict.edu4;

public class Zerg implements Unit{
	private String name ;
	private int energe;
	private boolean fiy ;
	public Zerg () {}
	
	
	public Zerg(String name, int energe, boolean fiy) {
		super();
		this.name = name;
		this.energe = energe;
		this.fiy = fiy;
	}
	//공격을 받으면 에너지가 떨어진다.(에너지가 15 떨어진다.)
	public void decEnergy() {
		energe = energe - 15;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEnerge() {
		return energe;
	}


	public void setEnerge(int energe) {
		this.energe = energe;
	}


	public boolean isFiy() {
		return fiy;
	}


	public void setFiy(boolean fiy) {
		this.fiy = fiy;
	}
	

}
