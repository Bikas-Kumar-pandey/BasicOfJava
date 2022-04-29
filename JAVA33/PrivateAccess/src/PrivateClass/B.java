package PrivateClass;

public class B extends A{// public A is inherited in same package

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.x);
		A.test();
	}
	

}
