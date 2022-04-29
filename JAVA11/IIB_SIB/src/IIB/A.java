package IIB;

public class A {
	
	int i=10; // give feeling that non static variable created
	
	static int s=30; //In IIB we can intilize both Static and non static variable
	{
	    int i=20;
		System.out.println("From IIB");
		System.out.println(i);//20 coz more priority is given to local variable
        System.out.println(s);	
	}
  public static void main(String[] args) {
	A a = new A(); //IIB are called WhenEver Object is created
	A a2 = new A();/* Numbersof time Object is created Number of time IIB is called*/
	A a3 = new A();
	System.out.println(a.i); //10
	System.out.println(a2);
	System.out.println(a3);
}
}
