// 如果一段代码在语义上是有错误的，那么在语法上也应该是有错误的
abstract class Printer {
	void open() {
		System.out.println("OPEN");
	}
	void close() {
		System.out.println("CLOSE");
	}
	//　抽象函数
	//　父类无法确定具体实现，强制子类复写该函数
	abstract void print();
}