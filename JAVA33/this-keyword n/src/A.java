
//public class A {// method is used to break the program into 
//	             //reusablemodule;
//	public static void main(String[] args) {
//		A a = new A();
//		a.test();
//		a.test();
//		
//	}
//	public void test() {
//		System.out.println(100);
//	}
//
//}

//public class A{
//	public static void main(String[] args) { // if method id a void then 
// it cannot return any value
//		A a = new A();
//		int val =a.test();
//		System.out.println(val);
//	}
//	public void test() {
//		return 100;
//	}
//}



//public class A{
//	public static void main(String[] args) {
//		A a1 = new A();
//		 int test = a1.test();
//		 System.out.println(test);
//		
//	
//	}
//	public int test() {
//		return 0;
//		System.out.println(100); //error unreachable code 
//		
//	}
//	
//}

//class A{
//	
//
//
//	public static void main(String[] args) {
//		A a = new A();
//		a.test(10, 10.3, "abc", 'a', true);
//	}
//	public void test(int i,double d, String string, char c, boolean b  ) {
//	 
//		
//		
//		System.out.println(i);
//		System.out.println(d);
//		System.out.println(string);
//		System.out.println(c);
//		System.out.println(b);
//		}
//	
//}


//class A{
//	public static void main(String[] args) {
//		A a = new A();
//		a.test(10 , 20, 30, 40, 50);
//	}
//
//	private void test(int...x) {
//		// TODO Auto-generated method stuy
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
//		System.out.println(x[3]);
//		System.out.println(x[4]);
//		
//		
//		
//	}
//}

class A{
	public static void main(String[] args) {
		A a= new A();
		a.test();
		
	}
	public int test() {
		return 100;
	}
}