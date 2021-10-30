package Chapter10;

public class Main {
	public static void main(String[] args) {
		PoisonMatango m1 = new PoisonMatango('A');
		Hero h1 = new Hero();
		
		m1.attack(h1);
		
		System.out.println("勇者の残りHPは" + h1.hp);
	}
}
