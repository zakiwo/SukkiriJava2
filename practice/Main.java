package practice;

public class Main {
	public static void main(String[] args) {
		System.out.println(Season.SPRING.name());
		System.out.println(Season.SUMMER.ordinal());
		System.out.println(Season.valueOf("AUTUMN"));
		
		Season[] seasons = Season.values();
		for(Season season: seasons) {
			System.out.println(season);
		}
	}
}
