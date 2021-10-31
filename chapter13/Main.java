package chapter13;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("ホンダ");
		h.setHp(100);
		Wizard wi = new Wizard();
		Wand wa = new Wand();
		wa.setPower(10);
		wi.setWand(wa);
		
		wi.heal(h);
		
		
	}
}
