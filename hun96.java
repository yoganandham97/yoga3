import java.util.*;
class hun96
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String ch="abcdefghijklmnopqrstuvwxyz";
        //int count=0;
        for(int i=0;i<s.length();i++)
        {
            String c=Character.toString(s.charAt(i));
            if(ch.contains(c))
            {
                int j=ch.indexOf(c);
                if(i!=s.length()-1)
                {
                if(j==0)
                {
                   System.out.print(ch.charAt(ch.length()-1)); 
                }
                else
                {
                    System.out.print(ch.charAt(j-1));
                }
                }
                else
                   System.out.print(c);
            }
        }
    }
}
