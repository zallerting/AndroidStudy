abstract class Abstract {
	String name;
	int age;
	
	// ���������ӵ�г�����������ͨ��super����
	// Abstract�Ĺ��캯��
	Abstract() {
		System.out.println("Abstract�Ĺ��캯��");
	}
	Abstract(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void introduce() {
		System.out.println("�ҵ�������" + name + "���ҵ�������" + age);
	}
	// ���󷽷�
	abstract void eat();
}