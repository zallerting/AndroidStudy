// 该打印机为针式打印机
class CanonPrinter2 implements Printer2 {
	// 复写实现接口的方法
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