// ��д(override) Ҳ����Ϊ���ǻ���д
// 1.�ھ��и��ӹ�ϵ�������൱��
// 2.f������������һ�������������������Ķ���(����ֵ���͡��������Ͳ����б�)��ȫ��ͬ
class OverrideTest extends Override {
	String address;
	
	// ���ิд�����Ա����
	void introduce() {
		// ���ø����Ա����
		super.introduce();
		System.out.println("�ҵļ���" + address);
	}
	void study() {

	}
}