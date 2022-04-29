//
////public class D {
////	static byte b;
////	static short s1;
////	static int i= 1_00_000;
////	static long l= 779525263;
////	static long l2 = 7795252636l;
////	static float f = 10.3f;
////	static double d = 222.5;
////    static char c;
////	static String s;
////	static boolean bool;
////	//static var v;
////	
////	public static void main(String[] args) {
////		
////		System.out.println(i);
////		System.out.println(l);
////		System.out.println(l2);
////		System.out.println(f);
////		System.out.println(d);
////		System.out.println(c);
////		System.out.println(s1);
////		System.out.println(b);
////		System.out.println(s);
////		System.out.println(bool);
////		//System.out.println(v);
////		
////	}
////	}
//
//
//
// VAR DATA TYPE
//public class D {






//   //static var z1=40;       // ERROR VAR CANNOT BE STATIC ON NON STATIC
////	var z =10;
//	public static void main(String[] args) {
//		var a= "Bikas";
//		var b= 10;
//		var c= 99.9f;
//		var d = 7795252636l;
//		var e = true;
//		
//		
//		var var =80;   // OBSERVE VAR IS NOT A KEYWORD
//		System.out.println(var);
//		
//		
//		//System.out.println(D.z);
//		//System.out.println(z1);
//		
//		var x = new D();
//		x.test();
//		System.out.println(x);  // it can also store object
//		
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		
//		
//	}
//	public void test() {
//		System.out.println("SOMETHING GREAT!!!!");
//	}
//}



// Method argument type cannot be var & hence below prgrm show error;

//public class D {
//	public static void main(String[] args) {
//		D a = new D();
//		a.test(100);
//	}
//
//	public void test(var x) { // int and other dataType is Allowed here
//		// public void test(int x) {
//		System.out.println(x);
//		}


//public class D {
//	Static var x =5;
//	var x1 = 4;
//	public static void main(String[] args) {
//		var x3  = 20;
//		System.out.println(x);
//		System.out.println(x1);
//		System.out.println(x3);
//		
//	}
//	
//}

//public class D{
//	public static void main(String[] args) {
//		D d = new D();
//		d.test(500);
//	}
//	public void test(var x) {
//		System.out.println(x);
//		
//	}
//}