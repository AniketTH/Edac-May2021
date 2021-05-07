import java.util.Scanner;
class pp4
{
	public static void main(String args[])
	{
		int rows;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		rows=s.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>=i;j--)
			{
				System.out.print("_");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(k);
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}