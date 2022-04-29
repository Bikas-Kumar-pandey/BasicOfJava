package SIB_IIB_ADVANCE;
/* NOTE
 *  Number of Time object created that number of non static and constructor are called
 
 * !st All non static will execute then Constructor will execute
 */

public class B {
	
	{
		System.out.println("NOn Static Block 1");
	}
	static{
		System.out.println("Static Block 1");
	}
	
	{
		System.out.println("Non Static Block 2");
	}
	B(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		//B b2 = new B();
		System.out.println(b1);
	}

}
