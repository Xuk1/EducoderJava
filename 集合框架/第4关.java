package step4;

import java.util.*;

public class HelloWorld {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//程序会输入三次数据
		/********** Begin **********/
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<3; i++){
			String tmp = sc.next();
			list.add(tmp);
		}
		for(int i=0; i<list.size(); i++){
			System.out.println("集合的第" + (i+1) + "个数据为：" + list.get(i));
		}
		/********** End **********/
	}
	
}
