//Local Variable

//package refrence;
//
//public class A {
//	int id=9;
//	public static void main(String[] args) {
//	A a1 = new A();
//	System.out.println(a1);
//	System.out.println(a1.id);
//		a1.test();
//	} 
//	public void test() {
//		System.out.println(id);
//	
//	
//	}
//
//}

//(Static )  Global Variable
package refrence;

public class A{
	static A a1;
	
	public static void main(String[] args) {
		//a1= new A();
		System.out.println(a1);
		
		a1.test();
	}
	
	public void test() {
		System.out.println(a1);
	}
}