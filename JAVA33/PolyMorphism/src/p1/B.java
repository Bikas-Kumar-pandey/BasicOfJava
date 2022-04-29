package p1;

import p2.E;

public class B extends A {
	@Override
	public void test() {
		System.out.println(500);
	}
 public static void main(String[] args) {
	B b = new B();
	b.test();
	b.test2();
	b.test3();
	
	E e = new E();
	e.itsE();
//	C c = new C();
//	c.teccc();
}
}
