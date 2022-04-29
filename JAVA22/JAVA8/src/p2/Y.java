package p2;

public class Y implements Z{

	@Override
	public void test() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Y y = new Y();
		y.test();
		y.test2();
	}

}
