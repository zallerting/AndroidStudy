class PrinterTest {
	public static void main(String args []) {
		// 向上转型
		Printer p1 = new HpPrinter();
		p1.open();
		p1.print();
		p1.close();

		Printer p2 = new CanonPrinter();
		p2.open();
		p2.print();
		p2.close();
		
		
	}
}