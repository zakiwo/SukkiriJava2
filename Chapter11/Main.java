package Chapter11;

public class Main {
	public static void main(String[] args) {
		Book b = new Book("参考書", 1000, "黒", "9000000", 900);
		Computer c = new Computer("MacBook", 100000, "スペースグレイ", "Apple", 5000);
		System.out.println(c.getMakerName());
		System.out.println(b.getName());
		System.out.println(b.getWeight());
	}
}
