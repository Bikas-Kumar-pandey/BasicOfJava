package p1;

public class B extends A{
 

	//Below is upcasting
	 //	A a = new A();
//	a= new C();
	 
//	 //Downcasting
//	 B b=(B) new A();
//	 C c = (C) new C();
	
	
	 // RunTime polymorphism
	@Override
	public void test() {
		System.out.println(500);
	}
	 
	public static void main(String[] args) {
		A a = new B();
		a.test();
}
}
