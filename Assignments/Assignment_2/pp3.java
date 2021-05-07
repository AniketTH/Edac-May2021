import java.util.Scanner;
class pp3
{
	public static void main(String args[])
	{
		int row;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		row=s.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
				System.out.print(" *");
			System.out.println();
		}
	}
}