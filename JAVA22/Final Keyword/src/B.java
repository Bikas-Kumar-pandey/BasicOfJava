
public class B extends A{
	
	@Override
	 public void test() {
		System.out.println("Method");
	}
	 public static void main(String[] args) {
		B b = new B();
		b.test();
	}
  
}
