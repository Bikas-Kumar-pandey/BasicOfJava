package Usage_of_This_keyword;

public class T {
	
	private int i=10 ;
	public static void main(String[] args) {
		T a1 = new T();
		a1.test();
		System.out.println(a1);
		
	}
	public void test() {
		System.out.println(i);
	System.out.println(this.i);
	System.out.println(this);
	

}
}
