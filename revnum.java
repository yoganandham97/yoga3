import java.util.*;
class revnum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int revnum=0;
        while(num!=0)
        {
            revnum=revnum*10;
            revnum=revnum+num%10;
            num=num/10;
        
        }
        System.out.println(revnum);
    }
}
