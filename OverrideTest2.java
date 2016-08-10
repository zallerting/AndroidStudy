class OverrideTest2 {
	public static void main(String args []) {
		OverrideTest ot = new OverrideTest();
		ot.name = "丁正龙";
		ot.age = 27;
		ot.address = "昆山";
		ot.introduce();
		
		Override o = new Override();
		o.name = "张三";
		o.age = 20;
		o.introduce();
		
		// 向上转型，子类对象赋给父类引用
		Override o2 = ot;
		// 一个引用能调用哪些成员(变量)，取决于这个引用的类型；
		o2.name = "丁正龙";
		o2.age = 27;
		// o2.address = "昆山";
		// 一个引用能够调用哪一个方法，取决于这个引用所指向的对象；
		o2.introduce();
		// o2.study();
		
		// 向下转型(先向上转型再向下转型)
		Override o3 = new OverrideTest();
		OverrideTest ot3 = (OverrideTest)o3;
		// 错误的向下转型
		// Override o4 = new Override();
		// OverrideTest ot4 = (OverrideTest)o4;
	}
}