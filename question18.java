import java.util.*;
import java.lang.*;
class question18
{
	public static void main(String args[])
	{
	int no1,no2,no3;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the 2 Numbers: ");
	no1=s.nextInt();
	no2=s.nextInt();
	
	no3 = no1*no2;
	System.out.println("The No is = "+no3);
	long Binary = ConvertDecimalToBinary(no3);
	System.out.println("The No is "+no3+" & its binary no is = "+Binary);
	}
	
	public static long ConvertDecimalToBinary(int n)
	{
		long binaryNumber=0;
		int remainder,i=1;
		while(n!=0)
		{
			remainder = n % 2;
			n /=2;
			binaryNumber +=remainder * i;
			i *=10;
		}
		return binaryNumber;
	}
}