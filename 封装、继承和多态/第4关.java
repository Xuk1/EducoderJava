package case4;

public class overridingTest {
	public static void main(String[] args) {
		// 实例化子类对象s，调用talk()方法打印信息
		/********* begin *********/
		Student s = new Student();
		s.setName("张三");
		s.setAge(18);
		s.setSchool("哈佛大学");
		s.talk(s.getName(), s.getAge(), s.getSchool());
		/********* end *********/
		
	}
}

class Person {
	/********* begin *********/
	private String name;
	private int age;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void talk(String name, int age){
		
	}
	/********* end *********/
}

class Student extends Person {
	/********* begin *********/
	private String school;

	public void setSchool(String school){
		this.school = school;
	}

	public String getSchool(){
		return school;
	}

	void talk(String name, int age, String school){
		System.out.println("我是：" + name + "，今年：" + age + "岁，我在" + school + "上学");
	}

	/********* end *********/
}
