	package p9;

public class Z extends X {
	@Override
	public  void test() {
		System.out.println(900);
	}
	
	
	public static void main(String[] args) {
		Z x1 = new Z();
		x1.test();
	}

}
