package IIB;

public class UniaryInIIB {
	
	int i=10;   // wecan initilize both Static and non static variable in UU
	static String s; 
	{
		s="Hello";
		
		int y= i++;
		System.out.println(s); //Hello
		System.out.println(y);//10
		System.out.println(i);//11
		
	}
	
	{
		i++; 
		System.out.println(i); //12 coz  it runs sequentially.
	}
	public static void main(String[] args) {
		UniaryInIIB ref = new UniaryInIIB();
		System.out.println(ref);
	}		
}
