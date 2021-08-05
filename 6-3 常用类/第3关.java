package case3;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// String substring(int start,int end)
        // 截取字符串，传入的两个参数分别为要截取边界的下标
        // 在java api 中,通常使用两个数字表示范围时,都是含头不含尾,即包含起始下标对应的内容,但不包含结束下标的处对应的内容
        // String toUpperCase() 将当前字符串中的英文部分转换为全大写
		/********* Begin *********/
		int p1 = str.indexOf(".");
		str = str.substring(p1+1);
		int p2 = str.indexOf(".");
		String str1 = str.substring(0, p2);
		System.out.println(str1);
		System.out.println(str1.toUpperCase());
		/********* End *********/
	}
}
