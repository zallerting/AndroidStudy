public class StaticTest {
	public static void main(String args [] ) {
		Static1.i = 20;
		
		Static1 s1 = new Static1();
		Static1 s2 = new Static1();
		// ��̬��������ͬһ��
		Static1.i = 10;
		System.out.println("s1��iֵΪ" + s1.i);
		System.out.println("s2��iֵΪ" + s2.i);
		Static1.i = 20;
		System.out.println("s1��iֵΪ" + s1.i);
		System.out.println("s2��iֵΪ" + s2.i);
		
		// ͨ���������þ�̬����
		Static1.fun();
	}
}