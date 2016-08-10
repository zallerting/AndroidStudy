// 继承(或实现)接口,一个类可以实现多个接口
class USBPhone implements InterfaceUSB, InterfaceWiFi {
	// 接口中的抽象方法权限均为public
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