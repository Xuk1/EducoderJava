package step1;

//请在此添加实现代码
/********** Begin **********/
public class ThreadClassOne extends Thread{
    private String name;
    public ThreadClassOne(){
        super();
        this.name = name;
    }
    public void run(){
        for(int i=0; i<11; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
/********** End **********/

//请在此添加实现代码
/********** Begin **********/
public class ThreadClassTwo implements Runnable{
    private String name;
    public ThreadClassTwo(){
        super();
        this.name = name;
    }
    public void run(){
        for(int i=0; i<11; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
/********** End **********/

public class Test {
	public static void main(String[] args) {
		ThreadClassOne t1 = new ThreadClassOne();
		
		if(t1 instanceof Thread){
			System.out.println("ThreadClassOne线程定义正确");
		}else{
			System.out.println("ThreadClassOne线程定义有误，该类需要继承Thread");
		}
		
		ThreadClassTwo t2 = new ThreadClassTwo();
		if(t2 instanceof Runnable){
			System.out.println("ThreadClassTwo线程定义正确");
		}else{
			System.out.println("ThreadClassTwo线程定义有误，该类需要实现Runnable接口");
		}
		t1.run();
		t2.run();
	}
}
