class OverrideTest2 {
	public static void main(String args []) {
		OverrideTest ot = new OverrideTest();
		ot.name = "������";
		ot.age = 27;
		ot.address = "��ɽ";
		ot.introduce();
		
		Override o = new Override();
		o.name = "����";
		o.age = 20;
		o.introduce();
		
		// ����ת�ͣ�������󸳸���������
		Override o2 = ot;
		// һ�������ܵ�����Щ��Ա(����)��ȡ����������õ����ͣ�
		o2.name = "������";
		o2.age = 27;
		// o2.address = "��ɽ";
		// һ�������ܹ�������һ��������ȡ�������������ָ��Ķ���
		o2.introduce();
		// o2.study();
		
		// ����ת��(������ת��������ת��)
		Override o3 = new OverrideTest();
		OverrideTest ot3 = (OverrideTest)o3;
		// ���������ת��
		// Override o4 = new Override();
		// OverrideTest ot4 = (OverrideTest)o4;
	}
}