package SIB;

public class Uniary2 {

	static int s=10;
	
	static{
		s++;
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		
			Uniary2 ref = new Uniary2();
		System.out.println(ref.s);
		Uniary2 ref2 = new Uniary2();
		System.out.println(ref2.s);
		
	}
}
