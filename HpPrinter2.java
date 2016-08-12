// 该打印机为喷墨打印机
class HpPrinter2 implements Printer2 {
	// 复写实现接口的方法
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