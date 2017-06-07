import java.io.*;
import java.util.*;
class vowels
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
if(c=='a' || c=='i' || c=='e' || c=='o' || c=='u' || c=='A' || c=='I' || c=='E' || c=='O' || c=='U')
{
System.out.println("vowel");
}
else
{
System.out.println("consonant");
}
}
}
