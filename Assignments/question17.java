import java.io.*;
class question17
{
	public static void main(String args[])
	{
		int num = 5;
		System.out.println("Decimal To Binary");
		long Binary = convertDecimalToBinary(num);
		System.out.println("Decimal No is = "+num+" & Binary No is = "+Binary);
	}
	
	public static long convertDecimalToBinary(int n)
		{
			long binary = 0;
			int remainder,i=1;
			while(n!=0)
			{
				remainder = n % 2;
				n /= 2;
				binary += remainder * i;
				i *=10;
			}
			return binary;
		}
}	