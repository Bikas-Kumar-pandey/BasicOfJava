
import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) 
    {
	int i,j,m,n,f;
   Scanner sc=new Scanner(System.in);
  
	m=sc.nextInt();
    
	n=sc.nextInt();
	for(i=m; i<n;i++)
	{
	    for(j=2;j<i;j++)
        {
	        f=i%j;
	         if(f==0)
             break;
	    }
	       
        if(i==j)
        System.out.println(i);
	        }
	}
}  