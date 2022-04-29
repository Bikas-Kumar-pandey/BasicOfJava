package trying;

public class F extends E {
	public void test2() {
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		
	F f = (F) new E();
		f.test2();
		f.test();
		}
}














//E f = new F();
////f.test2(); // Error
//f.test();