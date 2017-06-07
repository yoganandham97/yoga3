import java.io.*;
import java.util.*;
class larger
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>b && a>c)
{
System.out.println("largest number is" +a);
}
else 
{
if(b>a && b>c)
{
System.out.println("largest number is" +b);
}
else
{
if(c>a && c>b)
{
System.out.println("largest number is" +c);
}
}
}
