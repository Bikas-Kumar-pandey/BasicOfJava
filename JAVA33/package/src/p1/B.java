package p1;

public class B extends A{
	public static void main(String[] args) {
		
	
	
		A a=new A();
		a.test(500);
		A.j = 50;
		System.out.println(A.j);
		//Variables cannot be inherited
		B b=new B();
		b.test2();
	}
		public void test2() {
		System.out.println("Here only class B");
		
		
//		A a = new A();
//		a.test();
//		
//		System.out.println(" Here only class B");
	}
	}
