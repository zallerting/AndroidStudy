class Overload {
	int age;
	String name;
	// �������캯��
	//Overload() {
	//	System.out.println("���ǹ��캯��");
	//}
	// �������캯��
	Overload(int a, String n) {
		age = a;
		name = n;     
	}
	// ��������funA
	void funA() {
		System.out.println("û�в�����funA����");
	}
	// �������ط���funA
	void funA(int i) {
		System.out.println("��1��������funA����");
	}
	// �������ط���funA
	void funA(int i, double a) {
			System.out.println("��2��������funA����");
	}
}