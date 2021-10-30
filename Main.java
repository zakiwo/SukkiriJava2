
public class Main {
	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		h.hp = 100;
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		Cleric c1 = new Cleric();
		c1.name = "イエス";
		c1.hp = 40;
		c1.mp = 6;
		
		System.out.println("勇者" + h.name + "を生み出しました");
		h.sit(5);
		h.slip();
		h.sit(25);
		m1.run();
		m2.run();
		h.run();
		
//		c1.selfAid();
//		c1.pray(3);
		
		Wizard w1 = new Wizard();
		w1.name = "魔道士";
		w1.hp = 50;
		
		w1.heal(h);
		
		Hero h2 = new Hero("けんた");
		System.out.println("HPの初期設定は" + h2.hp);
		System.out.println("名前は" + h2.name);
	}
}
