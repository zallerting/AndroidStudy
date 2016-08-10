abstract class Abstract {
	String name;
	int age;
	
	// 抽象类可以拥有抽象函数，子类通过super调用
	// Abstract的构造函数
	Abstract() {
		System.out.println("Abstract的构造函数");
	}
	Abstract(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void introduce() {
		System.out.println("我的名字是" + name + "，我的年龄是" + age);
	}
	// 抽象方法
	abstract void eat();
}