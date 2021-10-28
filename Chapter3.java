
public class Chapter3 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
		System.out.println("");
		}
		
		int isHungry = 0;
		String food = "ハンバーガー";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
		
		System.out.println("[メニュー]1:検索 2:登録 3:削除 4:変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}
	}
}
