// ���һ�δ��������������д���ģ���ô���﷨��ҲӦ�����д����
abstract class Printer {
	void open() {
		System.out.println("OPEN");
	}
	void close() {
		System.out.println("CLOSE");
	}
	//��������
	//�������޷�ȷ������ʵ�֣�ǿ�����ิд�ú���
	abstract void print();
}