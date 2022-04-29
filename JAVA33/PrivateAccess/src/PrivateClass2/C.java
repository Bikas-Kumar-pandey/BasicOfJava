package PrivateClass2;

import PrivateClass.A;

public class C  extends A{ // Public A is Inherited in different package
public static void main(String[] args) {
	C c = new C();
	A.test();
	System.out.println(c.x);
}
}
