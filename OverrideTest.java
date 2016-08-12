// 复写(override) 也被称为覆盖或重写
// 1.在具有父子关系的两个类当中
// 2.f父类和子类各有一个函数，这两个函数的定义(返回值类型、函数名和参数列表)完全相同
class OverrideTest extends Override {
	String address;
	
	// 子类复写父类成员方法
	void introduce() {
		// 调用父类成员方法
		super.introduce();
		System.out.println("我的家在" + address);
	}
	void study() {

	}
}