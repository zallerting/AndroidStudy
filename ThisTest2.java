public class ThisTest2 {
	public static void main(String args []) {
		ThisTest1 tt1 = new ThisTest1();
	    tt1.name = "������";
		tt1.toDesc();
		
		ThisTest1 tt2 = new ThisTest1("�ܷɷ�");
		tt2.toDesc();
		
		ThisTest1 tt3 = new ThisTest1("��С��", 100, "��ɽ");
		tt3.toDesc();
		
	}
}