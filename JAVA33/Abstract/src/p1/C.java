package p1;

import java.util.Scanner;

public class C implements A,B {
	Scanner sc= new Scanner(System.in);
	
 
	@Override
	public void Balance() {
		System.out.println("Balance ");
		//System.out.println(500);
		var bal=sc.next();
		System.out.println(bal);
		
		
		
		
		//System.out.println( );
	}

	@Override
	public void AmountSent() {
		System.out.println(" AmountSent ");
		//System.out.println(900);
		   var sent=sc.next();
		   System.out.println(sent);
		
		
		
		
		
	}

public static void main(String[] args) {
	C c=new C();
	c.Balance();
	c.AmountSent();
	
	

}
	
}
