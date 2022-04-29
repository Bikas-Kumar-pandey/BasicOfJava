//package stack_understanding;
//
//public class B {
//
//public static void main(String[] args) {
//	 B a = new B();
//	 a.test();  // METHOD ARE ACCESSED ONLY WHEN THEY ARE CALLED
//}
//
//public void test() {
//	System.out.println(100); // non static value coz we didnt callany value but  directly accessed
//	
//}
//
//}

//
//package stack_understanding;
//
//public class B {
//	public static void main(String[] args) {
//		B b = new B();
//		B.test();
//		
//		System.out.println(b);
//	
//	}
//public static void test() {
//	System.out.println(100);
//}
//}


package stack_understanding;
public class B {
	public static void main(String[] args) {
		B a = new B();
		a.test1();
	}
	

 public void test1() {
	 
	 B a1 = new B();
	a1.test2();
 }
 
 public void test2() {
	 System.out.println(100);
 }
	 
	 
 }