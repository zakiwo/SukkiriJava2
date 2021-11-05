package chapter16;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArray {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(20);
		points.add(30);
		for(int i :points) {
			System.out.println(i);
		}
		
		//イテレータを使用
		Iterator<Integer> it = points.iterator();
		while(it.hasNext()) {
			int e = it.next();
			System.out.println(e);
		}
	}
}
