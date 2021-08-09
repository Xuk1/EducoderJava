package step3;

import java.io.File;
import java.util.Arrays;

public class Task {

  public static void main(String[] args) {
    Task task = new Task();
    Scanner sc = new Scanner(System.in);
    String dir= sc.next();
    File file = new File(dir);
    task.showDirStructure(file);
  }
	
	/********** Begin **********/
	public void showDirStructure(File file){
		showDir(0, file);
	}

	public void showDir(int indent, File file){     //缩进量和文件
		if(file.isDirectory()){
			for(int i = 0; i < indent; i++){
				System.out.print("  ");
			}
			System.out.println("+--" + file.getName());
			File[] files = file.listFiles();
			Arrays.sort(files);
			for(int j=0; j<files.length; j++){
				showDir(indent+1, files[j]);
			}
		}else{
			for(int i = 0; i < indent; i++){
				System.out.print("  ");
			}
			System.out.println("--" + file.getName());
		}
	}
	/********** End **********/
}
