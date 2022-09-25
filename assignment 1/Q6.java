import java.util.Scanner;

class Q6
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Year No. in YYYY format:");
		int a=sc.nextInt();
		
		if(a%4==0)    
		{
			if(a%400==0)   //nested if
			{
				System.out.println("Year "+a+" is a Leap Year");
			}				
			else if(a%100==0)
			{
				System.out.println("Year "+a+" is Not a Leap Year");
			}	
			else
			{
				System.out.println("Year "+a+" is a Leap Year");
			}				
		}
		else
		{
			System.out.println("Year "+a+" is Not a Leap Year");
		}			
		
		
	}
	
}	


