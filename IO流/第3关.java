package step3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task {
	
	public void task() throws IOException{
		/********* Begin *********/
		FileReader fr = new FileReader("src/step3/input/input.txt");
		char[] cbuf = new char[8];
		fr.read(cbuf);
		FileWriter fw = new FileWriter("src/step3/output/output.txt");
		fw.write(cbuf);
		fw.flush();
		fw.close();
		fr.close();
		/********* End *********/		
	}
}
