package AccessConstructor;

public class A {// if we make any constructor private then it can be accessed only within  a class
 A() {
	System.out.println("Constructor");
}
public static void main(String[] args) {
	A a = new A();
	
}
}
