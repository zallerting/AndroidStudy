// �ô�ӡ��Ϊ��ī��ӡ��
class HpPrinter2 implements Printer2 {
	// ��дʵ�ֽӿڵķ���
	public void open() {
		System.out.println("HP OPEN");
	}
	
	public void print() {
		System.out.println("HP PRINT");
	}
	
	public void close() {
		System.out.println("HP CLOSE");
	}
	
}