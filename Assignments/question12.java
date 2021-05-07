import java.util.*;
class question12
{
public static void main(String args[])
{
int no1,no2,no3;
int average;

Scanner s=new Scanner(System.in);
System.out.println("Enter the 3 numbers");
no1=s.nextInt();
no2=s.nextInt();
no3=s.nextInt();

average = ((no1+no2+no3)/3);

System.out.println("Average = "+average);



}
}