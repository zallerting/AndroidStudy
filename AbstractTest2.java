// ������������������������ģ�
// AbstractTest2�̳г�����Abstract
class AbstractTest2 extends Abstract {
	String address;
	// AbstractTest2��Ĺ��캯��
	AbstractTest2() {
		// super();
		System.out.println("AbstractTest2�Ĺ��캯��");
	}
	AbstractTest2(String name, int age, String address) {
		super(name, age);
		this.address = address;
	}
	// ��д������Abstract�ĳ��󷽷�
	void eat() {
		System.out.println("�ÿ��ӳԷ�");
	}
}