package step1;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class StudentDemo{
	//使用String.split()方法分割
	public List<String> splitPartition(String str){
		List<String> list=new ArrayList<String>();
		//请在此添加实现代码
		/********** Begin **********/
		String[] str3 = str.split("\\|");
		for(int i=0; i<str3.length; i++){
			list.add(str3[i]);
		}
		/********** End **********/
		return list;
	}

	//使用StringTokenizer类进行分割
	public List<String> tokenPartition(String str){
		List<String> list=new ArrayList<String>();
		//请在此添加实现代码
		/********** Begin **********/
		StringTokenizer strToken = new StringTokenizer(str, "\\?");
		while(strToken.hasMoreTokens()){
			list.add(strToken.nextToken());
		}
		/********** End **********/	
		return list;
	}

}
