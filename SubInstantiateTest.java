class SubInstantiateTest extends SubInstantiate {
	 int grade;
	 // ������Ĺ��캯�����У�������ø���Ĺ��캯��
	 SubInstantiateTest() {
		 // ������δ�������ø��๹�캯�������������Զ�ʹ��super();���ø��๹�캯��
		 System.out.println("SubInstantiateTest���޲������캯��");
	 }
	 SubInstantiateTest(String name, int age, int grade) {
		 super(name, age);
		 this.grade = grade;
	 }
}