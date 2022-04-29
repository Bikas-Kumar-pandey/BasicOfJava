
public class D extends C  implements A,B{

//	@Override
//	public void test2() {
//       System.out.println("Test 2");		
//	}
	public static void main(String[] args) {
		D d = new D();
		d.test2();
		d.test();
	}

	@Override
	public void test(float x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3(char c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int test4() {
		return 0;
	}

}
