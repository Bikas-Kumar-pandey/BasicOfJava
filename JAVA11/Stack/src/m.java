
public class m { 
	int i = 10;
	static int j=100;
 public static void main(String[] args) {
	int k = 30;
	System.out.println(k);
	
	m a1=new m();
	a1.test();
	
	 System.out.println(a1.i);
}

 public void test() {
	 System.out.println(i);
	 System.out.println(m.j);
 }


}