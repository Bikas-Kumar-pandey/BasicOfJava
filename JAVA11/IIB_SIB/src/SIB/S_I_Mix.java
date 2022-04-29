package SIB;
/* Whenever Both static and non static block created then 1st Static blocks are creared
 *  
 * Non static block are Executed when Object creation is done in main method
 */

public class S_I_Mix {
	
	static {
		System.out.println("Static Block 1");
	}
	
	{
		System.out.println("NON Static Block 1");
	}
	
	static {
		System.out.println("Static Block 2");
	}
	
   
	public static void main(String[] args){
		System.out.println("Main method");
		S_I_Mix ref = new S_I_Mix();
		System.out.println(ref);
		
		
	}

}
