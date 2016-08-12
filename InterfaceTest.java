class InterfaceTest {
	public static void main(String args []) {
		USBPhone usbPhone = new USBPhone();
		// 向上引用
		InterfaceUSB interfaceUSB = new USBPhone();
		interfaceUSB.read();
		interfaceUSB.write();
		
		// 
		InterfaceWiFi interfaceWiFi = new USBPhone();
		interfaceWiFi.open();
		interfaceWiFi.close();
	}
}