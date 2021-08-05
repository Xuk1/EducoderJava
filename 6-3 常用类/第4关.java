package case4;

//密码的自动生成器：密码由大写字母/小写字母/数字组成，生成六位随机密码
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		// 定义一个字符型数组
		char[] pardStore = new char[62];
		// 把所有的大写字母放进去 把所有的小写字母放进去 把0到9放进去
		/********* Begin *********/
		for (int i = 0; i < pardStore.length; i++) 
		{
			if(i < 26)
				pardStore[i] = (char)('A' + i);
			else if(i < 52)
				pardStore[i] = (char)('a' + (i-26));
			else
				pardStore[i] = (char)('0' + (i - 52));
			//System.out.print(pardStore[i]);
		}
		/********* End *********/
		// 分别以1、2、3作为种子数 生成6位随机密码
		Scanner sc = new Scanner(System.in);
		int seed = sc.nextInt();
		/********* Begin *********/
		Random rand =  new Random(seed);
		for(int i = 0; i < 6; i++){
			int k = rand.nextInt(62);
			System.out.print(pardStore[k]);
		}
		System.out.print("\n");
		/********* End *********/
	}
}
