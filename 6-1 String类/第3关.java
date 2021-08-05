package step3;

public class HelloWorld {

	public void judge(String fileName,String email){
		String s1 = "java";
		String s2 = "@";
		String s3 = ".";
	/************先判断fileName************/
		//先找.的位置
		int p1 = fileName.lastIndexOf(s3);
		//再找java的位置
		int p2 = fileName.lastIndexOf(s1);
		//判断
		if(p1 > p2 || p1 == 0 || p1 == -1 || p2 == -1){
			System.out.println("Java文件名无效");
		}else{
			System.out.println("Java文件名正确");
		}
	/**************End***************/

	/************判断email************/
		//先找.的位置
		int p3 = email.lastIndexOf(s3);
		//再找@的位置
		int p4 = email.lastIndexOf(s2);
		//判断
		if(p3 < p4 || p3 == 0 || p3 == -1 || p4 == -1){
			System.out.println("邮箱名无效");
		}else{
			System.out.println("邮箱名正确");
		}
	/**************End***************/
	}
}
