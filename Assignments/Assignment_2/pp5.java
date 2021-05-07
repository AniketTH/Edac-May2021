import java.util.Scanner;
class pp5
{
	public static void main(String args[])
	{
		int rows;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		rows=s.nextInt();
		
		for(int i=rows;i>=1;i--)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print("  ");
			}
			for(int k=i;k<=rows;k++)
			{
				System.out.print(k+" ");
			}
			for(int l=rows-1;l>=i;l--)
				System.out.print(l+" ");
			System.out.println();
		}
	}
}
