package SIB;

/* Static Block runs before Main method , and each static block run only once. 
 * We cannot intilize non static variables in Static Block.
 * if their is multiple Static block then it Runs sequentially
 */


public class SIB_Basic {
	
	int n =10;   //in SIB we Cannot initilize NON Static variable, if we do then it throws an error
	
	static int s=30; //SIB can initilize only Static variables.
	
	static {
		System.out.println(s);
		//System.out.println(ref.i);
		System.out.println("Static Block 1");
	}
	
	static { //Whenever we create more then one Static Block it execute sequentially
		System.out.println(s);
		System.out.println("Static Block 2");
	
	}
	
	public static void main(String[] args) {
		System.out.println("main Method");
		
		SIB_Basic ref = new SIB_Basic();
		System.out.println(ref.n);
		System.out.println(SIB_Basic.s);
	}

}
