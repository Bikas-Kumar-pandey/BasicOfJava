
public  class B implements A{

	@Override
	public void test() {
		System.out.println("Hello World");
		
	}

	@Override
	public int test2() {
		return 100;
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.test();
		int val = b.test2();
		System.out.println(val);
	}

}
