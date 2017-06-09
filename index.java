import java.util.Scanner;
public class SortedIndex {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in sorted order");
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
for(int i=0;i<n;i++)
{
	if(a[i]==i)
	{
		System.out.println(i);
	}
}

	}

}
