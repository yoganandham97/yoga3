import java.util.*;
class pro1
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
Strind s[]=new String[n];
for(int j=0;j<n;j++)
{
s[j]=in.next();
}
String c="",ch;
if(s.length>0)
c=s[0];
for(int i=1;i<c.length;i++)
{
ch=s[i];
for(int j=0;j<Math.min(c.length(),s[j].length());j++)
{
if(c.charAt(j)!=ch.charAt(j))
break;
}
 c=s[i].substring(0,j);
 }
 System.out.println("Longest prefix is:"+c); 
}
 }


