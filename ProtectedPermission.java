package com.zallerting;

public class ProtectedPermission {
	// 跨包访问权限：protected
	// protected修饰的成员变量或成员函数，仅能被子类访问，不能被其他任何类访问
	protected String name;
	public int age;
	
	void eat() {
		System.out.println("s吃饭");
	}
	
	void sleep() {
		System.out.println("睡觉");
	}
}