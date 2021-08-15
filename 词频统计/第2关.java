package step2;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;
public class StudentDemo{
	//返回一个Map集合来得到单词和首次出现的下标  key为单词名称  value为单词的角标
	public Map<String, Integer> getMap(String str){
		Map<String, Integer> map = new HashMap<String, Integer>();
		//对str进行分割   再加入map集合中
		//请在此添加实现代码
		/********** Begin **********/
		StringTokenizer strToken = new StringTokenizer(str, " ,?.!:;\"\"‘’\n");
		while(strToken.hasMoreTokens()){
			String tmp = strToken.nextToken();
			map.put(tmp, str.indexOf(tmp));
		}
		/********** End **********/
		return map;
	}

}
