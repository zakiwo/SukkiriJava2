
public class Chapter5 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		incArray(array);
		for(int a: array) {
			System.out.println(a);
		}
		introduceOneself("ホンダ", 18, 175.3, '虎');
		email("こんにちは", "honda@gmail.com", "元気ですか？");
		email("honda@gmail.com", "元気ですか？");
		double triangleArea = calcTriangleArea(10.0, 5.0);
		double circleArea =  calcCircleArea(5.0);
		System.out.println("三角形の面積は" + triangleArea + "で、円の面積は" + circleArea);
	}
	
	public static void incArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void introduceOneself(String name, int age, double height, char zodiac) {
		System.out.println("名前は" + name + "で、年齢は" + age + "歳、干支は" + zodiac + "です");
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println(title);
		System.out.println(text);
	}
	
	//emailメソッドのオーバーロード
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println(text);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height /2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}
