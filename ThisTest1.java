public class ThisTest1 {
	String name;
	int age;
	String location;
	
	ThisTest1() {
		System.out.println("��������Ĺ��캯��");
	}
	ThisTest1(String name) {
		this.name = name;
		System.out.println("һ�������Ĺ��캯��");
	}
	ThisTest1(String name, int age, String location) {
		// ����������У����ñ���ThisTest1(String name)���캯��
		this(name);
		this.age = age;
		this.location = location;
		System.out.println("���������Ĺ��캯��");
	}
	
	void toDesc() {
		System.out.println("�ҵ�������"+ this.name);
	}
}