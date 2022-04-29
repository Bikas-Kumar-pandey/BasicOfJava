package SIB;

public class UniaryOfstatic {

	static int s=10;
	
	static {
		System.out.println(s++);
		System.out.println(s++);
	}
	
	{ // s: 12 coz it executing Sequentially
		System.out.println(s); //12
	}
	
	static {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		//System.out.println("main Method");
		UniaryOfstatic ref = new UniaryOfstatic();
		System.out.println(ref);
	}
	
}
