public class ThisTest2 {
	public static void main(String args []) {
		ThisTest1 tt1 = new ThisTest1();
	    tt1.name = "¶¡ÕýÁú";
		tt1.toDesc();
		
		ThisTest1 tt2 = new ThisTest1("²Ü·É·É");
		tt2.toDesc();
		
		ThisTest1 tt3 = new ThisTest1("¶¡Ð¡±¦", 100, "À¥É½");
		tt3.toDesc();
		
	}
}