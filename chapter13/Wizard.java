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
		this.name = name;
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public void setMp(int mp) {
		this.hp = mp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public Wand getWand() {
		return this.wand;
	}
	
	public void setWand(Wand wand) {
		this.wand = wand;
	}
}
