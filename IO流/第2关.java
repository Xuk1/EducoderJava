package step2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task {
	
	public void task() throws IOException{
		/********* Begin *********/
		File f1 = new File("src/step2/input/task.txt");
		FileInputStream s1 = new FileInputStream(f1);
		byte[] b1 = new byte[8];
		s1.read(b1);
		String output = new String(b1, "UTF-8");
		System.out.println(output);
		s1.close();

		File dir = new File("src/step2/output");
		dir.mkdir();
		FileOutputStream out = new FileOutputStream("src/step2/output/output.txt");
		String input = "learning practice";
		byte[] b2 = input.getBytes();
		out.write(b2);
		out.flush();
		out.close();
		/********* End *********/
	}
	
}
