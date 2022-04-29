package PrivateVariableMethod;

public class A extends B {
	public static void main(String[] args) {
		
	
	A a =new A();
	a.test(); // just calling method from B class
	
	//System.out.println(a.x); // cant coz x is private in b class

}
}
