
public class Prime2 {
	 int i = 9; //Local
		int j=2;    // local variable
	public static void main(String[] args) {
		 Prime2 a = new Prime2();
		 
		//for(int k=1; k<=a.i; k++) {
		if(a.i % a.j==0) {     //Logic prime number must divide by one or by itself.
			
			System.out.println(a.i+" Given numer is not prime ");
			
		}
		else{
			System.out.println(a.i+" Number is  a prime ");
		}
	//}

}
}