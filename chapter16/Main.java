package chapter16;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(h1);
		heroes.add(h2);
		for(Hero h: heroes) {
			System.out.println(h.getName());
		}
		
		Map<Hero, Integer> mapHeroes = new HashMap<Hero, Integer>();
		mapHeroes.put(h1, 3);
		mapHeroes.put(h2, 7);
		//keySet()でキーの一覧を取得(この場合h1, h2)
		for(Hero key: mapHeroes.keySet()) {
			//valueにハッシュの値を代入
			int value = mapHeroes.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}
	}
	
	
}
