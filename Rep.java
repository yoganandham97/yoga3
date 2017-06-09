import java.util.Scanner;

public class Rep {
	
	public static void main(String[] args) 
  {
		Scanner s=new Scanner(System.in);		
		String na=s.nextLine();
		String[] str=na.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			char[] ch=str[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}	
	}
}
