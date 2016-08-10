class SubInstantiate {
	String name;
	int age;
	
	SubInstantiate() {
		System.out.println("SubInstantiate的无参数构造函数");
	}
	SubInstantiate(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("SubInstantiate的有参数构造函数");
	}
	
	void eat() {
		System.out.println("吃饭");
	}
}