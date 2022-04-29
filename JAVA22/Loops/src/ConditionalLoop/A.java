package ConditionalLoop;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
	
     Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number ");
        int Num = sc.nextInt();
        System.out.println("the number you have entered is "+Num);
       
         for(int i=0; i<=Num; i++ ) {
        	 System.out.print(i);
         }
         
         sc.close();
	}
	
    
	}

