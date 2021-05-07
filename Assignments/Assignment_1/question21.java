import java.util.Scanner;
class question21
{
	public static void main(String args[])
	{
		int rem;
		String str="";
		char dig[]={'0','1','2','3','4','5','6','7'};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=s.nextInt();
		
		while(num>0)
		{
		rem = num%8;
		str =dig[rem]+str;
		num /=8;
		}
		System.out.println("\nOctal conversion is = "+str);
	}
}
		
		