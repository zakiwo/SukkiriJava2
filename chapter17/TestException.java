package chapter17;

import java.io.FileWriter;
import java.io.IOException;

public class TestException {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		}catch(IOException e) {
			System.out.println("エラーが発生しました");
		}finally {
			if(fw != null) {
				try {
					fw.close();
				}catch(IOException e){
					;
				}
			}
		}
	}
}
