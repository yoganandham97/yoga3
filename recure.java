import java.util.*;
class recure
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b[]=new int[a];
for(int i=0;i<b;i++)
{
a[i]=in.nextInt();
al.add(a[i]);
}
Collections.reverse(al);
System.out.println(al);
}
}
