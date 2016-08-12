class SubInstantiateTest extends SubInstantiate {
	 int grade;
	 // 在子类的构造函数当中，必须调用父类的构造函数
	 SubInstantiateTest() {
		 // 子类若未主动调用父类构造函数，编译器将自动使用super();调用父类构造函数
		 System.out.println("SubInstantiateTest的无参数构造函数");
	 }
	 SubInstantiateTest(String name, int age, int grade) {
		 super(name, age);
		 this.grade = grade;
	 }
}