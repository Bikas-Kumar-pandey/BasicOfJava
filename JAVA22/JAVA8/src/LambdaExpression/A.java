package LambdaExpression;
// Lambda Expression used to Reduce the lines of code.


@FunctionalInterface
public interface A {
	
	public void test();
	
	default public void test2() {
		System.out.println("Test 2");
	}
	

	

}
