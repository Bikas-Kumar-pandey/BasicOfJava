package AllScannerMethod;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	 System.out.println("Please Enter Your name "); // User input
		  String  Name = sc.nextLine();             // system receiving
		  System.out.println(Name);                 // printing
		
	 System.out.println("Enter your Age ");
		  int Age = sc.nextInt();
		  System.out.println(Age);
		  
		  
     System.out.println("Please Enter your Weight");
	    float Weight = sc.nextFloat();
	    System.out.println(Weight);
	     
	 System.out.println("please Enter your 1 Favourite Character ");
	    String ch = sc.next();
	    System.out.println(ch);
	
	 System.out.println("Are you Robot");
	    boolean ans = sc.nextBoolean();
	    System.out.println(ans);
	    
	    sc.close();
	
	}
	}