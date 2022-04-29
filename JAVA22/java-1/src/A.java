
//public class  A {
//	public static void main(String[] args) {
////		A a1 = new A();
////		a1.test();
////		System.out.println(a1);
////		}	
////	
////
////
////public void test() {
////	System.out.println(100);
//	
//
//}
//}





// NON STATIC VARIABLE

/*public class  A {
	int x = 10;
	public static void main(String[] args) {
		//System.out.println(x); // Error cox non ststic is called  only when object is created.
		A a1 = new A();
		A a2 = new A();
		A a3 =new A();
		A a4 = new A();
		a1.test();
		System.out.println(a1.x);
		System.out.println(a2);
		System.out.println(a3); // whenever we create object a value of non static variable  is stored in it
		System.out.println(a4);
		System.out.println(a4.x);
	}
	public void test() {
		System.out.println(x);
		int x = 20;  
		System.out.println(x);
	}
} */

/*public class  A {
	int x = 50;
	public static void main(String[] args) {
		int x = 30; // local variable 
		System.out.println(x);
		
		A a1 = new A ();
		
		System.out.println(a1.x);  // non static member
		
		a1.x=10;  // non static variable  value is changed , it has same name as x but values are diff bvut its local
		System.out.println(a1.x);
		
	}
} */

// STATIC VARIABLE
public class  A {
	static int x = 20;
	public static void main(String[] args) {
		System.out.println(A.x);
		A.x=30;
		System.out.println(A.x);
	}
}