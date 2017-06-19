import java.util.*;
class repeatchar
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String s1="";
       String s2[]=s.split("\\s+");
       int count=0;
       int i,j,k;
       for(i=0;i<s2.length;i++)
       {
           for(j=0;j<s2[i].length();j++)
           {
               for(k=1;k<s2[i].length();k++)
               {
                   char c=s2[i].charAt(k);
                   if(c==s2[i].charAt(k - 1))
                   {
                       count++;
                   }
                   //System.out.println();
                   System.out.println(s2[i]);
               }
           }
       }
    }
}

