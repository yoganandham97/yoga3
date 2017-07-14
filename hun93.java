import java.util.*;
class hun93
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        for(String s1:s.split(" "))
        {
            StringBuffer sb=new StringBuffer(s1);
            System.out.print(sb.reverse()+" ");
        }
    }
}
