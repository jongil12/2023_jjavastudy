package day15.com.ict.edu4;

public class Protoss implements Unit {
	private String name ;
	private int energy ;
	private boolean fiy ;

	
	public Protoss() {}
	
	public Protoss(String name, int energy, boolean fiy) {
		super();
		this.name = name;
		this.energy = energy;
		this.fiy = fiy;
	}
	
	//공격을 받으면 에너지가 떨어진다.(에너지가 10 떨어진다.)
	@Override
	public void decEnergy() {
		energy = energy -10;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public boolean isFiy() {
		return fiy;
	}

	public void setFiy(boolean fiy) {
		this.fiy = fiy;
	}

	
}
