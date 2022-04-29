package LamPractice;

//@FunctionalInterface
public interface A {
	
	abstract void test();
	
	default public void test2() {
		System.out.println("Complete method");
	}

}
