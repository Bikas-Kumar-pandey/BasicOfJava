import java.util.*;
class large
{
public static void main(string args[]);
{
int a,b,c;
scanner ob= new scanner(system.in);
system.out.println("enter three number");
a=ob.nextInt();
b=ob.nextInt();
c=ob.nextInt();
if(a>b && a>c)
{
system.out.println("a is largest number"+a);
}
else if(b>c)
{
system.out.println("b is largest number"+b)
}
else
{
system.out.println("c is largest number"+c);
}
}
}