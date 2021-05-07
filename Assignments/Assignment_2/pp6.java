import java.util.Scanner;
class pp6
{
	public static void main(String args[])
	{
		int rows;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		rows=s.nextInt();
		
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=rows;k>=i;k--)
			{ 
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}