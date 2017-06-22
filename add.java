import java.util.*;
class add
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int m=s.nextInt();
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]+a[i+1]==m)
            {
                System.out.println("the arr is"+a[i]+"and"+a[i+1]);
            }
        }
    }
}
