import java.util.Scanner;
public class question20{    
public static String toHex(int decimal){    
     int rem;  
     String hex="";   
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(decimal>0)  
     {  
       rem=decimal%16;   
       hex=hexchars[rem]+hex;   
       decimal=decimal/16;  
     }  
    return hex;  
}    
public static void main(String args[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=s.nextInt();
		String hexa = toHex(num);
		System.out.println("\n"+num+"="+hexa);  
		
     
     //System.out.println("Hexadecimal of 15 is: "+toHex(15));  
     //System.out.println("Hexadecimal of 289 is: "+toHex(289));  
}}