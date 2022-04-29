package p2;

@FunctionalInterface
public interface Z {
	/*public void test();  it consist of only one 
	                     incomplete Method. */
	//public void test2();
	
	public void test();
	default void test2() {
		System.out.println("IT can have more than 1 default complete method");
	}
	
	

}
