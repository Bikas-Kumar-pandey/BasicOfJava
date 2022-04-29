
public class F implements E{

	@Override
	public void test(float x) {
		System.out.println(x);
		
	}
	
	@Override
	public void test2(String s) {
		System.out.println(s);
		
	}
	@Override
	public void test3(char c) {
		System.err.println(c);
		
	}
	@Override
	public int test4() {
		return 900;
	}
	public static void main(String[] args) {
		F f = new F();
		f.test(100.44f);
		f.test2("Bikas");
		f.test3('k');
		int val = f.test4();
		System.out.println(val);
		System.out.println("Bikas You did !!");
	}

	

}
