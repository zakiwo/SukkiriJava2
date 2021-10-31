package Chapter12;

public class Main {
	public static void main(String[] args) {
		//Y型の配列を作成
		Y[] array = new Y[2];
		//Y型の配列にA,Bのインスタンスを挿入
		array[0] = new A();
		array[1] = new B();
		for(Y y: array) {
			y.b();
		}
	}
}
