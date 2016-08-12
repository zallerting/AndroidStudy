class OverloadTest {
	public static void main(String args []) {
		// 创建对象并调用构造函数
		Overload o = new Overload();
		// 创建对象并调用构造函数
		Overload o2 = new Overload(27, "丁正龙");
		System.out.println(o2.age + o2.name);
		// 当定义有参构造函数时，系统将不会再次在编译时指定无参构造函数
		Overload o3 = new Overload();
		
		// 调用方法
		o.funA();
		// 调用重载方法
		o.funA(100);
		// 调用重载方法
		o.funA(100, 1.0);
	}
}