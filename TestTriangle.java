//     *
//    * *
//   * * *
//  * * * *

import java.util.Scanner;

public class TestTriangle {
	public static void main(String args []) {
		// �Ӽ��̻�ȡ����ֵ
		Scanner sc = new Scanner(System.in);
		double lineNum = sc.nextDouble();
		for(int i = 1; i < lineNum+1; i++) {
			// ��i���ȴ�ӡlineNum-1���ո�
			for(int k = i; k < lineNum; k++) {
				System.out.print(" ");
			}
			// ��i�н��Ŵ�ӡi��"* "�ַ�
			for(int j = 1; j < i+1; j++) {
				System.out.print("* ");				
			}
			System.out.println("\n");
		}
	}
}