//// This keyword is special reference variable , which is 
////Automatically created  and store the address of an Object.
//
//
//
//

//public class T {
//	int x=10; // non static variable
//	
//   static int y=20;//Static variable
//	public static void main(String[] args) {
//	T a = new T();
//			System.out.println(a);
//			System.out.println(a.x);
//	  a.test();
//	  System.out.println("sa");
//	  System.out.println(a.x);
//}
//public void test() {
//	System.out.println(this);
////WARNING
//	System.out.println(this.y);// we can access Static variable but its not right way to Access
//	System.out.println(this.x);
//}
//}


//class T{
//	public static void main(String[] args) {
//		
//	
//	T a = new T();
//	System.out.println("here a is calling test1");
//	a.test1();
//}
//
//public void test1() {
//	System.out.println("here this is calling test2");
//	this.test2();
//	
//}
//
//public void test2() {
//	System.out.println("finally reached");
//}
//}
//}
//}
//
//
//

//class T{
//	public static void main(String[] args) {
//		System.out.println(this);// Coz this keyword cannot be used in static method
//	}
//}

//class T{
//	public static void main(String[] args) {
//		T a = new T();
//		a.test();
//		
//	}
//	public static void test() {
//		System.out.println(this);
//	}
//}

// By Using THIS keyword we can call different method but it should be first statement and not
// second or so on

//class T{
//	T(){
//		
//		System.out.println(10);
//		
//	}
//	T(int x){
//		this();
//		System.out.println(x);
//	}
//	
//	public static void main(String[] args) {
//		T a =new T(100);
//		
//	}
//}
//


