// 第一步骤 ：导入IO相关类；
import java.io.*;

class IOTest {
	public static void main(String args []) {
		// 第二步骤 ：申明输入输出流引用
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 第三步 ：生成代表输入输出流的对象
			fis = new FileInputStream("D:/AndroidDev/JavaStudy/IO/from.txt");
			fos = new FileOutputStream("D:/AndroidDev/JavaStudy/IO/to.txt");
			// 第四步 ：生成字节数组
			byte[] buffer = new byte[100];
			// 第五步 ：调用输入流的read方法，读取数据
			int tmp = fis.read(buffer, 0, buffer.length);
			// 将字节数组还原成字符
			String s = new String(buffer);
			// 调用String对象的trim方法，将会去除字符串的首位空格
			s = s.trim();
			System.out.println(s);
			for(int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
			// 第六步 ：调用输出流的write方法，写入数据
			fos.write(buffer,0,tmp);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}