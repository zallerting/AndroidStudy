class SubInstantiate {
	String name;
	int age;
	
	SubInstantiate() {
		System.out.println("SubInstantiate���޲������캯��");
	}
	SubInstantiate(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("SubInstantiate���в������캯��");
	}
	
	void eat() {
		System.out.println("�Է�");
	}
}