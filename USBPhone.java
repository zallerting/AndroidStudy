// �̳�(��ʵ��)�ӿ�,һ�������ʵ�ֶ���ӿ�
class USBPhone implements InterfaceUSB, InterfaceWiFi {
	// �ӿ��еĳ��󷽷�Ȩ�޾�Ϊpublic
	public void read() {
		System.out.println("USBPhone Read");
	}
	public void write() {
		System.out.println("USBPhone Write");
	}
	public void open() {
		System.out.println("WiFi Open");
	}
	public void close() {
		System.out.println("WiFi Close");
	}
}