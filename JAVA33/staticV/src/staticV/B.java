package staticV;

public class B {
static B b1;
int i=3;
public static void main(String[] args) {
	b1=new B();
	System.out.println(b1.i);
	b1.test();
	
}
public void test() {
	System.out.println(b1.i);
}
}
