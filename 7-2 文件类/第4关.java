package step4;

import java.io.File;
import java.io.FileFilter;
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
	public void showDirStructure(File file)	{
		showPics(0, file);
	}
	
	public void showPics(int indent, File file){
		FileFilter filter = f -> {
			if(f.isFile()){
				String filename = f.getName().toLowerCase();
				if(filename.endsWith(".jpg") || filename.endsWith(".png") || filename.endsWith(".bmp")){
					return true;
				}
			}else if(f.isDirectory()){
				return true;
			}
			return false;
		};
		if(file.isDirectory()){
			for(int i=0; i<indent; i++){
				System.out.print("  ");
			}
			System.out.println("+--" + file.getName());
			File[] files = file.listFiles(filter);
			Arrays.sort(files);
			for(int j=0; j<files.length; j++){
				showPics(indent+1, files[j]);
			}
		}else{
			for(int i=0; i<indent; i++){
				System.out.print("  ");
			}
			System.out.println("--" + file.getName());
		}
	}
	/********** End **********/
}
