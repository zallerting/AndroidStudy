class Inherit {
	String name;
	int age;
	String address;
	
	void eat() {
		System.out.println("吃饭");
	}
	
	void introduce() {
		System.out.println("我的姓名是" + this.name + ", 我的年龄是" + this.age + ", 我的家在" + this.address);
	}
	
}