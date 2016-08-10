class AbstractTest {
	public static void main(String args []) {
		// 抽象类无法进行实例化，即无法创建对象
		// Abstract a = new Abstract();
		
		// 向上转型
		Abstract a = new AbstractTest2();
		a.eat();
	}
}