package chapter13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("魔法使いに設定されようとしている値が異常です");
		}else {
			this.name = name;
		}
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException("設定されようとしているMPの値が異常です");
		}
		this.hp = mp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		}else {
			this.hp = hp;
		}
	}
	
	public Wand getWand() {
		return this.wand;
	}
	
	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("設定されようとしている杖がnullです");
		}else {
			this.wand = wand;
		}
	}
}
