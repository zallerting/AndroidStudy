class Overload {
	int age;
	String name;
	// 创建构造函数
	//Overload() {
	//	System.out.println("我是构造函数");
	//}
	// 创建构造函数
	Overload(int a, String n) {
		age = a;
		name = n;     
	}
	// 创建方法funA
	void funA() {
		System.out.println("没有参数的funA函数");
	}
	// 创建重载方法funA
	void funA(int i) {
		System.out.println("有1个参数的funA函数");
	}
	// 创建重载方法funA
	void funA(int i, double a) {
			System.out.println("有2个参数的funA函数");
	}
}