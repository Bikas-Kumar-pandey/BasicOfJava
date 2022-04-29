
public interface A {
	
	 int MAX_VALUE= 100; // final & Static
	public void test();
	default public void test2() {//complete method in interace
		System.out.println("its complete method");
	}

}
