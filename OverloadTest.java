class OverloadTest {
	public static void main(String args []) {
		// �������󲢵��ù��캯��
		Overload o = new Overload();
		// �������󲢵��ù��캯��
		Overload o2 = new Overload(27, "������");
		System.out.println(o2.age + o2.name);
		// �������вι��캯��ʱ��ϵͳ�������ٴ��ڱ���ʱָ���޲ι��캯��
		Overload o3 = new Overload();
		
		// ���÷���
		o.funA();
		// �������ط���
		o.funA(100);
		// �������ط���
		o.funA(100, 1.0);
	}
}