package SIB_IIB_ADVANCE;

public class E {
	{
		System.out.println("Non static Block");
	}
	
	E(){
		System.out.println("Constructor ");
	}
	
	public void test() {
		System.out.println("Method ");
	}
	public static void main(String[] args) {
		new E().test();
	}

}
