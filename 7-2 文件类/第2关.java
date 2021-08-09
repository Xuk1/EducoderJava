package step2;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;


public class Task {
	public static void dcFile() throws IOException {
		/********* Begin *********/
		File dir = new File("src/test2");
		dir.mkdir();      //创建目录
		File file = new File("src/output/test2.txt");
		file.delete();      //删除文件
		File f1 = new File("src/test2/helloworld.txt");
		f1.createNewFile();     //创建文件
		File f2 = new File("src/test2/step2.txt");
		f2.createNewFile();     //创建文件

		File d1 = new File("src/output");
		File[] files_1 = d1.listFiles();
		Arrays.sort(files_1);     //排序
		System.out.println("output目录结构为：");
		for(File files : files_1){
			System.out.println(files.getName());
		}
		
		File d2 = new File("src/test2");
		File[] files_2 = d2.listFiles();
		Arrays.sort(files_2);
		System.out.println("test2目录结构为：");
		for(File files : files_2){
			System.out.println(files.getName());
		}
		/********* End *********/
	}
}
