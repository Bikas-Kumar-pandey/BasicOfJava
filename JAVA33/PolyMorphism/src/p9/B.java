package p9;

import p10.D;

public class B extends A{
	@Override
	public void test() {
		System.out.println(600);
	}
	public static void main(String[] args) {
		
	
	
	B b = new B();
    b.test();
    
    D d = new D();
    d.itsDD();
}
	private void itsDD() {
		// TODO Auto-generated method stub
		
	}
}