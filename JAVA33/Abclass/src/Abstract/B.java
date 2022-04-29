package Abstract;

public class B extends A{
	public static void main(String[] args) {
		B a = new B();
		a.test();
		a.test2();
	}

	@Override
	public void test2() {
System.out.println("Abstract method");		
	}

}
