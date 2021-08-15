package step3;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;
public class StudentDemo{
	//获取单词的数量
	public Map<String, Integer> getWordCount(String str) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//请在此添加实现代码
		/********** Begin **********/
		StringTokenizer strToken = new StringTokenizer(str);
		int count = 0;
		while(strToken.hasMoreTokens()){
			String word = strToken.nextToken(" ,;.!?‘’");
			if(map.containsKey(word)){
				count = map.get(word);
				map.put(word, count+1);
			} else{
				map.put(word, 1);
			}
		}
		/********** End **********/
		return map;
	}
}
