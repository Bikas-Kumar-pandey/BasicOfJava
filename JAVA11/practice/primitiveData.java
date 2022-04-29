/* import java.util.*;
import java.io.*;
import java.util.Scanner;


class primitiveData{
public static void main(String argh[]){
int x,m,n;
Scanner ob = new Scanner(System.in);
int t=ob.nextInt();

if(int x >=-128 && int x<=127)
System.out.println(" its a Byte");

if(x>=-Math.pow(2,16)&& x<=Math.pow(2,16)-1)
System.out.println("it's SHORT");

if(x>=-Math.pow(2,32)&& x<=Math.pow(2,32)-1)
System.out.println("it's an INTEGER");

if(x>=-Math.pow(2,64)&& x<=Math.pow(2,64)-1)
System.out.println("its LONG");

else{
System.out.println("not supported");
}
}
} */










import java.util.*;
import java.io.*;



class primitiveData{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {



  try
        {
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127)Sys5tem.out.println("* byte");
            //Complete the code


            if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                System.out.println("* short");
            if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                System.out.println("* int");
            if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                System.out.println("* long");
        }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }

    }
}
}

                