package case3;

public class superTest {
	public static void main(String[] args) {
		// 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
		/********* begin *********/
		Student s = new Student("张三", 18);
		s.setName("张三");
		s.setAge(18);
		s.setSchool("哈佛大学");
		System.out.println("，学校：" + s.getSchool());
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

	public Person(String name, int age){
		System.out.print("姓名：" + name + "，年龄：" + age);
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

	public Student(String name, int age){
		super(name, age);
	}
	/********* end *********/
}
