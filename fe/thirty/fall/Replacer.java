package fe.thirty.fall;
import java.util.List;
import java.util.Map;

public class Replacer implements Fragment{
	final String key;
	
	Replacer(CharSequence cs){key = cs.toString();}
	
	public String replace(Map<String, List<String>> table) {  // tableは置換表
		return String.join("\n", table.get(key));   //改行して置換して表示
	}
}
