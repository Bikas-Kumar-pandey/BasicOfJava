package practice;

public class A {
	
	static A a1;  
	public static void main(String[] args) {
		
		a1 =new A();
		 
		System.out.println(a1);
	a1.test();
		
	}
	public void test() {
		a1 = new A();
		System.out.println(a1);
	}

}
