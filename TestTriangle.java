//     *
//    * *
//   * * *
//  * * * *

import java.util.Scanner;

public class TestTriangle {
	public static void main(String args []) {
		// 从键盘获取行数值
		Scanner sc = new Scanner(System.in);
		double lineNum = sc.nextDouble();
		for(int i = 1; i < lineNum+1; i++) {
			// 第i行先打印lineNum-1个空格
			for(int k = i; k < lineNum; k++) {
				System.out.print(" ");
			}
			// 第i行接着打印i个"* "字符
			for(int j = 1; j < i+1; j++) {
				System.out.print("* ");				
			}
			System.out.println("\n");
		}
	}
}