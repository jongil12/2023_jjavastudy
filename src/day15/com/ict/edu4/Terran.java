package day15.com.ict.edu4;

public class Terran implements Unit{
	private String name ;
	private int energe;
	private boolean fiy ;
	public Terran () {}

	public Terran(String name, int energe, boolean fiy) {
		super();
		this.name = name;
		this.energe = energe;
		this.fiy = fiy;
	}
	//공격을 받으면 에너지가 떨어진다.(에너지가 10 떨어진다.)
			
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

	@Override
	public void decEnergy() {
		energe = energe - 10;
	}
	}
	

