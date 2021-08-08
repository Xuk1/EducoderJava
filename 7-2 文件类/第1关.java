package step1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Scanner;

public class Task {
	/********* Begin *********/
	public void solution() throws IOException{
		try {
			File f1 = new File("hello.txt");
			f1.createNewFile();
			System.out.println("hello.txt文件创建成功");
			File f2 = new File("test.txt");
			f2.createNewFile();
			System.out.println("test.txt文件创建成功");
		} catch (IOException e){
			e.printStackTrace();
		}
		/********* End *********/
	}
}
