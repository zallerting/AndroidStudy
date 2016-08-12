class User {
	int age;
	// 在函数内可能出现catch exception时使用’throws 异常类型‘进行处理
	public void setAge(int age) throws Exception {
		if(age < 0) {
			// 创建异常对象
			// RuntimeException e = new RuntimeException("年龄不能为负数");
			// Exception及除RuntimeException(包括其子类)的部分都属于catch exception
			// RuntimeException(包括其子类)都属于unchatch exception
			Exception e = new Exception("年龄不能为负数");
			// 抛出JVM无法判断的异常
			throw e;
		}
		this.age = age;
	}
}