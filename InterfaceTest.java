class InterfaceTest {
	public static void main(String args []) {
		USBPhone usbPhone = new USBPhone();
		// ��������
		InterfaceUSB interfaceUSB = new USBPhone();
		interfaceUSB.read();
		interfaceUSB.write();
		
		// 
		InterfaceWiFi interfaceWiFi = new USBPhone();
		interfaceWiFi.open();
		interfaceWiFi.close();
	}
}