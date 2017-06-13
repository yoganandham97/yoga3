import java.util.Scanner;
class fact
{
         public static void main(String ars[])
       {
               int fact=1,b,c;
            Scanner s=new Scanner(System.in);
            b=s.nextInt();
            c=b;
            while(c>0)
                  {
                    fact=fact*c;
                            c-- ;
                   }
           
            System.out.println("Factorial of "+b+" is : "+fact);
         }
}
