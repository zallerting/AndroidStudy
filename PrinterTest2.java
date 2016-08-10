class PrinterTest2 {
	public static void main(String args []) {
		int flag = 2;
		// 简单静态工厂方法模式
		Printer2 printer2 = PrinterFactory.getPrinter(flag);
		printer2.open();
		printer2.print();
		printer2.close();
	}
}