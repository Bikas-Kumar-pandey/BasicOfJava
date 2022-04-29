
//public final class A { /4) * if u make  class as afinal then  it cannot be Inherited */
	public  class A {
	  final static int s = 30; /* 1) when u make static or non static  variableas a final 
	                               then intitilization becomes  manditory |*/
	 final int  n = 40;
	public static void main(String[] args) {
		  
		 A a = new A();
		 
			final int l =10;/* 2) if umade variable as a 
			                 final then value cannot be changed*/
			//a=20;
			
			
			System.out.println(l);
			System.out.println(A.s);
			System.out.println(a.n);
			a.test();
			
		}
	// final public void test() { 
/* 3) when  u make method as a final then it cannot beoverrideen see in B.java file*/
		  public void test() {
		System.out.println("Method");
	}
	}


