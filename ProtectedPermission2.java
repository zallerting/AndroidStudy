import com.zallerting.ProtectedPermission;
// �������͸��಻��ͬһ�������У��������޷��̳е����൱�е�defaultȨ�޵ĳ�Ա�����ͳ�Ա����(������)
// �������͸��಻��ͬһ�������У�������Լ̳е����൱�е�defaultȨ�޵ĳ�Ա�����ͳ�Ա������������Ȩ�޲������޷�ʹ��
// protectedȨ������ӵ�к�defaultһ���Ĺ��ܣ����Ǹ�Ȩ��ֻ�����γ�Ա�����ͳ�Ա������ֻ��������Է���ʹ�á�
class ProtectedPermission2 extends ProtectedPermission {
	void introduce() {
		System.out.println("�ҵ�������" + name + ", �ҵ�������" + age);
	}
	public static void main(String args []) {

	}
}