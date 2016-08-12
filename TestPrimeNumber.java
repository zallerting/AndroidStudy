/* public class TestPrimeNumber {
	public static void main(String args []) {
		for(int i = 100; i <= 200; i++) {
			boolean isNotPrime = false;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isNotPrime = true;	
				}
			}
			if(isNotPrime == false) {
				System.out.println("PrimerNumber: " + i);
			}
		}	
	}
} */

public class TestPrimeNumber {
	public static void main(String args []) {
		for(int i = 100; i <= 200; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					break;
				}
				else if(j == i - 1) {
					System.out.println(i);
				}
			}
		}
	}
}