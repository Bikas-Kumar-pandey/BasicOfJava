package SIB_IIB_ADVANCE;

public class A{
	/* when we create Constructor and non static block then 1st non static block
	 * execute first
	 */
	
	A(){
		System.out.println("Constrtuctor ");
	}
	
	{
		System.out.println("Non Static Block ");
	}
	
	static{
		System.out.println("Static Block ");
	}
	
	
	
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1);
	}

}
