public class OOP {
	public static void main(String ages []) {
		// ��������
		Dog d = new Dog();
		
		d.name = "����";
		d.age = 2;
		d.color = "��ɫ";
		
		d.jump();
		
		System.out.println("������" + d.name);
		
		// �����������
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.name = "����";
		d2.name = "��ϲ";
		d1.jump();
		d2.jump();
		
		// ������������
		new Dog().jump();
	}
}