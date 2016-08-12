package com.zallerting;
// public 可以修饰类、成员变量和成员函数，没有任何限制，同一个包中及不同包当中都可以自由访问；
// private 可以修饰成员变量和成员函数，只能在本类当中使用
// default (不写权限修饰符，就是default权限)，可以修饰类、成员变量和成员函数，同一个包中可以自由访问
public class AccessPermission {
	public String name;
	private int age;
	
	void introduce() {
		System.out.println("name");
	}
}