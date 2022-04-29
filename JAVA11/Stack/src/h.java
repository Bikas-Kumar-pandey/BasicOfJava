//
//public class h {
//	
//	public static void main(String[] args) {
//		h a=new h();
//		System.out.println(a);   // efrence of object is created in Stack but object is created in heap
//	}
//
//}

//public class h{
//	public static void main(String[] args) {
//		h b =new h();
//		h c = new h();
//		h d= new h();
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//	}
//}

//public class h{
//	public static void main(String[] args) {
//		h a = new h();
//		
//		System.out.println(a);
//		a.test();
//
//	}
//	public void test() {
//		System.out.println(100);
//		
//	}
//}
//
//public class h{
//	public static void main(String[] args) {
//		h.test();
//		
//	}
//	public static void test() {
//		h b= new h();
//		b.example();
//		System.out.println(100);
//	}
//	public void example() {
//		System.out.println("Just a try of 2 Method");
//	}
//}
//
//	

public class h{
	int i=100;
	static int j= 200;
	public static void main(String[] args) {
		int k =300;
		System.out.println(k);
			 h a = new h();
			 a.test();
}
	public void test() {
		System.out.println("Second Method");
		h b= new h ();
		b.example();
	}
	public void example() {
		int m=500;
		System.out.println(m);
		System.out.println(j);
		h.exa();
	}
	public static  void exa() {
		System.out.println("End");
		System.out.println(j);
	}
}