package Chapter11;

//Thingインターフェースを継承、Assetクラスを継承
public abstract class TangibleAsset extends Asset implements Thing{
	String color;
	double weight;
	//コンストラクタ
	public TangibleAsset(String name, int price, String color, int weight) {
		super(name, price);
		this.color = color;
		this.weight = weight;
	}
	
	public String getColor() {return this.color;}
	//Thingインターフェースの抽象メソッドをオーバーライド
	public double getWeight() {return this.weight;}
	public void setWeight(double weight) {this.weight = weight;}
}
