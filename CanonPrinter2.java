// �ô�ӡ��Ϊ��ʽ��ӡ��
class CanonPrinter2 implements Printer2 {
	// ��дʵ�ֽӿڵķ���
	public void open() {
		System.out.println("CANON OPEN");
	}
	
	public void print() {
		System.out.println("CANON PRINT");
	}
	
	public void close() {
		this.clean();
		System.out.println("CANON CLOSE");
	}
	
	void clean() {
		System.out.println("CANON CLEAN");
	}
}