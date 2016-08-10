class Static1 {
	// 静态变量，是类层次的
	static int i;
	// 非静态变量
	String name;
	
	// 静态函数
	static void fun() {
		System.out.println("静态函数");
		// 无法从静态上下文调用非静态变量
		//System.out.println("My name is " + name);
	}
	
	// 静态代码块，初始化静态变量
	static {
		System.out.println("静态代码块");
	}
	
}