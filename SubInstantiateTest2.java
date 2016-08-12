class SubInstantiateTest2 {
	public static void main(String args []) {
		SubInstantiateTest sit = new SubInstantiateTest();
		SubInstantiateTest sit2 = new SubInstantiateTest("¶¡ÕıÁú", 27, 6);
		System.out.println(sit2.name);
		System.out.println(sit2.age);
		System.out.println(sit2.grade);
	}
}