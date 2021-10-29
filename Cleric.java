
import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	
	public void selfAid() {
		this.hp = this.MAXHP;
		this.mp -= 5;
		System.out.println("HPが全回復した");
	}
	
	public int pray(int sec) {
		int recover = new Random().nextInt(3) + sec;
		// 実際の回復量（Math.minで引数の最小値）
		int recoverActual = Math.min(this.MAXMP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
		
	}
	
}
