/*Task.java文件的代码*/
package step2;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Task {

	public void runThread(int num) {
    	//请在此添加实现代码
		/********** Begin **********/
		// 在这里开启线程 获取线程执行的结果
		ThreadCallable callable = new ThreadCallable(num);
		FutureTask<Integer> ft = new FutureTask<>(callable);
		new Thread(ft).start();
		try{
			System.out.println("线程的返回值为：" + ft.get());
		}catch(Exception e){
			e.printStackTrace();
		}
		/********** End **********/
	}
}

//请在此添加实现代码
/********** Begin **********/
/* 在这里实现Callable接口及方法 */
class ThreadCallable implements Callable<Integer>{
	int num;

	public ThreadCallable(){}

	public ThreadCallable(int num){
		this.num = num;
	}

	public Integer call() throws Exception{
		int[] Fibonacci = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368};
		int res = Fibonacci[num-1];
		return res;
	}
}
/********** End **********/
/*Task.java文件的代码*/

/*Test.java文件的代码*/
package step2;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import step2.ThreadCallable;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		ThreadCallable callable = new ThreadCallable();
		if(!(callable instanceof Callable)){
			System.out.println("未定义Callable线程，或者定义错误");
		}
		
		Task task = new Task();
		task.runThread(num);
		
	}
}
/*Test.java文件的代码*/
