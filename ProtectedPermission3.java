import com.zallerting.ProtectedPermission;

public class ProtectedPermission3 {
	public static void main(String args []) {
		ProtectedPermission pp = new ProtectedPermission();
		pp.name = "zaller";
		pp.age = 27;
		System.out.println(pp.name);
		System.out.println(pp.age);
	}
}
