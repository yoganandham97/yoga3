import java.util.*;
class power
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int a=0;
        int b=0;
        while(number>2)
        {
            b=number%2;
            if(b==1)
            {
                a=1;
                break;
            }
            else
            {
                number=number/2;
            }
        }
        if(a==1)
        System.out.println("power of two");
        else
        System.out.println("not power of two");
    }
}
