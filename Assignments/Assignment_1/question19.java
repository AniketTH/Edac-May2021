import java.util.*;
class question19
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to convert");
		num=s.nextInt();
		System.out.println("Decimal to Binary");
		long binary = convertDecimalToBinary(num);
		System.out.println("\n" + num +"=" +binary);
	}
	
	public static long convertDecimalToBinary(int n)
		{
			long binaryNumber =0;
			int remainder,i=1;
			while(n!=0){
				remainder = n%2;
				n /= 2;
				binaryNumber += remainder *i;
				i *=10;
			}
			return binaryNumber;
		}
}
