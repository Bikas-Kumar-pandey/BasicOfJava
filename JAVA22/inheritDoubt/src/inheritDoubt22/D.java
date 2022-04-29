package inheritDoubt22;

//import java.security.PublicKey;

import inheritDoubt.*;
//import inheritDoubt.B;

public class D extends B {
	@Override
	 public void test() {
		System.out.println("567");
	} 
public static void main(String[] args) {
	
   B b = new B();

   b.test();
  b.test2();
  D d = new D();
  d.test2();
}
}
