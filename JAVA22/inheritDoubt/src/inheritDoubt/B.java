package inheritDoubt;

public class B extends A  {
	@Override
	public void test() {
		System.out.println("123");
		System.out.println("Hi");// polyMorphism Overriding
	}
	public void test2() {

		
		System.out.println("World"); //inherited
			
		}
	
//	public static void main(String[] args) {
//		B a = new B();
//		a.test();
//		a.test2();
//		
//}
}