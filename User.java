class User {
	int age;
	// �ں����ڿ��ܳ���catch exceptionʱʹ�á�throws �쳣���͡����д���
	public void setAge(int age) throws Exception {
		if(age < 0) {
			// �����쳣����
			// RuntimeException e = new RuntimeException("���䲻��Ϊ����");
			// Exception����RuntimeException(����������)�Ĳ��ֶ�����catch exception
			// RuntimeException(����������)������unchatch exception
			Exception e = new Exception("���䲻��Ϊ����");
			// �׳�JVM�޷��жϵ��쳣
			throw e;
		}
		this.age = age;
	}
}