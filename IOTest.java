// ��һ���� ������IO����ࣻ
import java.io.*;

class IOTest {
	public static void main(String args []) {
		// �ڶ����� �������������������
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// ������ �����ɴ�������������Ķ���
			fis = new FileInputStream("D:/AndroidDev/JavaStudy/IO/from.txt");
			fos = new FileOutputStream("D:/AndroidDev/JavaStudy/IO/to.txt");
			// ���Ĳ� �������ֽ�����
			byte[] buffer = new byte[100];
			// ���岽 ��������������read��������ȡ����
			int tmp = fis.read(buffer, 0, buffer.length);
			// ���ֽ����黹ԭ���ַ�
			String s = new String(buffer);
			// ����String�����trim����������ȥ���ַ�������λ�ո�
			s = s.trim();
			System.out.println(s);
			for(int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
			// ������ �������������write������д������
			fos.write(buffer,0,tmp);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}