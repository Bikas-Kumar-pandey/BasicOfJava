package trying;

public class D extends C{
	public void test2() {
		System.out.println(100);
	}
	@Override
	public void test(){
		System.out.println("kumar !!!");
	}
	//O/p == Kumar!!
	
	
	
public static void main(String[] args) {
	C d = new C();
	  d= new D();
	d.test(); /* Parent class reference variable picks  
	           methods only by its belonging class
	           coz it belongs to only parent class  */
	
	
	//d.test2();  Error coz it belong to child class
}
}
