import java.util.*;
class question7
{
public static void main(String args[])
{
int No;
int T;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number Of which Table is required\n");
No=s.nextInt();

for(int i=1;i<=10;i++)
{
T=No*i;
System.out.println(No+"*"+i+"="+T);
}


}
}