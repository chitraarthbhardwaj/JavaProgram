import java.util.Scanner;

public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	int a=4;
	int temp=0;
	
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int s1=s.nextInt();
	
	for(int i=2;i<=a-1;i++)
	{
		if(s1%i==0)
		{
			temp=temp+1;
		}	
	}
	if(temp>0)
	{
		System.out.println("not a prime number");
	}
	else if(temp==0)
	{
		System.out.println("prime number");
	}

	}
}
