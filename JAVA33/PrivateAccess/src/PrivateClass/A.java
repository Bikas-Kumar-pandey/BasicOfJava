package PrivateClass;
// Class cannot be Private and protected

public  class A {/*public can be accessed in same package as well in different package */
//If public is removed then it becomes default class and can be accessed in same package but not in different package only
	public int x=10;
	
//	public static void main(String[] args) {
//		
//		
//	}
	public static void test() { // static method
	System.out.println("Main method");

}
}