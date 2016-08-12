public class Test {
	public static void main(String args []) {
		int i = 5;
		boolean e = i > 6 & i++ > 7;
		boolean f = i > 6 && i++ > 7;
		System.out.println(e);
		System.out.println(i);
		
	}
}