package SIB_IIB_ADVANCE;
// Static block can execute with out creating main method
public class D {
	
	static {
		 new D();
		System.out.println("Static");
		
	}
	
	{
		System.out.println("Non Static Block");
	}
	
	D(){
		System.out.println("Constructor ");
	}
	public static void main(String[] args) {
		//D d2 = new D();
		
		
	}

}
