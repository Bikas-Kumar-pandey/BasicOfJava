
public class Maths {
	int a= 4;
static int b= 2;
	
	public static void main(String[] args) {
		        
		
			
        
				 Maths sub = new Maths();
				 sub.subtraction();
				 System.out.println(sub.a);
				 System.out.println(a);
				 
				 Maths mul = new Maths();
				 mul.multiply();
				 
				 Maths div = new Maths();
				 div.division();
				 
					Maths add= new Maths();
			        add.addition();
	}
	
	public void subtraction() {
		int s= a-b;
		System.out.println(s);
		
		System.out.println(Maths.b);
	}
	public void addition() {
		int ad=a+b;
		System.out.println(ad);
		
	}
 public void multiply() {
	 int m=a*b;
	 System.out.println(m);
			
 }
 public void division() {
	 int d=a/b;
	 System.out.println(d);
 }
}
