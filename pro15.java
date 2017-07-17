import java.util.*;
class pro15
{
	public static void main(String a[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=in.nextInt();
		}
		Arrays.sort(b);
		for(int i=n;i>0;i--)
		{
			System.out.println(b[i-1]);
		}
	}
}
