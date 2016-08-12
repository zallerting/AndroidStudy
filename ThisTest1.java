public class ThisTest1 {
	String name;
	int age;
	String location;
	
	ThisTest1() {
		System.out.println("零个参数的构造函数");
	}
	ThisTest1(String name) {
		this.name = name;
		System.out.println("一个参数的构造函数");
	}
	ThisTest1(String name, int age, String location) {
		// 必须放在首行，调用本类ThisTest1(String name)构造函数
		this(name);
		this.age = age;
		this.location = location;
		System.out.println("三个参数的构造函数");
	}
	
	void toDesc() {
		System.out.println("我的名字是"+ this.name);
	}
}