package chapter17;

public class Main {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		}catch (NullPointerException e) {
			System.out.println("NullPointerException例外をCatchしました");
			System.out.println("スタックトレース始まり-------");
			e.printStackTrace();
			System.out.println("スタックトレース終わり-------");
		}
		
	}
}
