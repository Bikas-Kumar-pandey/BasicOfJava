import java.util.Scanner;

class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Number");
	     int num = sc.nextInt();
	     
	     if(num%2==0) {
	    	 System.out.println( num+" is not a Prime ");
	     }
	     else {
	    	 System.out.println(num+" is a prime ");
	     }

	}
}