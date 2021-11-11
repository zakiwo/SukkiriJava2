package Chapter11;

public class Computer extends TangibleAsset{
	String makerName;
	
	public Computer(String name, int price, String color, String makerName, int weight) {
		super(name, price, color, weight);
		this.makerName = makerName;
	}
	
	public String getMakerName() {return this.makerName;}
}
