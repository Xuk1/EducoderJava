package step2;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {
	
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//获取输入的数据并添加至集合
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList<>();
        int length = sc.nextInt();
		for(int i =0 ; i< length; i++){
			list.add(sc.next());
		}
		/********** Begin *********/
		list.remove(0);
		list.remove(length-2);
		list.add("hello");
		list.add("educoder");
		list.set(2, "list");
		for(int i=0; i<length; i++){
			System.out.println(list.get(i));
		}
		/********** End **********/
	}
}
