import java.util.Scanner;
class pp1
{
	public static void main(String args[])
	{
		int rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		rows=sc.nextInt();
		
		if(rows<=9)
		{
		
			for(int i=1;i<=rows;i++)
			{
				for(int j=rows;j>i;j--)
				{
				System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(" "+i);
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Sorry");
		}
	}
}	