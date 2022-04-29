/*import java.util.Scanner;

public class addi
{
public static void main(String[] args)
{

Scanner ob= new Scanner(System.in);
System.out.println("enter number");

long x=ob.nextLong();

if(x>=-Math.pow(2,4)&&x<=Math.pow(2,4)-1)


System.out.print("short");
if(x>=-Math.pow(2,5)-1&&x<=Math.pow(2,5)  )
System.out.println("long");
else
System.out.print("dont exist");

}
} */





















































import java.util.Scanner;
public class addi
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
long x=ob.nextLong();

if(x>=-Math.pow(2,3) && x<=Math.pow(2,3)-1)
{
System.out.println("Short");
}
if(x>=-Math.pow(2,4) && x<=Math.pow(2,4)-1)
{
System.out.println("Long");
}
else
System.out.println("Null");



}
}