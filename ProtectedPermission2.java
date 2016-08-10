import com.zallerting.ProtectedPermission;
// 如果子类和父类不在同一个包当中，则子类无法继承到父类当中的default权限的成员变量和成员函数(有问题)
// 如果子类和父类不在同一个包当中，子类可以继承到父类当中的default权限的成员变量和成员函数，但由于权限不够，无法使用
// protected权限首先拥有和default一样的功能，但是该权限只能修饰成员变量和成员函数，只有子类可以访问使用。
class ProtectedPermission2 extends ProtectedPermission {
	void introduce() {
		System.out.println("我的姓名是" + name + ", 我的年龄是" + age);
	}
	public static void main(String args []) {

	}
}