package variable;
// 3 ways to access ststic variable
public class C {
	static int y ; // its not mandatory to initilize static variable
	static String z; 
	static int x1 =50;
	public static void main(String[] args) {
		int x= 10;  // Local variable
		System.out.println(x);  //local
		System.out.println(z);
		
		
		System.out.println(y);
		System.out.println(C.x1);
		System.out.println(x1);
    //  C a = new C();
     // System.out.println(a.x1);   //WARNING

}
}