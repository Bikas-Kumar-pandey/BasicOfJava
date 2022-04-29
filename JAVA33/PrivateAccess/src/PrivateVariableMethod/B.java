package PrivateVariableMethod;
/* When we make variable private then it cannot be accesed 
outside the class & but can be shown just by putting private variable
 in method and by calling method in another class*/


public class B {
private int x =20; //Private and non static

//private void test() {//private so cannot b accesed in B class

public void test() { // non static method, is accessed only in A class
	System.out.println(x);
}
	public static void main(String[] args) {
    
		B b = new B();
      System.out.println(b.x);
		b.test();
		
	}
	
}
