package p2;

import p4.C;

public class D implements C{

	@Override
	public void tA() {
		System.out.println("From interface A ");
	}

	@Override
	public void tB() {
		System.out.println("From interface B");
		
	}

	@Override
	public void tC() {
System.out.println("From interface C");		
	}
	public void TD() {
		System.out.println("From D class");
	}
	public static void main(String[] args) {
		D d = new D();
		d.tA();
		d.tB();
		d.tC();
		d.TD();
		
	}
//
//	@Override
//	public void AmountSent() {
//		// TODO Auto-generated method stub
//		
//	}

}
