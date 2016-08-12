public class StaticTest {
	public static void main(String args [] ) {
		Static1.i = 20;
		
		Static1 s1 = new Static1();
		Static1 s2 = new Static1();
		// 静态变量都是同一份
		Static1.i = 10;
		System.out.println("s1的i值为" + s1.i);
		System.out.println("s2的i值为" + s2.i);
		Static1.i = 20;
		System.out.println("s1的i值为" + s1.i);
		System.out.println("s2的i值为" + s2.i);
		
		// 通过类名调用静态函数
		Static1.fun();
	}
}