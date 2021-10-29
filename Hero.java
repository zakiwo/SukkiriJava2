
public class Hero {
	String name;
	int hp;
	public void attack() {
		
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	public void sit(int sit) {
		this.hp += sit;
		System.out.println(this.name + "は、" + sit + "秒座った！");
		System.out.println("HPが" + sit + "ポイント回復した");
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+ this.hp + "でした");
	}
}
