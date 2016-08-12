// 抽象类天生就是用来做父类的；
// AbstractTest2继承抽象类Abstract
class AbstractTest2 extends Abstract {
	String address;
	// AbstractTest2类的构造函数
	AbstractTest2() {
		// super();
		System.out.println("AbstractTest2的构造函数");
	}
	AbstractTest2(String name, int age, String address) {
		super(name, age);
		this.address = address;
	}
	// 复写抽象父类Abstract的抽象方法
	void eat() {
		System.out.println("用筷子吃饭");
	}
}