import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int flag=0,i,j;
        for(i=0;i<=s;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
                else
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                System.out.println(i);
            }
        }
    }
}
