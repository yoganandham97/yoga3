import java.util.*;
class hwday
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=s1.toLowerCase();
        if(s2.equals("monday")|| s2.equals("tuesday")||s2.equals("wendesday")||s2.equals("thursday")||s2.equals("friday")||s2.equals("saturday"))
        {
            System.out.println("True");
        }
        else if(s2.equals("sunday"))
        {
            System.out.println("False");
        }
    }
}
