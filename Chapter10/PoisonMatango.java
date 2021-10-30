package Chapter10;

public class PoisonMatango extends Matango {
	int poisonCount = 5;
	
	public PoisonMatango(char suffix) {
		//親クラスのコンストラクタを呼び出し
		super(suffix);
	}
	
	public void attack(Hero h) {
		//親クラスのattackと同じ動作
		super.attack(h);
		
		if(this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp /5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			this.poisonCount--;
		}
	}
}
