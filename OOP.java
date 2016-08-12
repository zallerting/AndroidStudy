public class OOP {
	public static void main(String ages []) {
		// 创建对象
		Dog d = new Dog();
		
		d.name = "旺财";
		d.age = 2;
		d.color = "黑色";
		
		d.jump();
		
		System.out.println("名字是" + d.name);
		
		// 创建多个对象
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.name = "旺财";
		d2.name = "四喜";
		d1.jump();
		d2.jump();
		
		// 创建匿名对象
		new Dog().jump();
	}
}