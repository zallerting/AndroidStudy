class PrinterTest {
	public static void main(String args []) {
		// ����ת��
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