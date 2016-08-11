class PrinterFactory {
	public static Printer2 getPrinter(int flag) {
		Printer2 printer2 = null;
		// ��װ���ִ�ӡ����
		if(flag == 0) {
			printer2 = new HpPrinter2();
		} 
		else if(flag == 1) {
			printer2 = new CanonPrinter2();
		}
		else if(flag == 2) {
			printer2 = new XXXPrinter2();
		}
		return printer2;
	}
}