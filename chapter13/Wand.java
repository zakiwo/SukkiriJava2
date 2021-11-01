package chapter13;

public class Wand {
	private String name;
	private double power;
	
	public  double getPower() {
		return this.power;	
	}
	
	public void setPower(double power) {
		if(power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("杖に設定されようとしている魔力が異常です");
		}
		this.power = power;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
